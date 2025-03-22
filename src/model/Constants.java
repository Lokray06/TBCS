package model;

public class Constants
{
    public enum Stat
    {
        HP(0, "HP"), ATTACK(1, "Attack"), DEFENSE(2, "Defense"), SP_ATK(3, "Sp. Atk"), SP_DEF(4, "Sp. Def"), SPEED(5, "Speed");
        
        private final int index;
        private final String label;
        
        Stat(int index, String label)
        {
            this.index = index;
            this.label = label;
        }
        
        public int getIndex()
        {
            return index;
        }
        
        public String getLabel()
        {
            return label;
        }
        
        public static Stat fromLabel(String label)
        {
            for(Stat s : values())
            {
                if(s.getLabel().equalsIgnoreCase(label.trim()))
                {
                    return s;
                }
            }
            return null; // or throw an exception if you prefer
        }
    }
    
    public enum attackTypes
    {
        PHYSICAL, SPECIAL, STATE
    }
}

