package lists.data;

import java.util.HashMap;

public class AttackCategories
{
    public static HashMap<Integer, String> types = new HashMap<Integer, String>();

    static
    {
        types.put(1, "Phisical");
        types.put(2, "Special");
        types.put(3, "State");
    }
}
