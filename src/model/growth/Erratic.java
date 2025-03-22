package model.growth;

import model.growth.lookup.ErraticLookup;
import util.CalculateLevel;

public class Erratic implements CalculateLevel
{
    ErraticLookup table = new ErraticLookup();

    @Override
    public byte calculateLevel (int exp)
    {
        return table.getLevelForExperience(exp);
    }

    @Override
    public int calculateExp(byte level)
    {
        return (int) table.getExperienceForLevel(level);
    }
}