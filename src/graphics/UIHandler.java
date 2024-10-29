package graphics;

import lists.Party;
import pokemons.Pokemon;
import services.Combat;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class UIHandler extends Frame {
    
    // For displaying Pokémon in the UI
    private java.awt.List enemyListDisplay = new java.awt.List();
    private java.awt.List playerListDisplay = new java.awt.List();
    
    // For holding Pokémon objects in memory
    private List<Pokemon> enemyPartyList = new ArrayList<>();
    private List<Pokemon> playerPartyList = new ArrayList<>();
    
    public UIHandler() {
        setTitle("Pokémon Combat Setup");
        setSize(600, 500);
        setLayout(new GridLayout(3, 1));
        
        // Panel for enemy party setup
        Panel enemyPanel = new Panel(new BorderLayout());
        enemyPanel.add(new Label("Enemy Party"), BorderLayout.NORTH);
        enemyPanel.add(enemyListDisplay, BorderLayout.CENTER);
        
        Panel enemyInputPanel = createPokemonInputPanel(enemyPartyList, enemyListDisplay);
        enemyPanel.add(enemyInputPanel, BorderLayout.SOUTH);
        
        // Panel for player party setup
        Panel playerPanel = new Panel(new BorderLayout());
        playerPanel.add(new Label("Player Party"), BorderLayout.NORTH);
        playerPanel.add(playerListDisplay, BorderLayout.CENTER);
        
        Panel playerInputPanel = createPokemonInputPanel(playerPartyList, playerListDisplay);
        playerPanel.add(playerInputPanel, BorderLayout.SOUTH);
        
        // Start combat button
        Button startCombatBtn = new Button("Start Combat");
        startCombatBtn.addActionListener(e -> {
            Party enemyParty = createParty(enemyPartyList);
            Party playerParty = createParty(playerPartyList);
            Combat combat = new Combat(enemyParty, playerParty);
            //combat.start();  // Adjust based on your Combat class's actual start method
        });
        
        // Add panels to the main frame
        add(enemyPanel);
        add(playerPanel);
        add(startCombatBtn);
        
        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        setVisible(true);
    }
    
    private Panel createPokemonInputPanel(List<Pokemon> partyList, java.awt.List listDisplay) {
        Panel inputPanel = new Panel(new GridLayout(1, 5));
        
        TextField dexnumField = new TextField("DexNum");
        TextField nicknameField = new TextField("Nickname");
        TextField genreField = new TextField("Genre");
        TextField expField = new TextField("Exp");
        Checkbox isHiddenCheckbox = new Checkbox("Hidden");
        
        Button addPokemonBtn = new Button("Add");
        addPokemonBtn.addActionListener(e -> {
            try {
                int dexnum = Integer.parseInt(dexnumField.getText());
                String nickname = nicknameField.getText();
                String genre = genreField.getText();
                int exp = Integer.parseInt(expField.getText());
                boolean isHidden = isHiddenCheckbox.getState();
                
                if (partyList.size() < 6) {
                    Pokemon pokemon = new Pokemon(dexnum, nickname, genre, exp, isHidden);
                    partyList.add(pokemon);
                    listDisplay.add(nickname);
                } else {
                    System.out.println("Party is full!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number format!");
            }
        });
        
        inputPanel.add(dexnumField);
        inputPanel.add(nicknameField);
        inputPanel.add(genreField);
        inputPanel.add(expField);
        inputPanel.add(isHiddenCheckbox);
        inputPanel.add(addPokemonBtn);
        
        return inputPanel;
    }
    
    private Party createParty(List<Pokemon> pokemonList) {
        switch (pokemonList.size()) {
            case 1: return new Party(pokemonList.get(0));
            case 2: return new Party(pokemonList.get(0), pokemonList.get(1));
            case 3: return new Party(pokemonList.get(0), pokemonList.get(1), pokemonList.get(2));
            case 4: return new Party(pokemonList.get(0), pokemonList.get(1), pokemonList.get(2), pokemonList.get(3));
            case 5: return new Party(pokemonList.get(0), pokemonList.get(1), pokemonList.get(2), pokemonList.get(3), pokemonList.get(4));
            case 6: return new Party(pokemonList.get(0), pokemonList.get(1), pokemonList.get(2), pokemonList.get(3), pokemonList.get(4), pokemonList.get(5));
            default: throw new IllegalArgumentException("A party must have at least one Pokémon.");
        }
    }
}
