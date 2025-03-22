package util;

import model.Pokemon;

public class Printer
{
    public static void printParty(Pokemon[] party)
    {
        for(Pokemon pokemon : party)
        {
            printPokemon(pokemon);
        }
    }
    public static void printPokemon(Pokemon pokemon)
    {
        pokemon.updateData();
        
        String[] abilities = pokemon.getAbilities();
        int id = pokemon.getId();
        
        int dexnum = pokemon.getDexnum();
        int level = pokemon.getLevel();
        String type1 = pokemon.getType1();
        String type2 = pokemon.getType2();
        int exp = pokemon.getExp();
        String growthRate = pokemon.getGrowthRate();
        
        char genreSymbol = pokemon.getGenreSymbol();
        String abilityString = pokemon.getAbility();
        String name = pokemon.getNickname();
        String nature = pokemon.getNatureString();
        
        int[] stats = pokemon.getStats();
        int[] baseStats = pokemon.getBase();
        int[] IV = pokemon.getIv();
        int[] EV = pokemon.getEv();
        int[] EVYield = pokemon.getEvYield();
        
        System.out.println("ID: " + id + ", SID: " + "//TODO");
        
        // POKEDEX Nº, NAME, EXP, LVL, GROWRATE
        System.out.println("Nº: " + dexnum + ", Pokemon: " + name + " , Genre: " + genreSymbol);
        System.out.println("Exp: " + exp + ", Lvl: " + level + ", Growth rate: " + growthRate);
        
        // TYPES
        System.out.println("Type: " + type1 + ", " + type2 + ".");
        
        System.out.println("Ability: " + abilityString);
        // ABILITY
        System.out.println();
        
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
        System.out.println("EV Yield: ");
        printArray(EVYield);
        
    }
    
    private static void printArray(int[] array)
    {
        for(Integer integer : array)
        {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.print("\n\n");
    }
}