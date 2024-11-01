package graphics.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame
{
    
    private JTabbedPane main;
    private JPanel playerParty;
    private JPanel party;
    private JScrollPane partyContainer;
    private JList<String> partyList;
    private JButton remove;
    private JButton random;
    private JButton add;
    private JPanel editor;
    private JComboBox<String> species;
    private JCheckBox nicknameToggler;
    private JTextField nicknameTextfield;
    private JToggleButton genderToggler;
    private JCheckBox shinyToggler;
    private JLabel lvlLabel;
    private JComboBox<String> level;
    private JLabel expLabel;
    private JTextField expTextfield;
    private JCheckBox advancedToggler;
    private JPanel advanced;
    private Canvas pokemonDisplayer1;
    private JPanel playerInfoPanel;
    private JTextField expTextfield1;
    private JLabel expLabel1;
    private Canvas pokemonDisplayer;
    private JPanel arena;
    
    public NewJFrame()
    {
        this.setVisible(true);
        setTitle("Pokemon Battle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        main = new JTabbedPane();
        
        // Party Panel
        party = new JPanel();
        party.setBorder(BorderFactory.createTitledBorder("Party"));
        
        partyContainer = new JScrollPane();
        partyList = new JList<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"});
        partyContainer.setViewportView(partyList);
        
        remove = new JButton("Remove");
        remove.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                removeAction(evt);
            }
        });
        
        random = new JButton("Add random");
        random.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                addRandomAction(evt);
            }
        });
        
        add = new JButton("Add");
        add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                addAction(evt);
            }
        });
        
        party.setLayout(new BorderLayout());
        party.add(partyContainer, BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 5, 0));
        buttonPanel.add(add);
        buttonPanel.add(remove);
        buttonPanel.add(random);
        party.add(buttonPanel, BorderLayout.SOUTH);
        
        // Editor Panel
        editor = new JPanel();
        editor.setBorder(BorderFactory.createTitledBorder("Editor"));
        editor.setLayout(new BorderLayout());
        
        pokemonDisplayer1 = new Canvas();
        
        species = new JComboBox<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"});
        nicknameToggler = new JCheckBox("Nickname");
        nicknameTextfield = new JTextField("Nickname");
        genderToggler = new JToggleButton("M");
        shinyToggler = new JCheckBox("Is Shiny");
        
        lvlLabel = new JLabel("Lvl:");
        level = new JComboBox<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"});
        
        expLabel = new JLabel("Exp:");
        expTextfield = new JTextField("1-100");
        
        advancedToggler = new JCheckBox("Advanced");
        
        advanced = new JPanel();
        advanced.setBorder(BorderFactory.createTitledBorder("Advanced"));
        advanced.setLayout(new BorderLayout());
        
        JPanel editorPanel = new JPanel(new GridLayout(6, 2));
        editorPanel.add(nicknameToggler);
        editorPanel.add(nicknameTextfield);
        editorPanel.add(genderToggler);
        editorPanel.add(shinyToggler);
        editorPanel.add(lvlLabel);
        editorPanel.add(level);
        editorPanel.add(expLabel);
        editorPanel.add(expTextfield);
        editorPanel.add(advancedToggler);
        
        editor.add(pokemonDisplayer1, BorderLayout.WEST);
        editor.add(editorPanel, BorderLayout.CENTER);
        editor.add(advanced, BorderLayout.SOUTH);
        
        // Player Info Panel
        playerInfoPanel = new JPanel();
        playerInfoPanel.setBorder(BorderFactory.createTitledBorder("Player"));
        
        expTextfield1 = new JTextField("Name");
        expLabel1 = new JLabel("Trainer name:");
        
        playerInfoPanel.add(expLabel1);
        playerInfoPanel.add(expTextfield1);
        
        // Main Panel Layout
        playerParty = new JPanel(new BorderLayout());
        playerParty.add(party, BorderLayout.WEST);
        playerParty.add(editor, BorderLayout.CENTER);
        playerParty.add(playerInfoPanel, BorderLayout.EAST);
        
        main.addTab("Player", playerParty);
        
        // Arena Tab
        arena = new JPanel();
        main.addTab("Arena", arena);
        
        add(main);
        pack();
    }
    
    private void addAction(ActionEvent evt)
    {
        // Add action logic here
    }
    
    private void addRandomAction(ActionEvent evt)
    {
        // Add random action logic here
    }
    
    private void removeAction(ActionEvent evt)
    {
        // Remove action logic here
    }
}
