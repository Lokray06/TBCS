package model.growth;

import model.growth.lookup.FluctuatingLookup;
import util.CalculateLevel;

public class Fluctuating implements CalculateLevel
{
    FluctuatingLookup table = new FluctuatingLookup();

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
