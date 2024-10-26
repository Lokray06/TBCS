package pokemons;

import java.util.Map;

<<<<<<<< HEAD:src/pokemons/PokemonOld.java
import expTypes.*;
import lists.Nature;
import lists.Pokedex;
import lists.PokemonDatabaseOld;
import lists.Stats;
import objects.Attack;
import objects.PokemonHolder;
import objects.PokemonManager;
import services.CalculateLevel;
import services.MathS;
import services.StatsCalculatorInterface;
========
import static lists.PokemonDatabase.pokedexData;
import services.Random;
>>>>>>>> 324e347 (5th commit i think, ive lost the count):src/pokemons/Pokemon.java

public class PokemonOld
{
<<<<<<<< HEAD:src/pokemons/PokemonOld.java
    StatsCalculatorInterface mathS = new MathS();
    services.Random random = new services.Random();
    PokemonDatabaseOld db = new PokemonDatabaseOld();
========
    Random random = new Random();
>>>>>>>> 324e347 (5th commit i think, ive lost the count):src/pokemons/Pokemon.java

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
    private String nickname;
    private int exp;
    private int hp;
    private String object;
    private int[] attacks = new int[4];
    private int level;

    // Stats
    //Base
    private int baseHp;
    private int baseAttack;
    private int baseDefense;
    private int baseSpAtck;
    private int baseSpDef;
    private int baseSpeed;
    private int baseTotal;  // = hp + attack + defense + spAtck + spDef + speed;
    private int[] base = new int[6];

<<<<<<<< HEAD:src/pokemons/PokemonOld.java
    public PokemonOld(int pokedexNumber)
========
    // IV
    private int ivHp;
    private int ivAttack;
    private int ivDefense;
    private int ivSpAtck;
    private int ivSpDef;
    private int ivSpeed;
    private int[] iv = new int[6];

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

    public Pokemon(int dexnum)
>>>>>>>> 324e347 (5th commit i think, ive lost the count):src/pokemons/Pokemon.java
    {
        Map<String, String> data = pokedexData.get(dexnum);

        if(data != null)
        {
            setDexnum(Integer.parseInt(data.get("dexnum")));
            setName(data.get("name"));
            setGen(Integer.parseInt(data.get("generation")));
            setType1(data.get("type1"));
            setType2(data.get("type2"));
            setSpecies(data.get("species"));
            setHeight(Double.parseDouble(data.get("height")));
            setWeight(Double.parseDouble(data.get("weight")));
            setAbility1(data.get("ability1"));
            setAbility2(data.get("ability2"));
            setHiddenAbility(data.get("hidden_ability"));
            setAbilities();
            setAbility(this.abilities);
            setHiddenAbility(data.get("hidden_ability"));
            setBaseHp(Integer.parseInt(data.get("hp")));
            setBaseAttack(Integer.parseInt(data.get("attack")));
            setBaseDefense(Integer.parseInt(data.get("defense")));
            setBaseSpAtck(Integer.parseInt(data.get("sp_atk")));
            setBaseSpDef(Integer.parseInt(data.get("sp_def")));
            setBaseSpeed(Integer.parseInt(data.get("speed")));
            setBaseTotal(Integer.parseInt(data.get("total")));
            setBase(new int[]{baseHp, baseAttack, baseDefense, baseSpAtck, baseSpDef, baseSpeed});
            setGrowthRate(data.get("growth_rate"));
        }
        else
        {
            System.out.println("No data found for pokemon Nº: " + dexnum);
        }
    }

    public int getDexnum(){
        return dexnum;
    }

