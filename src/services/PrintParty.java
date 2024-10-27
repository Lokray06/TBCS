package services;

import pokemons.Pokemon;

public class PrintParty
{
    PrintPokemon printer = new PrintPokemon();
    
    public void print(Pokemon[] party)
    {
        for(Pokemon pokemon : party)
        {
            printer.print(pokemon);
        }
    }
}
