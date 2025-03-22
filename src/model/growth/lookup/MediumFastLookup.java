package model.growth.lookup;

import java.util.ArrayList;
import java.util.List;

public class MediumFastLookup {

    // Creating a static list to store experience values for levels 1 to 100
    private final List<Integer> experienceTable = new ArrayList<>();

    public MediumFastLookup()
    {
        experienceTable.add(0); // Level 0
        experienceTable.add(8); // Level 1
        experienceTable.add(27); // Level 2
        experienceTable.add(64); // Level 3
        experienceTable.add(125); // Level 4
        experienceTable.add(216); // Level 5
        experienceTable.add(343); // Level 6
        experienceTable.add(512); // Level 7
        experienceTable.add(729); // Level 8
        experienceTable.add(1000); // Level 9
        experienceTable.add(1331); // Level 10
        experienceTable.add(1728); // Level 11
        experienceTable.add(2197); // Level 12
        experienceTable.add(2744); // Level 13
        experienceTable.add(3375); // Level 14
        experienceTable.add(4096); // Level 15
        experienceTable.add(4913); // Level 16
        experienceTable.add(5832); // Level 17
        experienceTable.add(6859); // Level 18
        experienceTable.add(8000); // Level 19
        experienceTable.add(9261); // Level 20
        experienceTable.add(10648); // Level 21
        experienceTable.add(12167); // Level 22
        experienceTable.add(13824); // Level 23
        experienceTable.add(15625); // Level 24
        experienceTable.add(17576); // Level 25
        experienceTable.add(19683); // Level 26
        experienceTable.add(21952); // Level 27
        experienceTable.add(24389); // Level 28
        experienceTable.add(27000); // Level 29
        experienceTable.add(29791); // Level 30
        experienceTable.add(32768); // Level 31
        experienceTable.add(35937); // Level 32
        experienceTable.add(39304); // Level 33
        experienceTable.add(42875); // Level 34
        experienceTable.add(46656); // Level 35
        experienceTable.add(50653); // Level 36
        experienceTable.add(54872); // Level 37
        experienceTable.add(59319); // Level 38
        experienceTable.add(64000); // Level 39
        experienceTable.add(68921); // Level 40
        experienceTable.add(74088); // Level 41
        experienceTable.add(79507); // Level 42
        experienceTable.add(85184); // Level 43
        experienceTable.add(91125); // Level 44
        experienceTable.add(97336); // Level 45
        experienceTable.add(103823); // Level 46
        experienceTable.add(110592); // Level 47
        experienceTable.add(117649); // Level 48
        experienceTable.add(125000); // Level 49
        experienceTable.add(132651); // Level 50
        experienceTable.add(140608); // Level 51
        experienceTable.add(148877); // Level 52
        experienceTable.add(157464); // Level 53
        experienceTable.add(166375); // Level 54
        experienceTable.add(175616); // Level 55
        experienceTable.add(185193); // Level 56
        experienceTable.add(195112); // Level 57
        experienceTable.add(205379); // Level 58
        experienceTable.add(216000); // Level 59
        experienceTable.add(226981); // Level 60
        experienceTable.add(238328); // Level 61
        experienceTable.add(250047); // Level 62
        experienceTable.add(262144); // Level 63
        experienceTable.add(274625); // Level 64
        experienceTable.add(287496); // Level 65
        experienceTable.add(300763); // Level 66
        experienceTable.add(314432); // Level 67
        experienceTable.add(328509); // Level 68
        experienceTable.add(343000); // Level 69
        experienceTable.add(357911); // Level 70
        experienceTable.add(373248); // Level 71
        experienceTable.add(389017); // Level 72
        experienceTable.add(405224); // Level 73
        experienceTable.add(421875); // Level 74
        experienceTable.add(438976); // Level 75
        experienceTable.add(456533); // Level 76
        experienceTable.add(474552); // Level 77
        experienceTable.add(493039); // Level 78
        experienceTable.add(512000); // Level 79
        experienceTable.add(531441); // Level 80
        experienceTable.add(551368); // Level 81
        experienceTable.add(571787); // Level 82
        experienceTable.add(592704); // Level 83
        experienceTable.add(614125); // Level 84
        experienceTable.add(636056); // Level 85
        experienceTable.add(658503); // Level 86
        experienceTable.add(681472); // Level 87
        experienceTable.add(704969); // Level 88
        experienceTable.add(729000); // Level 89
        experienceTable.add(753571); // Level 90
        experienceTable.add(778688); // Level 91
        experienceTable.add(804357); // Level 92
        experienceTable.add(830584); // Level 93
        experienceTable.add(857375); // Level 94
        experienceTable.add(884736); // Level 95
        experienceTable.add(912673); // Level 96
        experienceTable.add(941192); // Level 97
        experienceTable.add(970299); // Level 98
        experienceTable.add(1000000); // Level 99
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
