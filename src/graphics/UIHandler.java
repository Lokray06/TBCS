package graphics;

import lists.Party;
import com.formdev.flatlaf.FlatLightLaf;
import lists.data.PokemonDatabase;
import pokemons.Pokemon;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import static lists.data.PokemonDatabase.pokedexData;

public class UIHandler {
    private static Pokemon selected = null; // Declare selected as a static variable

    public UIHandler() {
        // Apply FlatLaf look and feel
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 15);      // Rounded corners for buttons
        UIManager.put("Component.focusWidth", 1); // Thinner focus border

        SwingUtilities.invokeLater(UIHandler::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        Party playerParty = new Party(null);
        Party enemyParty = new Party(null);

        JFrame frame = new JFrame("Pokemon Combat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Set an icon in the top-left corner
        frame.setIconImage(new ImageIcon("path/to/icon.png").getImage());

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu configMenu = new JMenu("Config");
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        frame.setJMenuBar(menuBar);

        // Tabs with content
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Player's Party", createPartyPanel(playerParty));
        tabbedPane.addTab("Enemy's Party", createPartyPanel(enemyParty));
        tabbedPane.addTab("Arena", createArenaPanel());
        frame.add(tabbedPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static JPanel createPartyPanel(Party party) {
        String[] pokedex = new String[pokedexData.size() + 1]; // Include index 0
        pokedex[0] = "Select a Pokémon"; // Placeholder for selection
        for (int i = 1; i < pokedex.length; i++) {
            Map<String, String> data = pokedexData.get(i);
            pokedex[i] = data.get("name");
        }

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Left Panel (Party List and Buttons)
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        // Party List
        JList<String> partyList = new JList<>();
        partyList.setBorder(BorderFactory.createTitledBorder("Party"));
        leftPanel.add(new JScrollPane(partyList)); // Added JScrollPane for better usability

        // Selection listener to update selected Pokémon
        partyList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int index = partyList.getSelectedIndex();
                    if (index != -1) {
                        selected = party.getPokemon(index); // Update selected Pokémon
                    }
                }
            }
        });

        // Buttons with rounded edges
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 2, 2));
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");
        JButton addRandomButton = new JButton("Add Random");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(addRandomButton);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        leftPanel.add(buttonPanel);

        addButton.addActionListener(actionEvent -> {
            // Assuming the 'add()' method adds a Pokémon to the party
            party.add();
            updateData(partyList, party); // Pass the list to update
        });

        removeButton.addActionListener(actionEvent -> {
            if (selected != null) { // Ensure selected is not null
                party.remove(selected);
                updateData(partyList, party); // Pass the list to update
                selected = null; // Clear selection after removal
            }
        });

        panel.add(leftPanel, BorderLayout.WEST);

        // Right Panel (Editor)
        JPanel editorPanel = createEditorPanel(pokedex);
        panel.add(editorPanel, BorderLayout.CENTER);

        return panel;
    }

    private static void updateData(JList<String> partyList, Party party) {
        String[] listOfPokemons = new String[party.getLength()];
        for (int i = 0; i < party.getLength(); i++) {
            listOfPokemons[i] = party.getPokemon(i).getName();
        }
        partyList.setListData(listOfPokemons); // Correctly update the JList's data
    }

    private static JPanel createEditorPanel(String[] pokedex) {
        JPanel editorPanel = new JPanel();
        editorPanel.setLayout(new BoxLayout(editorPanel, BoxLayout.Y_AXIS));
        editorPanel.setBorder(BorderFactory.createTitledBorder("Editor"));

        // Image placeholder with padding
        JLabel imageLabel = new JLabel(new ImageIcon("path/to/image.png"));
        imageLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        editorPanel.add(imageLabel);

        // Dropdown for selection
        JComboBox<String> dropdown = new JComboBox<>(pokedex);
        editorPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        editorPanel.add(dropdown);

        // Nickname Checkbox with conditional TextField
        JCheckBox nicknameCheckBox = new JCheckBox("Nickname");
        JTextField nicknameField = new JTextField();
        nicknameField.setEnabled(false);
        nicknameCheckBox.addActionListener(e -> nicknameField.setEnabled(nicknameCheckBox.isSelected()));
        editorPanel.add(nicknameCheckBox);
        editorPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        editorPanel.add(nicknameField);

        // Gender Toggle Button
        JButton genderButton = new JButton("M");
        genderButton.addActionListener(e -> genderButton.setText(genderButton.getText().equals("M") ? "F" : "M"));
        editorPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        editorPanel.add(genderButton);

        // Shiny Checkbox
        JCheckBox shinyCheckBox = new JCheckBox("Is Shiny");
        editorPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        editorPanel.add(shinyCheckBox);

        // Byte Dropdown (1 to 100)
        JComboBox<Byte> byteDropdown = new JComboBox<>();
        for (byte i = 1; i <= 100; i++) {
            byteDropdown.addItem(i);
        }
        editorPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        editorPanel.add(byteDropdown);

        // Integer TextField
        JTextField intField = new JTextField();
        editorPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        editorPanel.add(intField);

        // Advanced Checkbox
        JCheckBox advancedCheckBox = new JCheckBox("Advanced");
        editorPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        editorPanel.add(advancedCheckBox);

        return editorPanel;
    }

    private static JPanel createArenaPanel() {
        // Todo: Implement arena panel
        JPanel panel = new JPanel();
        return panel;
    }
}
