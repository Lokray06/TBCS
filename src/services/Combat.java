package services;

import lists.Party;
import services.menu.CombatMainMenu;
import services.menu.MenuInterface;

import java.util.Scanner;

public class Combat
{
    private CombatPrinter combatPrinter = new CombatPrinter();
    
    MenuInterface mainMenu = new CombatMainMenu();
    
    Scanner sc = new Scanner(System.in);
    
    private Party playerParty;
    private Party enemyParty;
    private boolean combatEnded = false;
    
    public Combat(Party playerParty, Party enemyParty)
    {
        this.playerParty = playerParty;
        this.enemyParty = enemyParty;
        
        combat();
    }
    
    private void combat()
    {
        do
        {
            // Display the pokemons
            combatPrinter.print(playerParty, enemyParty);
            
            //Display the main menu
            mainMenu.display();
            
            //Choose option
            mainMenu.choose(sc);
            
            checkWin();
            checkDefeat();
        }
        while(!combatEnded);
    }
    
    public void checkWin()
    {
        int faintedPokemons = 0;
        
        for (int i = 0; i < enemyParty.getLength(); i++)
        {
            // Check if the Pokemon at index i is not null
            if (enemyParty.getPokemon(i) != null && enemyParty.getPokemon(i).isFainted())
            {
                faintedPokemons++;
            }
            else if (enemyParty.getPokemon(i) == null) {
                System.out.println("Null Pokemon found at index " + i);
                // Optionally, handle this case if needed, such as skipping the iteration
            }
            else
            {
                break;
            }
        }
        
        if (faintedPokemons == enemyParty.getLength())
        {
            win();
        }
    }
    
    public void checkDefeat()
    {
        int faintedPokemons = 0;
        
        System.out.println(faintedPokemons);
        
        for (int i = 0; i < playerParty.getLength(); i++)
        {
            // Check if the Pokemon at index i is not null
            if (playerParty.getPokemon(i) != null && playerParty.getPokemon(i).isFainted())
            {
                faintedPokemons++;
            }
            else if (playerParty.getPokemon(i) == null) {
                System.out.println("Null Pokemon found at index " + i);
                // Optionally, handle this case if needed, such as skipping the iteration
            }
            else
            {
                break;
            }
        }
        
        if (faintedPokemons == playerParty.getLength())
        {
            lose();
        }
    }
    
    public void win()
    {
        combatEnded = true;
        System.out.println("You won");
    }
    
    public void lose()
    {
        combatEnded = true;
        System.out.println("You lose");
    }
    
    public void clear()
    {
    
    }
}