package services;

import lists.Nature;

public class MathS implements StatsCalculatorInterface
{
    @Override
    public int calculateHP(Integer[] base, Integer[] IV, Integer[] EV, byte level)
    {
        int hp = (int) (Math.floor(0.01 * (2 * base[0] + IV[0] + Math.floor(0.25 * EV[0])) * level) + level + 10);
        return hp;
    }

    @Override
    public int calculateStat(Integer[] base, Integer[] IV, Integer[] EV, byte level, byte stat, Nature nature)
    {
        double natureMultiplier = nature.getMultiplier(stat);
        int result = (int) ((Math.floor(0.01 * (2 * base[stat] + IV[stat] + Math.floor(0.25 * EV[stat])) * level) + 5) * natureMultiplier);
        return result;
    }
}