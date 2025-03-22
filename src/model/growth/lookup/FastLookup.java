package model.growth.lookup;

import java.util.ArrayList;
import java.util.List;

public class FastLookup {

    // Creating a static list to store experience values for levels 1 to 100
    private final List<Integer> experienceTable = new ArrayList<>();

    public FastLookup()
    {
        experienceTable.add(0); // Level 0
        experienceTable.add(6); // Level 1
        experienceTable.add(21); // Level 2
        experienceTable.add(51); // Level 3
        experienceTable.add(100); // Level 4
        experienceTable.add(172); // Level 5
        experienceTable.add(274); // Level 6
        experienceTable.add(409); // Level 7
        experienceTable.add(583); // Level 8
        experienceTable.add(800); // Level 9
        experienceTable.add(1064); // Level 10
        experienceTable.add(1382); // Level 11
        experienceTable.add(1757); // Level 12
        experienceTable.add(2195); // Level 13
        experienceTable.add(2700); // Level 14
        experienceTable.add(3276); // Level 15
        experienceTable.add(3930); // Level 16
        experienceTable.add(4665); // Level 17
        experienceTable.add(5487); // Level 18
        experienceTable.add(6400); // Level 19
        experienceTable.add(7408); // Level 20
        experienceTable.add(8518); // Level 21
        experienceTable.add(9733); // Level 22
        experienceTable.add(11059); // Level 23
        experienceTable.add(12500); // Level 24
        experienceTable.add(14060); // Level 25
        experienceTable.add(15746); // Level 26
        experienceTable.add(17561); // Level 27
        experienceTable.add(19511); // Level 28
        experienceTable.add(21600); // Level 29
        experienceTable.add(23832); // Level 30
        experienceTable.add(26214); // Level 31
        experienceTable.add(28749); // Level 32
        experienceTable.add(31443); // Level 33
        experienceTable.add(34300); // Level 34
        experienceTable.add(37324); // Level 35
        experienceTable.add(40522); // Level 36
        experienceTable.add(43897); // Level 37
        experienceTable.add(47455); // Level 38
        experienceTable.add(51200); // Level 39
        experienceTable.add(55136); // Level 40
        experienceTable.add(59270); // Level 41
        experienceTable.add(63605); // Level 42
        experienceTable.add(68147); // Level 43
        experienceTable.add(72900); // Level 44
        experienceTable.add(77868); // Level 45
        experienceTable.add(83058); // Level 46
        experienceTable.add(88473); // Level 47
        experienceTable.add(94119); // Level 48
        experienceTable.add(100000); // Level 49
        experienceTable.add(106120); // Level 50
        experienceTable.add(112486); // Level 51
        experienceTable.add(119101); // Level 52
        experienceTable.add(125971); // Level 53
        experienceTable.add(133100); // Level 54
        experienceTable.add(140492); // Level 55
        experienceTable.add(148154); // Level 56
        experienceTable.add(156089); // Level 57
        experienceTable.add(164303); // Level 58
        experienceTable.add(172800); // Level 59
        experienceTable.add(181584); // Level 60
        experienceTable.add(190662); // Level 61
        experienceTable.add(200037); // Level 62
        experienceTable.add(209715); // Level 63
        experienceTable.add(219700); // Level 64
        experienceTable.add(229996); // Level 65
        experienceTable.add(240610); // Level 66
        experienceTable.add(251545); // Level 67
        experienceTable.add(262807); // Level 68
        experienceTable.add(274400); // Level 69
        experienceTable.add(286328); // Level 70
        experienceTable.add(298598); // Level 71
        experienceTable.add(311213); // Level 72
        experienceTable.add(324179); // Level 73
        experienceTable.add(337500); // Level 74
        experienceTable.add(351180); // Level 75
        experienceTable.add(365226); // Level 76
        experienceTable.add(379641); // Level 77
        experienceTable.add(394431); // Level 78
        experienceTable.add(409600); // Level 79
        experienceTable.add(425152); // Level 80
        experienceTable.add(441094); // Level 81
        experienceTable.add(457429); // Level 82
        experienceTable.add(474163); // Level 83
        experienceTable.add(491300); // Level 84
        experienceTable.add(508844); // Level 85
        experienceTable.add(526802); // Level 86
        experienceTable.add(545177); // Level 87
        experienceTable.add(563975); // Level 88
        experienceTable.add(583200); // Level 89
        experienceTable.add(602856); // Level 90
        experienceTable.add(622950); // Level 91
        experienceTable.add(643485); // Level 92
        experienceTable.add(664467); // Level 93
        experienceTable.add(685900); // Level 94
        experienceTable.add(707788); // Level 95
        experienceTable.add(730138); // Level 96
        experienceTable.add(752953); // Level 97
        experienceTable.add(776239); // Level 98
        experienceTable.add(800000); // Level 99
    }
    
    // Method to get the experience for a given level
    public int getExperienceForLevel(int level)
    {
        if(level < 1 || level > 100)
        {
            throw new IllegalArgumentException("Level must be between 1 and 100");
        }
        return experienceTable.get(level - 1);
    }
    
    public byte getLevelForExperience(int exp)
    {
        if(exp == 0)
            return 0;
        for(int level = 1; level < experienceTable.size(); level++)
        {
            if(exp < experienceTable.get(level))
            {
                return (byte) (level);
            }
        }
        return 100; // If experience exceeds all thresholds, return max level
    }
}
