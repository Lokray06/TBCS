package model.growth;

import model.growth.lookup.MediumSlowLookup;
import util.CalculateLevel;

public class MediumSlow implements CalculateLevel
{
    MediumSlowLookup table = new MediumSlowLookup();

    @Override
    public byte calculateLevel(int exp)
    {
        return table.getLevelForExperience(exp);
    }

    @Override
    public int calculateExp (byte level)
    {
        return (int) table.getExperienceForLevel(level);
    }
}