package services;

import lists.Nature;

public interface StatsCalculatorInterface
{
    public int calculateHP(Integer[] base, Integer[] IV, Integer[] EV, byte level);
    public int calculateStat(Integer[] base, Integer[] IV, Integer[] EV, byte level, byte stat, Nature nature);
}