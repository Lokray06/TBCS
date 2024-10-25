package lists;

import java.util.HashMap;

public class EXPTypes
{
    public static HashMap<Integer, String> EXPTypes = new HashMap<Integer, String>();

    static
    {
        EXPTypes.put(1, "Erratic");
        EXPTypes.put(2, "Fast");
        EXPTypes.put(3, "Fluctuating");
        EXPTypes.put(4, "MediumFast");
        EXPTypes.put(5, "MediumSlow");
        EXPTypes.put(6, "Slow");
    }
}
