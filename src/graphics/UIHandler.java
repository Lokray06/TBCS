package graphics;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class UIHandler {
    public UIHandler()
    {
        // Apply FlatLaf look and feel
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 15);      // Rounded corners for buttons
        UIManager.put("Component.focusWidth", 1); // Thinner focus border
        
        SwingUtilities.invokeLater(UIHandler::createAndShowGUI);
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Modern Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        
        // Set an icon in the top-left corner
        frame.setIconImage(new ImageIcon("path/to/icon.png").getImage());
        
        // Create the menu bar with spacing
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu configMenu = new JMenu("Config");
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        frame.setJMenuBar(menuBar);
        
        // Tabs with content
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", createTabPanel());
        tabbedPane.addTab("Tab 2", createTabPanel());
        frame.add(tabbedPane, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
    
    private static JPanel createTabPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Left Panel (Party List and Buttons)
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        
        // Party List
        JList<String> partyList = new JList<>(new String[]{"Party Member 1", "Party Member 2"});
        partyList.setBorder(BorderFactory.createTitledBorder("Party"));
        leftPanel.add(partyList);
        
        // Buttons with rounded edges
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");
        JButton addRandomButton = new JButton("Add Random");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(addRandomButton);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        leftPanel.add(buttonPanel);
        
        panel.add(leftPanel, BorderLayout.WEST);
        
        // Right Panel (Editor)
        JPanel editorPanel = new JPanel();
        editorPanel.setLayout(new BoxLayout(editorPanel, BoxLayout.Y_AXIS));
        editorPanel.setBorder(BorderFactory.createTitledBorder("Editor"));
        editorPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Editor"),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        
        // Image placeholder with padding
        JLabel imageLabel = new JLabel(new ImageIcon("path/to/image.png"));
        imageLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        editorPanel.add(imageLabel);
        
        // Dropdown for selection
        JComboBox<String> dropdown = new JComboBox<>(new String[]{"Option 1", "Option 2"});
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
        
        panel.add(editorPanel, BorderLayout.CENTER);
        return panel;
    }
}
