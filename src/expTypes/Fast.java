package expTypes;

import lists.data.exp.FastLookup;
import services.CalculateLevel;

public class Fast implements CalculateLevel
{
    FastLookup table = new FastLookup();

    @Override
    public byte calculateLevel (int exp)
    {
        return table.getLevelForExperience(exp);
    }

    public int calculateExp (byte level)
    {
        return (int) table.getExperienceForLevel(level);
    }
}