package objects;

import java.util.ArrayList;

import pokemons.PokemonOld;

public class PokemonManager
{
    public static ArrayList<PokemonOld> pokemons = new ArrayList<PokemonOld>();

    public static PokemonOld search(int id)
    {
        for(int i = 0; i < pokemons.size(); i++)
        {
            PokemonOld pokemon = pokemons.get(i);
            if(pokemon.getId(pokemon) == id)
            {
                return pokemon;
            }
        }

        return null;
    }
}