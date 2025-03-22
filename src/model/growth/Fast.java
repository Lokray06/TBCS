package model.growth;

import model.growth.lookup.FastLookup;
import util.CalculateLevel;

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