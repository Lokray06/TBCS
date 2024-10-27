package expTypes;

import lists.data.exp.SlowLookup;
import services.CalculateLevel;

public class Slow implements CalculateLevel
{
    SlowLookup table = new SlowLookup();

    @Override
    public byte calculateLevel (int exp)
    {
        return table.getLevelForExperience(exp);
    }

    @Override
    public int calculateExp (byte level)
    {
        return (int) table.getExperienceForLevel(level);
    }
}