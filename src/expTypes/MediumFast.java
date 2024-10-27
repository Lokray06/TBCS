package expTypes;

import lists.data.exp.MediumFastLookup;
import services.CalculateLevel;

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