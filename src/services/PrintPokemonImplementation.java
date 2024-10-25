package services;

import lists.Abilities;
import lists.EXPTypes;
import lists.Nature;
import lists.Types;
import pokemons.Pokemon;

public class PrintPokemonImplementation implements PrintInterface
{
    @Override
    public void print (Pokemon pokemon)
    {
        int id = pokemon.getId(pokemon);
        int level = pokemon.getLevel();
        int pokedexNumber = pokemon.getPokedexNumber();
        int idType1 = pokemon.getType(0);
        int idType2 = pokemon.getType(1);
        int ability = pokemon.getAbility();
        int expType = pokemon.getExpType();
        int exp = pokemon.getExp();

        String abilityString = Abilities.abilities.get(ability);
        String name = pokemon.getName();
        String type1 = Types.types.get(idType1);
        String type2 = Types.types.get(idType2);
        String nature = Nature.getNatureName(pokemon.getNatureId());
        String expTypeString = EXPTypes.EXPTypes.get(expType);

        Integer[] stats = pokemon.getStats();
        Integer[] baseStats = pokemon.getbaseStats();
        Integer[] IV = pokemon.getIV();
        Integer[] EV = pokemon.getEV();

        System.out.println("ID: " + id + ", SID: " + "//TODO");

        // POKEDEX Nº, NAME, EXP, LVL, GROWRATE
        System.out.println("Nº: " + pokedexNumber + ", Pokemon: " + name + ", Exp: " + exp +", Lvl: " + level + ", Grow rate type: " + expTypeString);

        // TYPES
        System.out.println("Type: " + type1 + ", " + type2 + ".");

        // ABILITY
        System.out.println("Ability: " + abilityString);

        // NATURE
        System.out.println("Nature: " + nature);

        // STATS
        System.out.println("Stats:");
        printArray(stats);
        System.out.println("Base: ");
        printArray(baseStats);
        System.out.println("IV: ");
        printArray(IV);
        System.out.println("EV: ");
        printArray(EV);

    }

    private void printArray (Integer[] array)
    {
        for (Integer integer : array) {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.print("\n\n");
    }
}