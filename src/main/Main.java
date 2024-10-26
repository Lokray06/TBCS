package main;

import pokemons.Pokemon;
import services.PrintPokemon;

public class Main
{
    static PrintPokemon pokemonPrinter = new PrintPokemon();

    public static void main(String[] args)
    {
        Pokemon pokemon = new Pokemon(46);
        pokemonPrinter.print(pokemon);
    }
}