package main;

import lists.Party;
import pokemons.Pokemon;
import services.PrintParty;
import services.PrintPokemon;

public class Main
{
    static PrintParty printer = new PrintParty();
    
    public static void main(String[] args)
    {
        Pokemon pokemon1 = new Pokemon(1);
        Pokemon pokemon2 = new Pokemon(448);
        Pokemon pokemon3 = new Pokemon(525);
        
        Party playerParty = new Party(pokemon1, pokemon2, pokemon3);
        
        printer.print(playerParty.getPokemons());
    }
}