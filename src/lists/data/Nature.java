package lists.data;

public class Nature
{
    private double[] multipliers; // Multipliers for {HP, Attack, Defense, Sp. Atk, Sp. Def, Speed}
    
    public Nature(double[] multipliers)
    {
        this.multipliers = multipliers;
    }
    
    public double getMultiplier(byte stat)
    {
        return multipliers[stat];
    }
    
    // Predefined Nature Constants
    public static final Nature[] NATURES = new Nature[25];
    
    private static final String[] NATURE_NAMES = new String[25]; // Array to hold the nature names
    
    static
    {
        NATURES[0] = new Nature(new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0}); // Hardy (1)
        NATURE_NAMES[0] = "Hardy";
        
        NATURES[1] = new Nature(new double[]{1.0, 1.1, 0.9, 1.0, 1.0, 1.0}); // Lonely (2)
        NATURE_NAMES[1] = "Lonely";
        
        NATURES[2] = new Nature(new double[]{1.0, 1.1, 1.0, 1.0, 1.0, 0.9}); // Brave (3)
        NATURE_NAMES[2] = "Brave";
        
        NATURES[3] = new Nature(new double[]{1.0, 1.1, 1.0, 0.9, 1.0, 1.0}); // Adamant (4)
        NATURE_NAMES[3] = "Adamant";
        
        NATURES[4] = new Nature(new double[]{1.0, 1.1, 1.0, 1.0, 0.9, 1.0}); // Naughty (5)
        NATURE_NAMES[4] = "Naughty";
        
        NATURES[5] = new Nature(new double[]{1.0, 0.9, 1.1, 1.0, 1.0, 1.0}); // Bold (6)
        NATURE_NAMES[5] = "Bold";
        
        NATURES[6] = new Nature(new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0}); // Docile (7)
        NATURE_NAMES[6] = "Docile";
        
        NATURES[7] = new Nature(new double[]{1.0, 1.0, 1.1, 1.0, 1.0, 0.9}); // Relaxed (8)
        NATURE_NAMES[7] = "Relaxed";
        
        NATURES[8] = new Nature(new double[]{1.0, 1.0, 1.1, 0.9, 1.0, 1.0}); // Impish (9)
        NATURE_NAMES[8] = "Impish";
        
        NATURES[9] = new Nature(new double[]{1.0, 1.0, 1.1, 1.0, 0.9, 1.0}); // Lax (10)
        NATURE_NAMES[9] = "Lax";
        
        NATURES[10] = new Nature(new double[]{1.0, 0.9, 1.0, 1.0, 1.0, 1.1}); // Timid (11)
        NATURE_NAMES[10] = "Timid";
        
        NATURES[11] = new Nature(new double[]{1.0, 1.0, 0.9, 1.0, 1.0, 1.1}); // Hasty (12)
        NATURE_NAMES[11] = "Hasty";
        
        NATURES[12] = new Nature(new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0}); // Serious (13)
        NATURE_NAMES[12] = "Serious";
        
        NATURES[13] = new Nature(new double[]{1.0, 1.0, 1.0, 0.9, 1.0, 1.1}); // Jolly (14)
        NATURE_NAMES[13] = "Jolly";
        
        NATURES[14] = new Nature(new double[]{1.0, 1.0, 1.0, 1.0, 0.9, 1.1}); // Naive (15)
        NATURE_NAMES[14] = "Naive";
        
        NATURES[15] = new Nature(new double[]{1.0, 0.9, 1.0, 1.1, 1.0, 1.0}); // Modest (16)
        NATURE_NAMES[15] = "Modest";
        
        NATURES[16] = new Nature(new double[]{1.0, 1.0, 0.9, 1.1, 1.0, 1.0}); // Mild (17)
        NATURE_NAMES[16] = "Mild";
        
        NATURES[17] = new Nature(new double[]{1.0, 1.0, 1.0, 1.1, 1.0, 0.9}); // Quiet (18)
        NATURE_NAMES[17] = "Quiet";
        
        NATURES[18] = new Nature(new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0}); // Bashful (19)
        NATURE_NAMES[18] = "Bashful";
        
        NATURES[19] = new Nature(new double[]{1.0, 1.0, 1.0, 1.1, 0.9, 1.0}); // Rash (20)
        NATURE_NAMES[19] = "Rash";
        
        NATURES[20] = new Nature(new double[]{1.0, 0.9, 1.0, 1.0, 1.1, 1.0}); // Calm (21)
        NATURE_NAMES[20] = "Calm";
        
        NATURES[21] = new Nature(new double[]{1.0, 1.0, 0.9, 1.0, 1.1, 1.0}); // Gentle (22)
        NATURE_NAMES[21] = "Gentle";
        
        NATURES[22] = new Nature(new double[]{1.0, 1.0, 1.0, 1.0, 1.1, 0.9}); // Sassy (23)
        NATURE_NAMES[22] = "Sassy";
        
        NATURES[23] = new Nature(new double[]{1.0, 1.0, 1.0, 0.9, 1.1, 1.0}); // Careful (24)
        NATURE_NAMES[23] = "Careful";
        
        NATURES[24] = new Nature(new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0}); // Quirky (25)
        NATURE_NAMES[24] = "Quirky";
    }
    
    // Method to retrieve a nature by ID (1-25)
    public static Nature getNatureById(int id)
    {
        return NATURES[id - 1]; // Since IDs are 1-based, subtract 1 for the array index
    }
    
    // Method to get the name of a nature
    public String getNatureName(int id)
    {
        return NATURE_NAMES[(id - 1)]; // Return the name based on 1-based ID
    }
}
