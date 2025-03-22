package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PokemonDatabase
{
    public static final Map<Integer, Map<String, String>> pokedexData = new HashMap<>();
    
    static
    {
        // Load the data when the class is first used
        try(BufferedReader br = new BufferedReader(new FileReader("res/database1.csv")))
        {
            String line = br.readLine(); // Skip headers
            while((line = br.readLine()) != null)
            {
                // Split by commas not inside quotes
                String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                
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
                data.put("ev_yield", values[18].replaceAll("\"", ""));
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
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}