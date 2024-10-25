package expTypes;

import lists.exp.MediumSlowLookup;
import services.CalculateLevel;

public class MediumSlow implements CalculateLevel
{
    @Override
    public byte calculateLevel(int exp)
    {
        MediumSlowLookup table = new MediumSlowLookup();
        return table.getLevelForExperience(exp);
    }

    @Override
    public int calculateEXP(byte level)
    {
        return (int)(1.2*(Math.pow(level,3)) - 15*(Math.pow(level, 2)) + 100*level - 140);
    }

    private int calculateExp (byte level)
    {
        return (int) ((int) (((double) 6 / 5) * Math.pow(level, 3))-(15 * Math.pow(level, 2))+(100 * level)-140);
    }
}