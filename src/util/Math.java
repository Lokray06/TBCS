package util;

import model.Nature;

import static java.lang.Math.floor;

public class Math
{
    public static double random()
    {
        return java.lang.Math.random();
    }
    public static double numberToRange(double number, double oldMin, double oldMax, double newMin, double newMax)
    {
        double n;
        double oldRange = (oldMax - oldMin);
        double newRange;

        if (oldRange == 0)
            n = newMin;
        else
        {
            newRange = (newMax - newMin);
            n = (((number - oldMin) * newRange) / oldRange) + newMin;
        }
        return n;
    }
    
    public static int calculateStat(int[] base, int[] IV, int[] EV, int level, byte stat, Nature nature)
    {
        double natureMultiplier = nature.getMultiplier(stat);
        return (int) ((floor(0.01 * (2 * base[stat] + IV[stat] + floor(0.25 * EV[stat])) * level) + 5) * natureMultiplier);
    }
    
    public static int calculateHP(int[] base, int[] IV, int[] EV, int level)
    {
        return (int) (floor(0.01 * (2 * base[0] + IV[0] + floor(0.25 * EV[0])) * level) + level + 10);
    }
}