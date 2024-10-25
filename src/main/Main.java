package main;

import expTypes.*;
import pokemons.Pokemon;
import services.CalculateLevel;
import services.PrintInterface;
import services.PrintPokemonImplementation;

public class Main
{
    public static void main(String[] args)
    {
        PrintInterface pokemonPrinter = new PrintPokemonImplementation();

        CalculateLevel erratic = new Erratic();
        CalculateLevel fast = new Fast();
        CalculateLevel fluctuating = new Fluctuating();
        CalculateLevel medFast = new MediumFast();
        CalculateLevel medSlow = new MediumSlow();
        CalculateLevel slow = new Slow();

        Pokemon pokemon = new Pokemon(1);
        pokemon.addExp(1000000);
        pokemonPrinter.print(pokemon);

		/*
		System.out.println(a);
		a = fast.calculateLevel(800000);
		System.out.println(a);
		a = fluctuating.calculateLevel(1640000);
		System.out.println(a);
		a = medFast.calculateLevel(1000000);
		System.out.println(a);
		a = medSlow.calculateLevel(1059860);
		System.out.println(a);

		System.out.println(erratic.calculateEXP((byte)100));
		System.out.println(fast.calculateEXP((byte)100));
		System.out.println(fluctuating.calculateEXP((byte)100));
		System.out.println(medFast.calculateEXP((byte)100));
		System.out.println(medSlow.calculateEXP((byte)100));
		System.out.println(slow.calculateEXP((byte)100));
		*/
    }
}