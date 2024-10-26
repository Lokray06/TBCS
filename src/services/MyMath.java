package services;

public class MyMath
{
    public double numberToRange(double number, double oldMin, double oldMax, double newMin, double newMax)
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
}