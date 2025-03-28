package model;

import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static model.PokemonDatabase.pokedexData;
import static util.Math.calculateHP;
import static util.Math.calculateStat;

import model.growth.*;
import battle.PokemonManager;
import util.CalculateLevel;
import util.Random;

public class Pokemon
{
    private int id;
    
    // Pokedex
    private int dexnum;
    private String name;
    private int gen;
    private String type1;
    private String type2;
    private String species;
    private double height;
    private double weight;
    
    // Abilities
    private String ability1;
    private String ability2;
    private String hiddenAbility;
    private String[] abilities;
    private String ability;
    private boolean isHiddenPokemon;
    
    // Instance specific
    private int natureId;
    private Nature nature;
    private String nickname;
    private int exp;
    private int hp;
    private String object;
    private int[] attacks = new int[4];
    private int level;
    private String genre;
    private char genreSymbol;
    private boolean isFainted;
    
    // Stats
    private int[] stats;
    
    //Base
    private int baseHp;
    private int baseAttack;
    private int baseDefense;
    private int baseSpAtck;
    private int baseSpDef;
    private int baseSpeed;
    private int baseTotal;  // = hp + attack + defense + spAtck + spDef + speed;
    private int[] base = new int[6];
    
    // IV
    private int ivHp;
    private int ivAttack;
    private int ivDefense;
    private int ivSpAtck;
    private int ivSpDef;
    private int ivSpeed;
    private final int[] iv = new int[6];
    
    // EV
    private int evHp;
    private int evAttack;
    private int evDefense;
    private int evSpAtck;
    private int evSpDef;
    private int evSpeed;
    private int[] ev = new int[6];
    private int[] evYield = new int[6];
    
    // Other
    private int catchRate;
    private int baseFriendship;
    private int baseExp;
    private String growthRate;
    private String eggGroup1;
    private String eggGroup2;
    private double probMale;
    private double female;
    private int eggCycles;
    private String specialGroup;
    
    public Pokemon(int dexnum, String nickname, String genre, int exp, boolean isHiddenPokemon)
    {
        Map<String, String> data = pokedexData.get(dexnum);
        
        if(data != null)
        {
            setId(PokemonManager.pokemons.size());
            
            //Instance specific
            setNature();
            setGenre(genre);
            setGenreSymbol();
            setNickname(nickname);
            setExp(exp);
            setIsHidden(isHiddenPokemon);
            
            // Pokedex
            setDexnum(Integer.parseInt(data.get("dexnum")));
            setName(data.get("name"));
            setGen(Integer.parseInt(data.get("generation")));
            setType1(data.get("type1"));
            setType2(data.get("type2"));
            setSpecies(data.get("species"));
            setHeight(Double.parseDouble(data.get("height")));
            setWeight(Double.parseDouble(data.get("weight")));
            
            // Abilities
            setAbility1(data.get("ability1"));
            setAbility2(data.get("ability2"));
            setHiddenAbility(data.get("hidden_ability"));
            setAbilities();
            setHiddenAbility(data.get("hidden_ability"));
            
            // Stats
            setBaseHp(Integer.parseInt(data.get("hp")));
            setBaseAttack(Integer.parseInt(data.get("attack")));
            setBaseTotal(Integer.parseInt(data.get("total")));
            setBaseDefense(Integer.parseInt(data.get("defense")));
            setBaseSpAtck(Integer.parseInt(data.get("sp_atk")));
            setBaseSpDef(Integer.parseInt(data.get("sp_def")));
            setBaseSpeed(Integer.parseInt(data.get("speed")));
            setBase(new int[]{baseHp, baseAttack, baseDefense, baseSpAtck, baseSpDef, baseSpeed});
            setIv();
            setEvYield();
            
            // Other
            setGrowthRate(data.get("growth_rate"));
            updateData();
        }
        else
        {
            System.out.println("No data found for pokemon Nº: " + dexnum);
        }
    }
    
    public Pokemon(int dexnum, int exp, String genre)
    {
        Map<String, String> data = pokedexData.get(dexnum);
        this(dexnum, data.get("name"), genre, exp, false);
    }
    
