package objects;

public class Attack
{
    private int id;
    private String name;
    private String desc;
    private String effect;
    private int type;
    private int cat;
    private int power;
    private int acc;
    private int pp;
    private int currentPp;
    private int maxPp;
    private int prob;
    private int index;

    public Attack(int id, String name, int type, int cat, int power, int acc, int pp, int maxPp, String desc, String effect)
    {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.cat = cat;
        this.power = power;
        this.acc = acc;
        this.pp = pp;
        this.maxPp = maxPp;
        this.prob = prob;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(byte pp) {
        this.pp = pp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getType() {
        return type;
    }

    public int getCat() {
        return cat;
    }

    public int getPower() {
        return power;
    }

    public double getAcc() {
        return acc;
    }

    public double getProb() {
        return prob;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(byte index)
    {
        this.index = index;
    }
}