package lists;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PokemonDatabase
{
    // Store Pokémon data
    public static Map<Integer, Map<String, String>> pokedexData = new HashMap<>();

<<<<<<<< HEAD:src/lists/PokemonDatabaseOld.java
public class PokemonDatabaseOld {
    public static List<PokemonHolder> pokemons;

    public PokemonDatabaseOld() {
        pokemons = new ArrayList<>();

        // Generation I
        pokemons.add(new PokemonHolder(1, "Bulbasaur", new int[]{5, 8}, new int[]{65}, (byte)5));
        pokemons.add(new PokemonHolder(2, "Ivysaur", new int[]{5, 8}, new int[]{65}, (byte)5));
        pokemons.add(new PokemonHolder(3, "Venusaur", new int[]{5, 8}, new int[]{65}, (byte)5));
        pokemons.add(new PokemonHolder(4, "Charmander", new int[]{2}, new int[]{66}, (byte)5));
        pokemons.add(new PokemonHolder(5, "Charmeleon", new int[]{2}, new int[]{66}, (byte)5));
        pokemons.add(new PokemonHolder(6, "Charizard", new int[]{2, 10}, new int[]{66}, (byte)5));
        pokemons.add(new PokemonHolder(7, "Squirtle", new int[]{3}, new int[]{67}, (byte)5));
        pokemons.add(new PokemonHolder(8, "Wartortle", new int[]{3}, new int[]{67}, (byte)5));
        pokemons.add(new PokemonHolder(9, "Blastoise", new int[]{3}, new int[]{67}, (byte)5));
        pokemons.add(new PokemonHolder(10, "Caterpie", new int[]{12}, new int[]{19}, (byte)2));
        pokemons.add(new PokemonHolder(11, "Metapod", new int[]{12}, new int[]{61}, (byte)2));
        pokemons.add(new PokemonHolder(12, "Butterfree", new int[]{12, 10}, new int[]{14}, (byte)5));
        pokemons.add(new PokemonHolder(13, "Weedle", new int[]{12, 8}, new int[]{38}, (byte)2));
        pokemons.add(new PokemonHolder(14, "Kakuna", new int[]{12, 8}, new int[]{61}, (byte)2));
        pokemons.add(new PokemonHolder(15, "Beedrill", new int[]{12, 8}, new int[]{68}, (byte)5));
        pokemons.add(new PokemonHolder(16, "Pidgey", new int[]{1, 10}, new int[]{51}, (byte)5));
        pokemons.add(new PokemonHolder(17, "Pidgeotto", new int[]{1, 10}, new int[]{51}, (byte)5));
        pokemons.add(new PokemonHolder(18, "Pidgeot", new int[]{1, 10}, new int[]{51}, (byte)5));
        pokemons.add(new PokemonHolder(19, "Rattata", new int[]{1}, new int[]{50}, (byte)2));
        pokemons.add(new PokemonHolder(20, "Raticate", new int[]{1}, new int[]{50}, (byte)2));
        pokemons.add(new PokemonHolder(21, "Spearow", new int[]{1, 10}, new int[]{51}, (byte)5));
        pokemons.add(new PokemonHolder(22, "Fearow", new int[]{1, 10}, new int[]{51}, (byte)5));
        pokemons.add(new PokemonHolder(23, "Ekans", new int[]{8}, new int[]{22}, (byte)6));
        pokemons.add(new PokemonHolder(24, "Arbok", new int[]{8}, new int[]{22}, (byte)6));
        pokemons.add(new PokemonHolder(25, "Pikachu", new int[]{4}, new int[]{9}, (byte)5));
        pokemons.add(new PokemonHolder(26, "Raichu", new int[]{4}, new int[]{9}, (byte)5));
        pokemons.add(new PokemonHolder(27, "Sandshrew", new int[]{9}, new int[]{8}, (byte)5));
        pokemons.add(new PokemonHolder(28, "Sandslash", new int[]{9}, new int[]{8}, (byte)5));
        pokemons.add(new PokemonHolder(29, "Nidoran♀", new int[]{8}, new int[]{38}, (byte)5));
        pokemons.add(new PokemonHolder(30, "Nidorina", new int[]{8}, new int[]{38}, (byte)5));
        pokemons.add(new PokemonHolder(31, "Nidoqueen", new int[]{8, 9}, new int[]{38}, (byte)5));
        pokemons.add(new PokemonHolder(32, "Nidoran♂", new int[]{8}, new int[]{38}, (byte)5));
        pokemons.add(new PokemonHolder(33, "Nidorino", new int[]{8}, new int[]{38}, (byte)5));
        pokemons.add(new PokemonHolder(34, "Nidoking", new int[]{8, 9}, new int[]{38}, (byte)5));
        pokemons.add(new PokemonHolder(35, "Clefairy", new int[]{18}, new int[]{56}, (byte)5));
        pokemons.add(new PokemonHolder(36, "Clefable", new int[]{18}, new int[]{56}, (byte)5));
        pokemons.add(new PokemonHolder(37, "Vulpix", new int[]{2}, new int[]{18}, (byte)5));
        pokemons.add(new PokemonHolder(38, "Ninetales", new int[]{2}, new int[]{18}, (byte)5));
        pokemons.add(new PokemonHolder(39, "Jigglypuff", new int[]{1, 18}, new int[]{56}, (byte)5));
        pokemons.add(new PokemonHolder(40, "Wigglytuff", new int[]{1, 18}, new int[]{56}, (byte)5));
        pokemons.add(new PokemonHolder(41, "Zubat", new int[]{8, 10}, new int[]{39}, (byte)6));
        pokemons.add(new PokemonHolder(42, "Golbat", new int[]{8, 10}, new int[]{39}, (byte)6));
        pokemons.add(new PokemonHolder(43, "Oddish", new int[]{5, 8}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(44, "Gloom", new int[]{5, 8}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(45, "Vileplume", new int[]{5, 8}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(46, "Paras", new int[]{12, 5}, new int[]{27}, (byte)6));
        pokemons.add(new PokemonHolder(47, "Parasect", new int[]{12, 5}, new int[]{27}, (byte)6));
        pokemons.add(new PokemonHolder(48, "Venonat", new int[]{12, 8}, new int[]{19}, (byte)6));
        pokemons.add(new PokemonHolder(49, "Venomoth", new int[]{12, 8}, new int[]{19}, (byte)6));
        pokemons.add(new PokemonHolder(50, "Diglett", new int[]{9}, new int[]{8}, (byte)5));
        pokemons.add(new PokemonHolder(51, "Dugtrio", new int[]{9}, new int[]{8}, (byte)5));
        pokemons.add(new PokemonHolder(52, "Meowth", new int[]{1}, new int[]{53}, (byte)2));
        pokemons.add(new PokemonHolder(53, "Persian", new int[]{1}, new int[]{53}, (byte)2));
        pokemons.add(new PokemonHolder(54, "Psyduck", new int[]{3}, new int[]{6}, (byte)5));
        pokemons.add(new PokemonHolder(55, "Golduck", new int[]{3}, new int[]{6}, (byte)5));
        pokemons.add(new PokemonHolder(56, "Mankey", new int[]{7}, new int[]{72}, (byte)5));
        pokemons.add(new PokemonHolder(57, "Primeape", new int[]{7}, new int[]{72}, (byte)5));
        pokemons.add(new PokemonHolder(58, "Growlithe", new int[]{2}, new int[]{22}, (byte)6));
        pokemons.add(new PokemonHolder(59, "Arcanine", new int[]{2}, new int[]{22}, (byte)6));
        pokemons.add(new PokemonHolder(60, "Poliwag", new int[]{3}, new int[]{11}, (byte)5));
        pokemons.add(new PokemonHolder(61, "Poliwhirl", new int[]{3}, new int[]{11}, (byte)5));
        pokemons.add(new PokemonHolder(62, "Poliwrath", new int[]{3, 7}, new int[]{11}, (byte)5));
        pokemons.add(new PokemonHolder(63, "Abra", new int[]{11}, new int[]{28}, (byte)2));
        pokemons.add(new PokemonHolder(64, "Kadabra", new int[]{11}, new int[]{28}, (byte)2));
        pokemons.add(new PokemonHolder(65, "Alakazam", new int[]{11}, new int[]{28}, (byte)2));
        pokemons.add(new PokemonHolder(66, "Machop", new int[]{7}, new int[]{62}, (byte)5));
        pokemons.add(new PokemonHolder(67, "Machoke", new int[]{7}, new int[]{62}, (byte)5));
        pokemons.add(new PokemonHolder(68, "Machamp", new int[]{7}, new int[]{62}, (byte)5));
        pokemons.add(new PokemonHolder(69, "Bellsprout", new int[]{5, 8}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(70, "Weepinbell", new int[]{5, 8}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(71, "Victreebel", new int[]{5, 8}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(72, "Tentacool", new int[]{3, 8}, new int[]{29}, (byte)5));
        pokemons.add(new PokemonHolder(73, "Tentacruel", new int[]{3, 8}, new int[]{29}, (byte)5));
        pokemons.add(new PokemonHolder(74, "Geodude", new int[]{6, 9}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(75, "Graveler", new int[]{6, 9}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(76, "Golem", new int[]{6, 9}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(77, "Ponyta", new int[]{2}, new int[]{50}, (byte)5));
        pokemons.add(new PokemonHolder(78, "Rapidash", new int[]{2}, new int[]{50}, (byte)5));
        pokemons.add(new PokemonHolder(79, "Slowpoke", new int[]{3, 11}, new int[]{12}, (byte)5));
        pokemons.add(new PokemonHolder(80, "Slowbro", new int[]{3, 11}, new int[]{12}, (byte)5));
        pokemons.add(new PokemonHolder(81, "Magnemite", new int[]{13}, new int[]{42}, (byte)2));
        pokemons.add(new PokemonHolder(82, "Magneton", new int[]{13}, new int[]{42}, (byte)2));
        pokemons.add(new PokemonHolder(83, "Farfetch'd", new int[]{1, 10}, new int[]{51}, (byte)5));
        pokemons.add(new PokemonHolder(84, "Doduo", new int[]{1, 10}, new int[]{48}, (byte)5));
        pokemons.add(new PokemonHolder(85, "Dodrio", new int[]{1, 10}, new int[]{48}, (byte)5));
        pokemons.add(new PokemonHolder(86, "Seel", new int[]{3}, new int[]{47}, (byte)5));
        pokemons.add(new PokemonHolder(87, "Dewgong", new int[]{3, 15}, new int[]{47}, (byte)5));
        pokemons.add(new PokemonHolder(88, "Grimer", new int[]{8}, new int[]{1}, (byte)6));
        pokemons.add(new PokemonHolder(89, "Muk", new int[]{8}, new int[]{1}, (byte)6));
        pokemons.add(new PokemonHolder(90, "Shellder", new int[]{3}, new int[]{75}, (byte)5));
        pokemons.add(new PokemonHolder(91, "Cloyster", new int[]{3, 15}, new int[]{75}, (byte)5));
        pokemons.add(new PokemonHolder(92, "Gastly", new int[]{8, 11}, new int[]{26}, (byte)6));
        pokemons.add(new PokemonHolder(93, "Haunter", new int[]{8, 11}, new int[]{26}, (byte)6));
        pokemons.add(new PokemonHolder(94, "Gengar", new int[]{8, 11}, new int[]{26}, (byte)6));
        pokemons.add(new PokemonHolder(95, "Onix", new int[]{6, 9}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(96, "Drowzee", new int[]{11}, new int[]{39}, (byte)5));
        pokemons.add(new PokemonHolder(97, "Hypno", new int[]{11}, new int[]{39}, (byte)5));
        pokemons.add(new PokemonHolder(98, "Krabby", new int[]{3}, new int[]{52}, (byte)5));
        pokemons.add(new PokemonHolder(99, "Kingler", new int[]{3}, new int[]{52}, (byte)5));
        pokemons.add(new PokemonHolder(100, "Voltorb", new int[]{13}, new int[]{43}, (byte)2));
        pokemons.add(new PokemonHolder(101, "Electrode", new int[]{13}, new int[]{43}, (byte)2));
        pokemons.add(new PokemonHolder(102, "Exeggcute", new int[]{5, 11}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(103, "Exeggutor", new int[]{5, 11}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(104, "Cubone", new int[]{6}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(105, "Marowak", new int[]{6}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(106, "Hitmonlee", new int[]{7}, new int[]{62}, (byte)5));
        pokemons.add(new PokemonHolder(107, "Hitmonchan", new int[]{7}, new int[]{62}, (byte)5));
        pokemons.add(new PokemonHolder(108, "Lickitung", new int[]{1}, new int[]{20}, (byte)5));
        pokemons.add(new PokemonHolder(109, "Koffing", new int[]{8}, new int[]{26}, (byte)5));
        pokemons.add(new PokemonHolder(110, "Weezing", new int[]{8}, new int[]{26}, (byte)5));
        pokemons.add(new PokemonHolder(111, "Rhyhorn", new int[]{6, 9}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(112, "Rhydon", new int[]{6, 9}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(113, "Chansey", new int[]{1}, new int[]{30}, (byte)5));
        pokemons.add(new PokemonHolder(114, "Tangela", new int[]{5}, new int[]{34}, (byte)5));
        pokemons.add(new PokemonHolder(115, "Kangaskhan", new int[]{1}, new int[]{52}, (byte)5));
        pokemons.add(new PokemonHolder(116, "Horsea", new int[]{3}, new int[]{33}, (byte)5));
        pokemons.add(new PokemonHolder(117, "Seadra", new int[]{3}, new int[]{33}, (byte)5));
        pokemons.add(new PokemonHolder(118, "Goldeen", new int[]{3}, new int[]{33}, (byte)5));
        pokemons.add(new PokemonHolder(119, "Seaking", new int[]{3}, new int[]{33}, (byte)5));
        pokemons.add(new PokemonHolder(120, "Staryu", new int[]{3}, new int[]{35}, (byte)5));
        pokemons.add(new PokemonHolder(121, "Starmie", new int[]{3, 11}, new int[]{35}, (byte)5));
        pokemons.add(new PokemonHolder(122, "Mr. Mime", new int[]{11}, new int[]{43}, (byte)5));
        pokemons.add(new PokemonHolder(123, "Scyther", new int[]{1, 10}, new int[]{68}, (byte)5));
        pokemons.add(new PokemonHolder(124, "Jynx", new int[]{15, 11}, new int[]{56}, (byte)5));
        pokemons.add(new PokemonHolder(125, "Electabuzz", new int[]{13}, new int[]{43}, (byte)5));
        pokemons.add(new PokemonHolder(126, "Magmar", new int[]{2}, new int[]{49}, (byte)5));
        pokemons.add(new PokemonHolder(127, "Pinsir", new int[]{10}, new int[]{52}, (byte)5));
        pokemons.add(new PokemonHolder(128, "Tauros", new int[]{1}, new int[]{52}, (byte)5));
        pokemons.add(new PokemonHolder(129, "Magikarp", new int[]{3}, new int[]{33}, (byte)1));
        pokemons.add(new PokemonHolder(130, "Gyarados", new int[]{3, 10}, new int[]{33}, (byte)6));
        pokemons.add(new PokemonHolder(131, "Lapras", new int[]{3, 15}, new int[]{75}, (byte)5));
        pokemons.add(new PokemonHolder(132, "Ditto", new int[]{1}, new int[]{7}, (byte)1));
        pokemons.add(new PokemonHolder(133, "Eevee", new int[]{1}, new int[]{50}, (byte)5));
        pokemons.add(new PokemonHolder(134, "Vaporeon", new int[]{3}, new int[]{11}, (byte)5));
        pokemons.add(new PokemonHolder(135, "Jolteon", new int[]{13}, new int[]{43}, (byte)5));
        pokemons.add(new PokemonHolder(136, "Flareon", new int[]{2}, new int[]{49}, (byte)5));
        pokemons.add(new PokemonHolder(137, "Porygon", new int[]{1}, new int[]{88}, (byte)5));
        pokemons.add(new PokemonHolder(138, "Omanyte", new int[]{6, 3}, new int[]{4}, (byte)5));
        pokemons.add(new PokemonHolder(139, "Omastar", new int[]{6, 3}, new int[]{4}, (byte)5));
        pokemons.add(new PokemonHolder(140, "Kabuto", new int[]{6, 3}, new int[]{4}, (byte)5));
        pokemons.add(new PokemonHolder(141, "Kabutops", new int[]{6, 3}, new int[]{4}, (byte)5));
        pokemons.add(new PokemonHolder(142, "Aerodactyl", new int[]{6, 10}, new int[]{69}, (byte)5));
        pokemons.add(new PokemonHolder(143, "Snorlax", new int[]{1}, new int[]{17}, (byte)6));
        pokemons.add(new PokemonHolder(144, "Articuno", new int[]{15, 10}, new int[]{68}, (byte)7));
        pokemons.add(new PokemonHolder(145, "Zapdos", new int[]{13, 10}, new int[]{43}, (byte)7));
        pokemons.add(new PokemonHolder(146, "Moltres", new int[]{2, 10}, new int[]{49}, (byte)7));
        pokemons.add(new PokemonHolder(147, "Dratini", new int[]{14}, new int[]{61}, (byte)6));
        pokemons.add(new PokemonHolder(148, "Dragonair", new int[]{14}, new int[]{61}, (byte)6));
        pokemons.add(new PokemonHolder(149, "Dragonite", new int[]{14, 10}, new int[]{61}, (byte)6));
        pokemons.add(new PokemonHolder(150, "Mewtwo", new int[]{11}, new int[]{39}, (byte)7));
        pokemons.add(new PokemonHolder(151, "Mew", new int[]{11}, new int[]{39}, (byte)7));
    }

    public List<PokemonHolder> getPokemons() {
        return pokemons;
========
    static {
        // Load the data when the class is first used
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\java\\TBCS1\\src\\lists\\database.csv"))) {
            br.readLine();
            String line; // skip headers
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int dexnum = Integer.parseInt(values[0].replaceAll("\"", ""));
                Map<String, String> data = new HashMap<>();
                data.put("dexnum", values[0].replaceAll("\"", "").trim());
                data.put("name", values[1].replaceAll("\"", "").trim());
                data.put("generation", values[2].replaceAll("\"", "").trim());
                data.put("type1", values[3].replaceAll("\"", "").trim());
                data.put("type2", values[4].replaceAll("\"", "").trim());
                data.put("species", values[5].replaceAll("\"", "").trim());
                data.put("height", values[6].replaceAll("\"", "").trim());
                data.put("weight", values[7].replaceAll("\"", "").trim());
                data.put("ability1", values[8].replaceAll("\"", "").trim());
                data.put("ability2", values[9].replaceAll("\"", "").trim());
                data.put("hidden_ability", values[10].replaceAll("\"", "").trim());
                data.put("hp", values[11].replaceAll("\"", "").trim());
                data.put("attack", values[12].replaceAll("\"", "").trim());
                data.put("defense", values[13].replaceAll("\"", "").trim());
                data.put("sp_atk", values[14].replaceAll("\"", "").trim());
                data.put("sp_def", values[15].replaceAll("\"", "").trim());
                data.put("speed", values[16].replaceAll("\"", "").trim());
                data.put("total", values[17].replaceAll("\"", "").trim());
                data.put("ev_yield", values[18].replaceAll("\"", "").trim());
                data.put("catch_rate", values[19].replaceAll("\"", "").trim());
                data.put("base_friendship", values[20].replaceAll("\"", "").trim());
                data.put("base_exp", values[21].replaceAll("\"", "").trim());
                data.put("growth_rate", values[22].replaceAll("\"", "").trim());
                data.put("egg_group1", values[23].replaceAll("\"", "").trim());
                data.put("egg_group2", values[24].replaceAll("\"", "").trim());
                data.put("percent_male", values[25].replaceAll("\"", "").trim());
                data.put("percent_female", values[26].replaceAll("\"", "").trim());
                data.put("egg_cycles", values[27].replaceAll("\"", "").trim());
                data.put("special_group", values[28].replaceAll("\"", "").trim());

                pokedexData.put(dexnum, data);
            }
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
>>>>>>>> 324e347 (5th commit i think, ive lost the count):src/lists/PokemonDatabase.java
    }
}