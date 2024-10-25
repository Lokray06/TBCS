package expTypes;

import services.CalculateLevel;

public class Fluctuating implements CalculateLevel
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
    public int calculateEXP(byte level) {
        return level * 100 + (level - 1) * (level) * 50;
    }

    private int calculateExp (byte level)
    {
        if (level < 15)
        {
            return (int) (Math.pow(level, 3) * (((level+1)/3) + 24)) / (50);
        }
        else if (level < 36)
        {
            return (int) ((Math.pow(level, 3) * (level + 14)) / 50);
        }
        else
        {
            return (int) (Math.pow(level, 3) * ((level/2) + 32)) / (50);
        }
    }

}
