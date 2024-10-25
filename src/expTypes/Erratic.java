package expTypes;

import services.CalculateLevel;

public class Erratic implements CalculateLevel
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
        return (level*level) * 100;
    }

    private int calculateExp (byte level)
    {
        if (level < 50)
        {
            return (int) ((Math.pow(level, 3) * (100 - level)) / 50);
        }
        else if (level < 68)
        {
            return (int) ((Math.pow(level, 3) * (150 - level)) / 100);
        }
        else if (level < 98)
        {
            return (int) ((Math.pow(level, 3) * Math.floor((1911-10*level))/3))/500;
        }
        else
        {
            return (int) ((Math.pow(level, 3) * (160 - level)) / 100);
        }
    }
}