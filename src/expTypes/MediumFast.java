package expTypes;

import services.CalculateLevel;

public class MediumFast implements CalculateLevel
{

    @Override
    public byte calculateLevel (int exp)
    {
        for (byte level = 1; level <= 100; level++)
        {
            int expAtLevel = calculateExp(level);
            if (exp < expAtLevel)
            {
                return (byte) (level - 1);
            }
        }
        return 100; // Max level
    }

    @Override
    public int calculateEXP(byte level)
    {
        return (int)Math.pow(level, 3);
    }

    private int calculateExp (byte level)
    {
        return (int) Math.pow(level, 3);
    }
}