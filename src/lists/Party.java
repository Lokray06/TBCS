package lists;

import pokemons.Pokemon;

public class Party
{
    Pokemon[] pokemons;
    
    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3)
    {
        pokemons = new Pokemon[3];
        pokemons[0] = pokemon1;
        pokemons[1] = pokemon2;
        pokemons[2] = pokemon3;
    }
    
    public Pokemon[] getPokemons()
    {
        return pokemons;
    }
    
    public Pokemon getPokemon(int index)
    {
        return pokemons[index];
    }
}
