package objects;

import java.util.ArrayList;

import pokemons.Pokemon;

public class PokemonManager
{
    public static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    public static Pokemon search(int id)
    {
        for(int i = 0; i < pokemons.size(); i++)
        {
            Pokemon pokemon = pokemons.get(i);
            if(pokemon.getId(pokemon) == id)
            {
                return pokemon;
            }
        }

        return null;
    }
}