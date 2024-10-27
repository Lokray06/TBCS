package expTypes;

import lists.data.exp.ErraticLookup;
import services.CalculateLevel;

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