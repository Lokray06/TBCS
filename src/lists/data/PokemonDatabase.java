package lists.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PokemonDatabase
{
    public static final Map<Integer, Map<String, String>> pokedexData = new HashMap<>();
    
    // Define a mapping of stat names to their corresponding index
    private static final Map<String, Integer> statIndexMap = new HashMap<>();
    
    static {
        statIndexMap.put("HP", 0);
        statIndexMap.put("Attack", 1);
        statIndexMap.put("Defense", 2);
        statIndexMap.put("Sp. Atk", 3);
        statIndexMap.put("Sp. Def", 4);
        statIndexMap.put("Speed", 5);
    }
    
    static {
        // Load the data when the class is first used
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\java\\TBCS1\\src\\lists\\data\\database1.csv"))) {
            String line = br.readLine(); // Skip headers
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int dexnum = Integer.parseInt(values[0].replaceAll("\"", ""));
                Map<String, String> data = new HashMap<>();
                data.put("dexnum", values[0].replaceAll("\"", ""));
                data.put("name", values[1].replaceAll("\"", ""));
                data.put("generation", values[2].replaceAll("\"", ""));
                data.put("type1", values[3].replaceAll("\"", ""));
                data.put("type2", values[4].replaceAll("\"", ""));
                data.put("species", values[5].replaceAll("\"", ""));
                data.put("height", values[6].replaceAll("\"", ""));
                data.put("weight", values[7].replaceAll("\"", ""));
                data.put("ability1", values[8].replaceAll("\"", ""));
                data.put("ability2", values[9].replaceAll("\"", ""));
                data.put("hidden_ability", values[10].replaceAll("\"", ""));
                data.put("hp", values[11].replaceAll("\"", ""));
                data.put("attack", values[12].replaceAll("\"", ""));
                data.put("defense", values[13].replaceAll("\"", ""));
                data.put("sp_atk", values[14].replaceAll("\"", ""));
                data.put("sp_def", values[15].replaceAll("\"", ""));
                data.put("speed", values[16].replaceAll("\"", ""));
                data.put("total", values[17].replaceAll("\"", ""));
                
                // Handle ev_yield properly
                String evYield = values[18].replaceAll("\"", "").trim();
                data.put("ev_yield", evYield);
                
                // Process the EV yield to create the EV array
                int[] evArray = new int[6]; // HP, Attack, Defense, Sp. Atk, Sp. Def, Speed
                
                // Regular expression to capture EV yield value and stat
                Pattern pattern = Pattern.compile("(\\d+)\\s+([A-Za-z. ]+)");
                Matcher matcher = pattern.matcher(evYield);
                
                // Process each match in the evYield string
                while (matcher.find()) {
                    int value = Integer.parseInt(matcher.group(1));
                    String stat = matcher.group(2).trim();
                    Integer index = statIndexMap.get(stat);
                    
                    // Update the respective index in the evArray if the stat is valid
                    if (index != null) {
                        evArray[index] += value; // Add to the index
                    }
                }
                
                // Store the evArray back into the data map for later use if needed
                data.put("ev_array", evArrayToString(evArray)); // Store as a string representation
                
                data.put("catch_rate", values[19].replaceAll("\"", ""));
                data.put("base_friendship", values[20].replaceAll("\"", ""));
                data.put("base_exp", values[21].replaceAll("\"", ""));
                data.put("growth_rate", values[22].replaceAll("\"", ""));
                data.put("egg_group1", values[23].replaceAll("\"", ""));
                data.put("egg_group2", values[24].replaceAll("\"", ""));
                data.put("percent_male", values[25].replaceAll("\"", ""));
                data.put("percent_female", values[26].replaceAll("\"", ""));
                data.put("egg_cycles", values[27].replaceAll("\"", ""));
                data.put("special_group", values[28].replaceAll("\"", ""));
                
                pokedexData.put(dexnum, data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Helper method to convert the EV array to a string for storage in the map
    private static String evArrayToString(int[] evArray) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < evArray.length; i++) {
            sb.append(evArray[i]);
            if (i < evArray.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
