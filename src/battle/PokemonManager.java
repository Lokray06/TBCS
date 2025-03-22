package battle;

import model.Pokemon;

import java.util.ArrayList;

public class PokemonManager
{
    public static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    public static Pokemon search(int id)
    {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getId() == id) {
                return pokemon;
            }
        }

        return null;
    }
}