package lists;

import pokemons.Pokemon;

public class Party
{
    Pokemon[] pokemons;
    
    public Party(Pokemon pokemon1)
    {
        this(pokemon1, null, null, null, null, null);
    }
    public Party(Pokemon pokemon1, Pokemon pokemon2)
    {
        this(pokemon1, pokemon2, null, null, null, null);
    }
    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3)
    {
        this(pokemon1, pokemon2, pokemon3, null, null, null);
    }
    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4)
    {
        this(pokemon1, pokemon2, pokemon3, pokemon4, null, null);
    }
    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4, Pokemon pokemon5)
    {
        this(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, null);
    }
    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4, Pokemon pokemon5, Pokemon pokemon6)
    {
        pokemons = new Pokemon[6];
        pokemons[0] = pokemon1;
        pokemons[1] = pokemon2;
        pokemons[2] = pokemon3;
        pokemons[3] = pokemon4;
        pokemons[4] = pokemon5;
        pokemons[5] = pokemon6;
    }
    
    public Pokemon[] getPokemons()
    {
        return pokemons;
    }

    public Pokemon[] getPokemonsNotNull()
    {
        int length = this.getLength();
        Pokemon[] pokemons = new Pokemon[length];
        for(int i = 0; i < pokemons.length; i++)
        {
            pokemons[i] = getPokemon(i);
        }
        return pokemons;
    }
    
    public Pokemon getPokemon(int index)
    {
        return pokemons[index];
    }
    
    public int getLength()
    {
        int length = 0;
        for(int i = 0; i < this.getPokemons().length; i++)
        {
            Pokemon pokemon = this.getPokemon(i);

            if(pokemon != null)
            {
                length ++;
            }
        }
        return length;
    }
}
