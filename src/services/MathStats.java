package services;

import lists.data.Nature;

public class MathStats
{
    public int calculateHP(int[] base, int[] IV, int[] EV, int level)
    {
        int hp = (int) (Math.floor(0.01 * (2 * base[0] + IV[0] + Math.floor(0.25 * EV[0])) * level) + level + 10);
        return hp;
    }
    
    public int calculateStat(int[] base, int[] IV, int[] EV, int level, byte stat, Nature nature)
    {
        double natureMultiplier = nature.getMultiplier(stat);
        int result = (int) ((Math.floor(0.01 * (2 * base[stat] + IV[stat] + Math.floor(0.25 * EV[stat])) * level) + 5) * natureMultiplier);
        return result;
    }
}