package main;

import pokemons.Pokemon;
import services.PrintInterface;
import services.PrintPokemonImplementation;

public class Main
{
    public static void main(String[] args)
    {
        PrintInterface pokemonPrinter = new PrintPokemonImplementation();

        Pokemon pokemon = new Pokemon(12);
        pokemon.addExp(1000000);
        pokemonPrinter.print(pokemon);

    }
}