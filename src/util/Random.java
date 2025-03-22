package util;

public class Random
{
    public static byte IV()
    {
        return (byte) inRange(0, 31);
    }

    public static byte nature()
    {
        double ran = Math.random();
        byte n = (byte)(java.lang.Math.floor(1 + (25 - 1) * ran));
        return n;
    }
    
    public static int inRange(int min, int max)
    {
        double ran = Math.random();
        return (int)(min + (max - min) * ran);
    }
    
    public static float inRange(float min, float max)
    {
        double ran = Math.random();
        return (float) (min + (max - min) * ran);
    }
    
    public static String ability(String[] abilities)
    {
        double ran = Math.random();
        int newRan = (int) Math.numberToRange(ran, 0, 1, 0, abilities.length);

        return abilities[newRan];
    }
}