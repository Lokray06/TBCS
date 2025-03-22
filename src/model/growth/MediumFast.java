package model.growth;

import model.growth.lookup.MediumFastLookup;
import util.CalculateLevel;

public class MediumFast implements CalculateLevel
{
    MediumFastLookup table = new MediumFastLookup();

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