    public Pokemon(int dexnum, int exp)
    {
        Map<String, String> data = pokedexData.get(dexnum);
        this(dexnum, data.get("name"), "male", exp, false);
    }
    
    public Pokemon(int dexnum)
    {
        Map<String, String> data = pokedexData.get(dexnum);
        this(dexnum, data.get("name"), "male", 0, false);
    }
    
    public void updateData()
    {
        setLevel(updateLevel(growthRate));
        setStats(calculateStats());
        setHp(getBaseHp());
    }
    
    public int getDexnum()
    {
        return dexnum;
    }
    
    public void setDexnum(int dexnum)
    {
        this.dexnum = dexnum;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getGen()
    {
        return gen;
    }
    
    public void setGen(int gen)
    {
        this.gen = gen;
    }
    
    public String getType1()
    {
        return type1;
    }
    
    public void setType1(String type1)
    {
        this.type1 = type1;
    }
    
    public String getType2()
    {
        return type2;
    }
    
    public void setType2(String type2)
    {
        this.type2 = type2;
    }
    
    public String getSpecies()
    {
        return species;
    }
    
    public void setSpecies(String species)
    {
        this.species = species;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    public String getAbility1()
    {
        return ability1;
    }
    
    public void setAbility1(String ability1)
    {
        this.ability1 = ability1;
    }
    
    public String getAbility2()
    {
        return ability2;
    }
    
    public void setAbility2(String ability2)
    {
        this.ability2 = ability2;
    }
    
    public String getHiddenAbility()
    {
        return hiddenAbility;
    }
    
    public void setHiddenAbility(String hiddenAbility)
    {
        this.hiddenAbility = hiddenAbility;
    }
    
    public String getNickname()
    {
        if(nickname != null)
        {
            return nickname;
        }
        else
        {
            return name;
        }
    }
    
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }
    
    public int getHp()
    {
        return hp;
    }
    
    public void setHp(int hp)
    {
        this.hp = hp;
    }
    
    public String getObject()
    {
        return object;
    }
    
    public void setObject(String object)
    {
        this.object = object;
    }
    
    public int[] getAttacks()
    {
        return attacks;
    }
    
    public void setAttacks(int[] attacks)
    {
        this.attacks = attacks;
    }
    
    public int getBaseHp()
    {
        return baseHp;
    }
    
    public void setBaseHp(int baseHp)
    {
        this.baseHp = baseHp;
    }
    
    public int getBaseAttack()
    {
        return baseAttack;
    }
    
    public void setBaseAttack(int baseAttack)
    {
        this.baseAttack = baseAttack;
    }
    
    public int getBaseDefense()
    {
        return baseDefense;
    }
    
    public void setBaseDefense(int baseDefense)
    {
        this.baseDefense = baseDefense;
    }
    
    public int getBaseSpAtck()
    {
        return baseSpAtck;
    }
    
    public void setBaseSpAtck(int baseSpAtck)
    {
        this.baseSpAtck = baseSpAtck;
    }
    
    public int getBaseSpDef()
    {
        return baseSpDef;
    }
    
    public void setBaseSpDef(int baseSpDef)
    {
        this.baseSpDef = baseSpDef;
    }
    
    public int getBaseSpeed()
    {
        return baseSpeed;
    }
    
    public void setBaseSpeed(int baseSpeed)
    {
        this.baseSpeed = baseSpeed;
    }
    
    public int getBaseTotal()
    {
        return baseTotal;
    }
    
    public void setBaseTotal(int baseTotal)
    {
        this.baseTotal = baseTotal;
    }
    
    public int[] getBase()
    {
        return base;
    }
    
    public void setBase(int[] base)
    {
        this.base = base;
    }
    
    public int getIvHp()
    {
        return ivHp;
    }
    
    public void setIvHp(int ivHp)
    {
        this.ivHp = ivHp;
    }
    
    public int getIvAttack()
    {
        return ivAttack;
    }
    
    public void setIvAttack(int ivAttack)
    {
        this.ivAttack = ivAttack;
    }
    
    public int getIvDefense()
    {
        return ivDefense;
    }
    
    public void setIvDefense(int ivDefense)
    {
        this.ivDefense = ivDefense;
    }
    
    public int getIvSpAtck()
    {
        return ivSpAtck;
    }
    
    public void setIvSpAtck(int ivSpAtck)
    {
        this.ivSpAtck = ivSpAtck;
    }
    
    public int getIvSpDef()
    {
        return ivSpDef;
    }
    
    public void setIvSpDef(int ivSpDef)
    {
        this.ivSpDef = ivSpDef;
    }
    
    public int getIvSpeed()
    {
        return ivSpeed;
    }
    
    public void setIvSpeed(int ivSpeed)
    {
        this.ivSpeed = ivSpeed;
    }
    
    public int[] getIv()
    {
        return iv;
    }
    
    public void setIv()
    {
        for(int i = 0; i < iv.length; i++)
        {
            iv[i] = Random.IV();
        }
    }
    
    public int getEvHp()
    {
        return evHp;
    }
    
    public void setEvHp(int evHp)
    {
        this.evHp = evHp;
    }
    
    public int getEvAttack()
    {
        return evAttack;
    }
    
    public void setEvAttack(int evAttack)
    {
        this.evAttack = evAttack;
    }
    
    public int getEvDefense()
    {
        return evDefense;
    }
    
    public void setEvDefense(int evDefense)
    {
        this.evDefense = evDefense;
    }
    
    public int getEvSpAtck()
    {
        return evSpAtck;
    }
    
    public void setEvSpAtck(int evSpAtck)
    {
        this.evSpAtck = evSpAtck;
    }
    
    public int getEvSpDef()
    {
        return evSpDef;
    }
    
    public void setEvSpDef(int evSpDef)
    {
        this.evSpDef = evSpDef;
    }
    
    public int getEvSpeed()
    {
        return evSpeed;
    }
    
    public void setEvSpeed(int evSpeed)
    {
        this.evSpeed = evSpeed;
    }
    
    public int[] getEv()
    {
        return ev;
    }
    
    public void setEv(int[] ev)
    {
        this.ev = ev;
    }
    
    public int[] getEvYield()
    {
        return evYield;
    }
    
    public void setEvYield() {
        Map<String, String> data = pokedexData.get(dexnum);
        String evYield = data.get("ev_yield").trim();
        
        Pattern pattern = Pattern.compile("(\\d+)\\s+([A-Za-z. ]+)");
        Matcher matcher = pattern.matcher(evYield);
        
        int[] evArray = new int[6];
        
        while (matcher.find()) {
            int value = Integer.parseInt(matcher.group(1));
            String statStr = matcher.group(2).trim();
            Constants.Stat statEnum = Constants.Stat.fromLabel(statStr);
            if (statEnum != null) {
                evArray[statEnum.getIndex()] += value;
            }
        }
        
        this.evYield = evArray;
    }
    
    public int getCatchRate()
    {
        return catchRate;
    }
    
    public void setCatchRate(int catchRate)
    {
        this.catchRate = catchRate;
    }
    
    public int getBaseFriendship()
    {
        return baseFriendship;
    }
    
    public void setBaseFriendship(int baseFriendship)
    {
        this.baseFriendship = baseFriendship;
    }
    
    public int getBaseExp()
    {
        return baseExp;
    }
    
    public void setBaseExp(int baseExp)
    {
        this.baseExp = baseExp;
    }
    
    public String getGrowthRate()
    {
        return growthRate;
    }
    
    public void setGrowthRate(String growthRate)
    {
        this.growthRate = growthRate;
    }
    
    public String getEggGroup1()
    {
        return eggGroup1;
    }
    
    public void setEggGroup1(String eggGroup1)
    {
        this.eggGroup1 = eggGroup1;
    }
    
    public String getEggGroup2()
    {
        return eggGroup2;
    }
    
    public void setEggGroup2(String eggGroup2)
    {
        this.eggGroup2 = eggGroup2;
    }
    
    public double getProbMale()
    {
        return probMale;
    }
    
    public void setProbMale(double probMale)
    {
        this.probMale = probMale;
    }
    
    public double getFemale()
    {
        return female;
    }
    
    public void setFemale(double female)
    {
        this.female = female;
    }
    
    public int getEggCycles()
    {
        return eggCycles;
    }
    
    public void setEggCycles(int eggCycles)
    {
        this.eggCycles = eggCycles;
    }
    
    public String getSpecialGroup()
    {
        return specialGroup;
    }
    
    public void setSpecialGroup(String specialGroup)
    {
        this.specialGroup = specialGroup;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public void setLevel(int level)
    {
        this.level = level;
    }
    
    public int getExp()
    {
        return exp;
    }
    
    public void setExp(int exp)
    {
        this.exp = exp;
    }
    
    public void addExp(int exp)
    {
        this.exp += exp;
    }
    
    public String[] getAbilities()
    {
        return abilities;
    }
    
    public void setAbilities()
    {
        if(!isHiddenPokemon)
        {
            if(ability2 != null && !ability2.trim().isEmpty())
            {
                abilities = new String[2];
                abilities[0] = ability1;
                abilities[1] = ability2;
                
            }
            else
            {
                abilities = new String[1];
                abilities[0] = ability1;
                
            }
            setAbility(this.abilities);
        }
        else
        {
            ability = hiddenAbility;
        }
    }
    
    public String getAbility()
    {
        return ability;
    }
    
    public void setAbility(String[] abilities)
    {
        this.ability = Random.ability(abilities);
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int[] getStats()
    {
        return stats;
    }
    
    public void setStats(int[] stats)
    {
        this.stats = stats;
    }
    
    public int[] calculateStats()
    {
        int[] stats = new int[6];
        
        stats[0] = calculateHP(base, iv, ev, level);
        for(int i = 1; i < stats.length; i++)
        {
            stats[i] = calculateStat(base, iv, ev, level, (byte) i, nature);
        }
        
        return stats;
    }
    
    public Nature getNature()
    {
        return nature;
    }
    
    public String getNatureString()
    {
        return this.nature.getNatureName(natureId);
    }
    
    public void setNature()
    {
        this.natureId = Random.nature();
        this.nature = Nature.getNatureById(Random.nature());
    }
    
    public int updateLevel(String growthRate)
    {
        return switch(growthRate)
        {
            case "Erratic" ->
            {
                CalculateLevel erratic = new Erratic();
                yield erratic.calculateLevel(exp);
            }
            case "Fast" ->
            {
                CalculateLevel fast = new Fast();
                yield fast.calculateLevel(exp);
            }
            case "Fluctuating" ->
            {
                CalculateLevel fluctuating = new Fluctuating();
                yield fluctuating.calculateLevel(exp);
            }
            case "Medium Fast" ->
            {
                CalculateLevel medFast = new MediumFast();
                yield medFast.calculateLevel(exp);
            }
            case "Medium Slow" ->
            {
                CalculateLevel medSlow = new MediumSlow();
                yield medSlow.calculateLevel(exp);
            }
            case "Slow" ->
            {
                CalculateLevel slow = new Slow();
                yield slow.calculateLevel(exp);
            }
            default -> 0;
        };
    }
    
    public boolean getIsHidden()
    {
        return isHiddenPokemon;
    }
    
    public void setIsHidden(boolean hiddenPokemon)
    {
        isHiddenPokemon = hiddenPokemon;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    public char getGenreSymbol()
    {
        return genreSymbol;
    }
    
    public void setGenreSymbol()
    {
        if(Objects.equals(genre, "male".toLowerCase()))
        {
            genreSymbol = '♂';
        }
        else if(Objects.equals(genre, "female".toLowerCase()))
        {
            genreSymbol = '♀';
        }
    }
    
    public boolean isFainted()
    {
        return isFainted;
    }
    
    public void setFainted(boolean fainted)
    {
        isFainted = fainted;
    }
    
    public void takeDamage(int damage)
    {
        if(hp-damage > 0)
        {
            addHp(-damage);
        }
        else
        {
            hp = 0;
        }
    }
    
    public void heal(int heal)
    {
        if(hp + heal < baseHp)
        {
            addHp(heal);
        }
        else
        {
            hp = baseHp;
        }
    }
    
    public void addHp(int hp)
    {
        this.hp += hp;
    }
}