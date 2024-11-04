package graphics;

import lists.Party;
import com.formdev.flatlaf.FlatLightLaf;
import pokemons.Pokemon;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.Map;

import static lists.data.PokemonDatabase.pokedexData;

public class UIHandlerOld
{
    private static Pokemon selected = null;
    
    public UIHandlerOld()
    {
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 15);
        UIManager.put("Component.focusWidth", 1);
        
        SwingUtilities.invokeLater(UIHandlerOld::createAndShowGUI);
    }
    
    private static void createAndShowGUI()
    {
        Party playerParty = new Party(null);
        Party enemyParty = new Party(null);
        
        JFrame frame = new JFrame("Pokemon Battle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(new BorderLayout());
        
        frame.setIconImage(new ImageIcon("src//sprites//battle//null.png").getImage());
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu configMenu = new JMenu("Config");
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        frame.setJMenuBar(menuBar);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Player's Party", createPartyPanel(playerParty));
        tabbedPane.addTab("Enemy's Party", createPartyPanel(enemyParty));
        tabbedPane.addTab("Arena", createArenaPanel());
        frame.add(tabbedPane, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
    
    private static JPanel createPartyPanel(Party party)
    {
        String[] pokedex = new String[pokedexData.size() + 1];
        pokedex[0] = "Select a Pokémon";
        for (int i = 1; i < pokedex.length; i++)
        {
            Map<String, String> data = pokedexData.get(i);
            pokedex[i] = data.get("name");
        }
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        
        JList<String> partyList = new JList<>();
        partyList.setBorder(BorderFactory.createTitledBorder("Party"));
        leftPanel.add(new JScrollPane(partyList));
        
        partyList.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                if (!e.getValueIsAdjusting())
                {
                    int index = partyList.getSelectedIndex();
                    if (index != -1)
                    {
                        selected = party.getPokemon(index);
                    }
                }
            }
        });
        
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JButton removeButton = new JButton("Remove");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(removeButton, gbc);
        
        JButton addRandomButton = new JButton("Add Random");
        gbc.gridy = 1;
        buttonPanel.add(addRandomButton, gbc);
        
        JButton addButton = new JButton("Add");
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(addButton, gbc);
        
        leftPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        leftPanel.add(buttonPanel);
        
        addButton.addActionListener(actionEvent -> {
            party.add();
            updateData(partyList, party);
        });
        
        removeButton.addActionListener(actionEvent -> {
            if (selected != null)
            {
                party.remove(selected);
                updateData(partyList, party);
                selected = null;
            }
        });
        
        panel.add(leftPanel, BorderLayout.WEST);
        
        JPanel editorPanel = createEditorPanel(pokedex);
        panel.add(editorPanel, BorderLayout.CENTER);
        
        return panel;
    }
    
    private static void updateData(JList<String> partyList, Party party)
    {
        String[] listOfPokemons = new String[party.getLength()];
        for (int i = 0; i < party.getLength(); i++)
        {
            listOfPokemons[i] = party.getPokemon(i).getName();
        }
        partyList.setListData(listOfPokemons);
    }
    
    private static JPanel createEditorPanel(String[] pokedex)
    {
        JPanel editorPanel = new JPanel(new GridBagLayout());
        editorPanel.setBorder(BorderFactory.createTitledBorder("Editor"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel imageLabel = new JLabel(new ImageIcon("src/res/sprites/battle/null.png"));
        imageLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        editorPanel.add(imageLabel, gbc);
        
        gbc.gridy++;
        gbc.gridwidth = 1;
        JComboBox<String> dropdown = new JComboBox<>(pokedex);
        editorPanel.add(dropdown, gbc);
        
        gbc.gridy++;
        JCheckBox nicknameCheckBox = new JCheckBox("Nickname");
        editorPanel.add(nicknameCheckBox, gbc);
        
        gbc.gridx++;
        JTextField nicknameField = new JTextField(10);
        nicknameField.setEnabled(false);
        nicknameCheckBox.addActionListener(e -> nicknameField.setEnabled(nicknameCheckBox.isSelected()));
        editorPanel.add(nicknameField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        JButton genderButton = new JButton("M");
        genderButton.addActionListener(e -> genderButton.setText(genderButton.getText().equals("M") ? "F" : "M"));
        editorPanel.add(genderButton, gbc);
        
        gbc.gridx++;
        JCheckBox shinyCheckBox = new JCheckBox("Shiny");
        editorPanel.add(shinyCheckBox, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        JComboBox<Byte> byteDropdown = new JComboBox<>();
        for (byte i = 1; i <= 100; i++)
        {
            byteDropdown.addItem(i);
        }
        editorPanel.add(byteDropdown, gbc);
        
        gbc.gridx++;
        JTextField intField = new JTextField(10);
        editorPanel.add(intField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        JCheckBox advancedCheckBox = new JCheckBox("Advanced");
        editorPanel.add(advancedCheckBox, gbc);
        
        gbc.gridx = 1;
        gbc.gridy++;
        gbc.gridwidth = 1;
        JPanel advancedPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        JTextField testField1 = new JTextField("Advanced Field 1", 10);
        JTextField testField2 = new JTextField("Advanced Field 2", 10);
        testField1.setEnabled(false);
        testField2.setEnabled(false);
        advancedPanel.add(testField1);
        advancedPanel.add(testField2);
        editorPanel.add(advancedPanel, gbc);
        
        advancedCheckBox.addActionListener(e -> {
            boolean isEnabled = advancedCheckBox.isSelected();
            testField1.setEnabled(isEnabled);
            testField2.setEnabled(isEnabled);
        });
        
        return editorPanel;
    }
    
    private static JPanel createArenaPanel()
    {
        JPanel panel = new JPanel();
        return panel;
    }
}
