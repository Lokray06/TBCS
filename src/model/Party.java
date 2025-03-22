package model;

public class Party
{
    private Pokemon[] pokemons = new Pokemon[6];
    
    public Party(Pokemon... pokemons)
    {
        for(int i = 0; i < pokemons.length; i++)
        {
            if(i == 6) break;
            this.pokemons[i] = pokemons[i];
        }
    }
    
    public Pokemon[] getPokemons()
    {
        return pokemons;
    }
    
    public Pokemon[] getPokemonsNotNull()
    {
        int length = this.getLength();
        Pokemon[] notNullPokemons = new Pokemon[length];
        int index = 0;
        for(Pokemon pokemon : pokemons)
        {
            if(pokemon != null)
            {
                notNullPokemons[index++] = pokemon;
            }
        }
        return notNullPokemons;
    }
    
    public Pokemon getPokemon(int index)
    {
        return pokemons[index];
    }
    
    public int getLength()
    {
        int length = 0;
        for(Pokemon pokemon : pokemons)
        {
            if(pokemon != null)
            {
                length++;
            }
        }
        return length;
    }
    
    public void add()
    {
        for(int i = 0; i < pokemons.length; i++)
        {
            if(pokemons[i] == null)
            {
                pokemons[i] = new Pokemon(448); // Example Pokémon ID
                return;
            }
        }
        System.out.println("Cannot add more Pokémon. Party is full.");
    }
    
    public void remove(Pokemon selected)
    {
        for(int i = 0; i < pokemons.length; i++)
        {
            if(pokemons[i] != null && pokemons[i].equals(selected))
            { // Use .equals to match the Pokémon
                pokemons[i] = null; // Set to null to remove it
                System.out.println("Removed Pokémon: " + selected.getName()); // Optional: Notify about removal
                return;
            }
        }
        System.out.println("Pokémon not found in the party.");
    }
}
