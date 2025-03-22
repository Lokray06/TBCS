package model.growth;

import model.growth.lookup.SlowLookup;
import util.CalculateLevel;

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