    public void setDexnum(int dexnum) {
        this.dexnum = dexnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAbility1() {
        return ability1;
    }

    public void setAbility1(String ability1) {
        this.ability1 = ability1;
    }

    public String getAbility2() {
        return ability2;
    }

    public void setAbility2(String ability2) {
        this.ability2 = ability2;
    }

    public String getHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(String hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int[] getAttacks() {
        return attacks;
    }

    public void setAttacks(int[] attacks) {
        this.attacks = attacks;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public int getBaseSpAtck() {
        return baseSpAtck;
    }

    public void setBaseSpAtck(int baseSpAtck) {
        this.baseSpAtck = baseSpAtck;
    }

    public int getBaseSpDef() {
        return baseSpDef;
    }

    public void setBaseSpDef(int baseSpDef) {
        this.baseSpDef = baseSpDef;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getBaseTotal() {
        return baseTotal;
    }

    public void setBaseTotal(int baseTotal) {
        this.baseTotal = baseTotal;
    }

    public int[] getBase() {
        return base;
    }

    public void setBase(int[] base) {
        this.base = base;
    }

    public int getIvHp() {
        return ivHp;
    }

    public void setIvHp(int ivHp) {
        this.ivHp = ivHp;
    }

    public int getIvAttack() {
        return ivAttack;
    }

    public void setIvAttack(int ivAttack) {
        this.ivAttack = ivAttack;
    }

    public int getIvDefense() {
        return ivDefense;
    }

    public void setIvDefense(int ivDefense) {
        this.ivDefense = ivDefense;
    }

    public int getIvSpAtck() {
        return ivSpAtck;
    }

    public void setIvSpAtck(int ivSpAtck) {
        this.ivSpAtck = ivSpAtck;
    }

    public int getIvSpDef() {
        return ivSpDef;
    }

    public void setIvSpDef(int ivSpDef) {
        this.ivSpDef = ivSpDef;
    }

    public int getIvSpeed() {
        return ivSpeed;
    }

    public void setIvSpeed(int ivSpeed) {
        this.ivSpeed = ivSpeed;
    }

    public int[] getIv() {
        return iv;
    }

    public void setIv(int[] iv) {
        this.iv = iv;
    }

    public int getEvHp() {
        return evHp;
    }

    public void setEvHp(int evHp) {
        this.evHp = evHp;
    }

    public int getEvAttack() {
        return evAttack;
    }

    public void setEvAttack(int evAttack) {
        this.evAttack = evAttack;
    }

    public int getEvDefense() {
        return evDefense;
    }

    public void setEvDefense(int evDefense) {
        this.evDefense = evDefense;
    }

    public int getEvSpAtck() {
        return evSpAtck;
    }

    public void setEvSpAtck(int evSpAtck) {
        this.evSpAtck = evSpAtck;
    }

    public int getEvSpDef() {
        return evSpDef;
    }

    public void setEvSpDef(int evSpDef) {
        this.evSpDef = evSpDef;
    }

    public int getEvSpeed() {
        return evSpeed;
    }

    public void setEvSpeed(int evSpeed) {
        this.evSpeed = evSpeed;
    }

    public int[] getEv() {
        return ev;
    }

    public void setEv(int[] ev) {
        this.ev = ev;
    }

    public int[] getEvYield() {
        return evYield;
    }

    public void setEvYield(int[] evYield) {
        this.evYield = evYield;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(int catchRate) {
        this.catchRate = catchRate;
    }

    public int getBaseFriendship() {
        return baseFriendship;
    }

    public void setBaseFriendship(int baseFriendship) {
        this.baseFriendship = baseFriendship;
    }

    public int getBaseExp() {
        return baseExp;
    }

    public void setBaseExp(int baseExp) {
        this.baseExp = baseExp;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(String growthRate) {
        this.growthRate = growthRate;
    }

    public String getEggGroup1() {
        return eggGroup1;
    }

    public void setEggGroup1(String eggGroup1) {
        this.eggGroup1 = eggGroup1;
    }

    public String getEggGroup2() {
        return eggGroup2;
    }

    public void setEggGroup2(String eggGroup2) {
        this.eggGroup2 = eggGroup2;
    }

    public double getProbMale() {
        return probMale;
    }

    public void setProbMale(double probMale) {
        this.probMale = probMale;
    }

    public double getFemale() {
        return female;
    }

    public void setFemale(double female) {
        this.female = female;
    }

    public int getEggCycles() {
        return eggCycles;
    }

    public void setEggCycles(int eggCycles) {
        this.eggCycles = eggCycles;
    }

    public String getSpecialGroup() {
        return specialGroup;
    }

    public void setSpecialGroup(String specialGroup) {
        this.specialGroup = specialGroup;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities() {
        if(!isHiddenPokemon)
        {
            if(ability2 != null)
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
        }
<<<<<<<< HEAD:src/pokemons/PokemonOld.java
    }

    public String getDefaultName ()
    {
        return defaultName;
    }

    public int getId (PokemonOld pokemon)
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
========
        else
>>>>>>>> 324e347 (5th commit i think, ive lost the count):src/pokemons/Pokemon.java
        {
            abilities = new String[1];
            abilities[0] = hiddenAbility;
        }
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String[] abilities) {
        this.ability = random.ability(abilities);
    }
}