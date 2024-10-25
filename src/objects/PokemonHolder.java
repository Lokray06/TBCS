package objects;

public class PokemonHolder
{
    private int id;
    private String name;
    private int[] types;
    private int[] stats;
    private int expType;

    public PokemonHolder(int id, String name, int[] types, int[] stats, int expType)
    {
        this.id = id;
        this.name = name;
        this.types = types;
        this.stats = stats;
        this.expType = expType;
    }

    // Getters
    public int getId ()
    {
        return id;
    }

    public String getName ()
    {
        return name;
    }

    public int[] getTypes ()
    {
        return types;
    }

    public int[] getStats ()
    {
        return stats;
    }

    public int getNumberOfHabilities()
    {
        return stats.length;
    }

    public int getExpType()
    {
        return expType;
    }
}