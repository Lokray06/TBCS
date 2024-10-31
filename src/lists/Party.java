package lists;

import pokemons.Pokemon;

public class Party {
    private Pokemon[] pokemons;

    public Party(Pokemon pokemon1) {
        this(pokemon1, null, null, null, null, null);
    }

    public Party(Pokemon pokemon1, Pokemon pokemon2) {
        this(pokemon1, pokemon2, null, null, null, null);
    }

    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3) {
        this(pokemon1, pokemon2, pokemon3, null, null, null);
    }

    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4) {
        this(pokemon1, pokemon2, pokemon3, pokemon4, null, null);
    }

    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4, Pokemon pokemon5) {
        this(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, null);
    }

    public Party(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4, Pokemon pokemon5, Pokemon pokemon6) {
        pokemons = new Pokemon[6];
        pokemons[0] = pokemon1;
        pokemons[1] = pokemon2;
        pokemons[2] = pokemon3;
        pokemons[3] = pokemon4;
        pokemons[4] = pokemon5;
        pokemons[5] = pokemon6;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public Pokemon[] getPokemonsNotNull() {
        int length = this.getLength();
        Pokemon[] notNullPokemons = new Pokemon[length];
        int index = 0;
        for (Pokemon pokemon : pokemons) {
            if (pokemon != null) {
                notNullPokemons[index++] = pokemon;
            }
        }
        return notNullPokemons;
    }

    public Pokemon getPokemon(int index) {
        return pokemons[index];
    }

    public int getLength() {
        int length = 0;
        for (Pokemon pokemon : pokemons) {
            if (pokemon != null) {
                length++;
            }
        }
        return length;
    }

    public void add() {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                pokemons[i] = new Pokemon(448); // Example Pokémon ID
                return;
            }
        }
        System.out.println("Cannot add more Pokémon. Party is full.");
    }

    public void remove(Pokemon selected) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null && pokemons[i].equals(selected)) { // Use .equals to match the Pokémon
                pokemons[i] = null; // Set to null to remove it
                System.out.println("Removed Pokémon: " + selected.getName()); // Optional: Notify about removal
                return;
            }
        }
        System.out.println("Pokémon not found in the party.");
    }
}
