package services;

import pokemons.Pokemon;

public class PrintPokemon
{
    public void print (Pokemon pokemon)
    {
        pokemon.updateData();

        int id = pokemon.getId();

        int dexnum = pokemon.getDexnum();
        int level = pokemon.getLevel();
        String type1 = pokemon.getType1();
        String type2 = pokemon.getType2();
        int exp = pokemon.getExp();
        String growthRate = pokemon.getGrowthRate();

        String abilityString = pokemon.getAbility();
        String name = pokemon.getName();
        String nature = pokemon.getNatureString();

        int[] stats = pokemon.getStats();
        int[] baseStats = pokemon.getBase();
        int[] IV = pokemon.getIv();
        int[] EV = pokemon.getEv();

        System.out.println("ID: " + id + ", SID: " + "//TODO");

        // POKEDEX Nº, NAME, EXP, LVL, GROWRATE
        System.out.println("Nº: " + dexnum + ", Pokemon: " + name + ", Exp: " + exp +", Lvl: " + level + ", Growth rate: " + growthRate);

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

    private void printArray (int[] array)
    {
        for (Integer integer : array) {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.print("\n\n");
    }
}