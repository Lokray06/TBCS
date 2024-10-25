package services;

public class Random
{
    public double random()
    {
        double n = Math.random();
        return n;
    }

    public byte IV()
    {
        double ran = Math.random();
        byte n = (byte)(Math.floor(0+(31-0)*ran));
        return n;
    }

    public byte nature()
    {
        double ran = Math.random();
        byte n = (byte)(Math.floor(1+(25-1)*ran));
        return n;
    }

    public byte inRange(byte range)
    {
        double ran = Math.random();
        byte n = (byte)(Math.floor(0+(range-0)*ran));
        return n;
    }
}