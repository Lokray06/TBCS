package main;

import lists.Party;
import pokemons.Pokemon;
import services.Combat;
import services.CombatPrinter;
import services.PrintParty;
import services.PrintPokemon;

import static lists.data.PokemonDatabase.pokedexData;

public class Main
{
    public static void main(String[] args)
    {
        Pokemon pokemon1 = new Pokemon(448, 100000);
        Pokemon pokemon2 = new Pokemon(48,  100000);
        
        Party playerParty = new Party(pokemon1);
        Party enemyParty = new Party(pokemon2);
        
        Combat combat = new Combat(playerParty, enemyParty);
    }
}