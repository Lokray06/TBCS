package expTypes;

import lists.exp.FluctuatingLookup;
import services.CalculateLevel;

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
