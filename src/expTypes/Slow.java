package expTypes;

import services.CalculateLevel;

public class Slow implements CalculateLevel
{

    @Override
    public byte calculateLevel (int exp)
    {
        return (byte) Math.ceil(Math.pow((exp / 1.25),(double)1/3));
    }

    @Override
    public int calculateEXP(byte level) {
        return (int)(1.25*(Math.pow(level,3)));
    }

    private int calculateExp (byte level)
    {
        return (int) (5 * Math.pow(level, 3))/4;
    }
}