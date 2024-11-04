package system;

import pokemons.Pokemon;
import lists.*;
import services.*;

import services.PrintParty;

public class Main
{
    public static void main(String[] args)
    {
        PrintParty printer = new PrintParty();
        graphics.Combat combatUI = new graphics.Combat();
        Pokemon pokemon1 = new Pokemon(448, "PERRO", "female",100000, true);
        Pokemon pokemon2 = new Pokemon(48,  100000);
        
        Party playerParty = new Party(pokemon1, pokemon2, pokemon1);
        Party enemyParty = new Party(pokemon2);
        printer.print(playerParty.getPokemonsNotNull());
        
        Combat combat = new Combat(playerParty, enemyParty);
        
        //NewJFrame ui = new NewJFrame();
    }
}