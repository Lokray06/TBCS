package lists;

import java.util.Arrays;

public class PokemonData {
    private int pokedexNumber;
    private String name;
    private Integer[] types;
    private Integer[] abilities;
    private String experienceType;

    public PokemonData(int pokedexNumber, String name, Integer[] types, Integer[] abilities, String experienceType) {
        this.pokedexNumber = pokedexNumber;
        this.name = name;
        this.types = types;
        this.abilities = abilities;
        this.experienceType = experienceType;
    }

    // Getters for all fields
    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public String getName() {
        return name;
    }

    public Integer[] getTypes() {
        return types;
    }

    public Integer[] getAbilities() {
        return abilities;
    }

    public String getExperienceType() {
        return experienceType;
    }

    // Override toString() to easily print all details
    @Override
    public String toString() {
        return "PokemonData{" +
                "pokedexNumber=" + pokedexNumber +
                ", name='" + name + '\'' +
                ", types=" + Arrays.toString(types) +
                ", abilities=" + Arrays.toString(abilities) +
                ", experienceType='" + experienceType + '\'' +
                '}';
    }
}
