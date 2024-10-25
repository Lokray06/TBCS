package pokemons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import expTypes.*;
import lists.Nature;
import lists.Pokedex;
import lists.PokemonDatabase;
import lists.Stats;
import objects.Attack;
import objects.PokemonHolder;
import objects.PokemonManager;
import services.CalculateLevel;
import services.MathS;
import services.StatsCalculatorInterface;

public class Pokemon
{
    StatsCalculatorInterface mathS = new MathS();
    services.Random random = new services.Random();
    lists.PokemonDatabase db = new PokemonDatabase();

    // Misc
    private final int id;
    private PokemonHolder pokemon;

    // Pokemon
    private int pokedexNumber;
    private final String defaultName;
    private String setName;
    private final byte[] types = new byte[2];
    private Nature nature; // Use Nature object instead of just an int
    private int natureId; // Use Nature object instead of just an int
    private byte level = 1;
    private int ability;
    private int exp = 0;
    private int expType = 0;

    // Pokemon Stats
    private Integer[] baseStats = new Integer[6];
    private final Integer[] IV = new Integer[6];
    private Integer[] EV = new Integer[6];
    private Integer[] stats = new Integer[6];

    // Attacks
    private ArrayList<Attack> attacks = new ArrayList<>();

    public Pokemon(int pokedexNumber)
    {
        this.pokedexNumber = pokedexNumber;
        this.defaultName = Pokedex.pokedex.get(pokedexNumber);

        setup();
        update();

        // Look up the pokedexNumber based on the defaultName in the Pokedex map
        for (Map.Entry<Integer, String> entry : Pokedex.pokedex.entrySet())
        {
            if (entry.getValue().equals(defaultName))
            {
                this.pokedexNumber = entry.getKey();
                break;
            }
        }

        // Add the new Pokemon to the PokemonManager
        this.id = PokemonManager.pokemons.size();
        PokemonManager.pokemons.add(this);
    }

    private void setup()
    {
        pokemon = db.pokemons.get(pokedexNumber-1);
        setNature();
        setBaseStats();
        setIV();
        setEV();
        setTypes();
        setAbility();
        setExpType();
        addExp(0);
    }

    public void update()
    {
        updateStats();
        setLevel((byte)expType);
    }

    public void setBaseStats ()
    {
        baseStats = Stats.baseStats.get(defaultName);
    }

    public String getName ()
    {
        if (setName == null)
        {
            return defaultName;
        }
        else
        {
            return setName;
        }
    }

    public int getLevel ()
    {
        return this.level;
    }

    public int getExp()
    {
        return this.exp;
    }

    public void setLevel(byte expType)
    {
        switch (expType)
        {
            case 1:
                CalculateLevel erratic = new Erratic();
                this.level = erratic.calculateLevel(exp);
                break;
            case 2:
                CalculateLevel fast = new Fast();
                this.level = fast.calculateLevel(exp);
                break;
            case 3:
                CalculateLevel fluctuating = new Fluctuating();
                this.level = fluctuating.calculateLevel(exp);
                break;
            case 4:
                CalculateLevel medFast = new MediumFast();
                this.level = medFast.calculateLevel(exp);
                break;
            case 5:
                CalculateLevel medSlow = new MediumSlow();
                this.level = medSlow.calculateLevel(exp);
                break;
            case 6:
                CalculateLevel slow = new Slow();
                this.level = slow.calculateLevel(exp);
                break;
        }
    }

    public String getDefaultName ()
    {
        return defaultName;
    }

    public int getId (Pokemon pokemon)
    {
        return pokemon.id;
    }

    public void addExp(int exp)
    {
        this.exp += exp;
        update();
    }

    public void setExpType()
    {
        this.expType = pokemon.getExpType();
    }

    public int getExpType()
    {
        return this.expType;
    }

    public void setTypes()
    {
        int[] typesArray = pokemon.getTypes();
        types[0] = (byte) typesArray[0];
        if(typesArray.length > 1)
        {
            types[1] = (byte) typesArray[1];
        }
    }
    public int getType (int i)
    {
        return types[i];
    }

    public int getPokedexNumber ()
    {
        return pokedexNumber;
    }

    public void setAbility()
    {
        ////Can return hidden ability.
        byte range = (byte) pokemon.getNumberOfHabilities();
        byte abilityIndex = random.inRange((byte)range);
        ability = pokemon.getStats()[abilityIndex];
    }

    public int getAbility()
    {
        return ability;
    }

    public Integer[] getbaseStats ()
    {
        return baseStats;
    }

    public void setIV ()
    {
        for(int i = 0; i < IV.length; i++)
        {
            IV[i] = (int) random.IV();
        }
    }

    public Integer[] getIV ()
    {
        return IV;
    }

    public void addEV(int stat, int ev)
    {
        EV[stat] += ev;
        updateStats();
    }

    public void setEV ()
    {
        Arrays.fill(EV, 0);
    }

    public Integer[] getEV ()
    {
        return EV;
    }

    public Nature getNature ()
    {
        updateStats();
        return nature;
    }

    public void setNature()
    {
        natureId = random.nature();
        this.nature = Nature.getNatureById(natureId);
    }

    public int getNatureId ()
    {
        return natureId;
    }

    public void updateStats ()
    {
        stats[0] = mathS.calculateHP(baseStats, IV, EV, level);
        for (int i = 1; i < stats.length; i++)
        {
            stats[i] = mathS.calculateStat(baseStats, IV, EV, level, (byte) i, nature);
        }
    }

    public Integer[] getStats ()
    {
        return stats;
    }

//	public float attack(Attack attack)
//	{
//		float damage = 0;
//		return damage;
//	}
}