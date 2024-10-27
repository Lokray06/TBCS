package lists.data;

import java.util.HashMap;
import java.util.Map;

public class StatIndex
{
    public static final Map<String, Integer> statIndexMap = new HashMap<>();
    
    static {
        statIndexMap.put("HP", 0);
        statIndexMap.put("Attack", 1);
        statIndexMap.put("Defense", 2);
        statIndexMap.put("Sp. Atk", 3);
        statIndexMap.put("Sp. Def", 4);
        statIndexMap.put("Speed", 5);
    }
}