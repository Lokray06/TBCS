package main;

import lists.Party;
import pokemons.Pokemon;
import services.Combat;
import services.CombatPrinter;
import services.PrintParty;

public class Main
{
    public static PrintParty printer = new PrintParty();

    public static void main(String[] args)
    {
        Pokemon pokemon1 = new Pokemon(448, "PERRO", "female",100000, true);
        Pokemon pokemon2 = new Pokemon(48,  100000);
        
        Party playerParty = new Party(pokemon1, pokemon2, pokemon1);
        Party enemyParty = new Party(pokemon2);
        printer.print(playerParty.getPokemonsNotNull());
        
        Combat combat = new Combat(playerParty, enemyParty);
    }
}