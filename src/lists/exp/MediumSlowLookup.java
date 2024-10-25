package lists.exp;

import java.util.ArrayList;
import java.util.List;

public class MediumSlowLookup {

    // Creating a static list to store experience values for levels 1 to 100
    private static final List<Double> experienceTable = new ArrayList<>();

    static {
        // Pre-populating the experience table with calculated values
        experienceTable.add(-53.8);      // Level 1
        experienceTable.add(9.6);        // Level 2
        experienceTable.add(57.4);       // Level 3
        experienceTable.add(96.8);       // Level 4
        experienceTable.add(135.0);      // Level 5
        experienceTable.add(179.2);      // Level 6
        experienceTable.add(236.6);      // Level 7
        experienceTable.add(314.4);      // Level 8
        experienceTable.add(419.8);      // Level 9
        experienceTable.add(560.0);      // Level 10
        experienceTable.add(742.2);      // Level 11
        experienceTable.add(973.6);      // Level 12
        experienceTable.add(1261.4);     // Level 13
        experienceTable.add(1612.8);     // Level 14
        experienceTable.add(2035.0);     // Level 15
        experienceTable.add(2535.2);     // Level 16
        experienceTable.add(3120.6);     // Level 17
        experienceTable.add(3798.4);     // Level 18
        experienceTable.add(4575.8);     // Level 19
        experienceTable.add(5460.0);     // Level 20
        experienceTable.add(6458.2);     // Level 21
        experienceTable.add(7577.6);     // Level 22
        experienceTable.add(8825.4);     // Level 23
        experienceTable.add(10208.8);    // Level 24
        experienceTable.add(11735.0);    // Level 25
        experienceTable.add(13411.2);    // Level 26
        experienceTable.add(15244.6);    // Level 27
        experienceTable.add(17242.4);    // Level 28
        experienceTable.add(19411.8);    // Level 29
        experienceTable.add(21760.0);    // Level 30
        experienceTable.add(24294.2);    // Level 31
        experienceTable.add(27021.6);    // Level 32
        experienceTable.add(29949.4);    // Level 33
        experienceTable.add(33084.8);    // Level 34
        experienceTable.add(36435.0);    // Level 35
        experienceTable.add(40007.2);    // Level 36
        experienceTable.add(43808.6);    // Level 37
        experienceTable.add(47846.4);    // Level 38
        experienceTable.add(52127.8);    // Level 39
        experienceTable.add(56660.0);    // Level 40
        experienceTable.add(61450.2);    // Level 41
        experienceTable.add(66505.6);    // Level 42
        experienceTable.add(71833.4);    // Level 43
        experienceTable.add(77440.8);    // Level 44
        experienceTable.add(83335.0);    // Level 45
        experienceTable.add(89523.2);    // Level 46
        experienceTable.add(96012.6);    // Level 47
        experienceTable.add(102810.4);   // Level 48
        experienceTable.add(109923.8);   // Level 49
        experienceTable.add(117360.0);   // Level 50
        experienceTable.add(125126.2);   // Level 51
        experienceTable.add(133229.6);   // Level 52
        experienceTable.add(141677.4);   // Level 53
        experienceTable.add(150476.8);   // Level 54
        experienceTable.add(159635.0);   // Level 55
        experienceTable.add(169159.2);   // Level 56
        experienceTable.add(179056.6);   // Level 57
        experienceTable.add(189334.4);   // Level 58
        experienceTable.add(199999.8);   // Level 59
        experienceTable.add(211060.0);   // Level 60
        experienceTable.add(222522.2);   // Level 61
        experienceTable.add(234393.6);   // Level 62
        experienceTable.add(246681.4);   // Level 63
        experienceTable.add(259392.8);   // Level 64
        experienceTable.add(272535.0);   // Level 65
        experienceTable.add(286115.2);   // Level 66
        experienceTable.add(300140.6);   // Level 67
        experienceTable.add(314618.4);   // Level 68
        experienceTable.add(329555.8);   // Level 69
        experienceTable.add(344960.0);   // Level 70
        experienceTable.add(360838.2);   // Level 71
        experienceTable.add(377197.6);   // Level 72
        experienceTable.add(394045.4);   // Level 73
        experienceTable.add(411388.8);   // Level 74
        experienceTable.add(429235.0);   // Level 75
        experienceTable.add(447591.2);   // Level 76
        experienceTable.add(466464.6);   // Level 77
        experienceTable.add(485862.4);   // Level 78
        experienceTable.add(505791.8);   // Level 79
        experienceTable.add(526260.0);   // Level 80
        experienceTable.add(547274.2);   // Level 81
        experienceTable.add(568841.6);   // Level 82
        experienceTable.add(590969.4);   // Level 83
        experienceTable.add(613664.8);   // Level 84
        experienceTable.add(636935.0);   // Level 85
        experienceTable.add(660787.2);   // Level 86
        experienceTable.add(685228.6);   // Level 87
        experienceTable.add(710266.4);   // Level 88
        experienceTable.add(735907.8);   // Level 89
        experienceTable.add(762160.0);   // Level 90
        experienceTable.add(789030.2);   // Level 91
        experienceTable.add(816525.6);   // Level 92
        experienceTable.add(844653.4);   // Level 93
        experienceTable.add(873420.8);   // Level 94
        experienceTable.add(902835.0);   // Level 95
        experienceTable.add(932903.2);   // Level 96
        experienceTable.add(963632.6);   // Level 97
        experienceTable.add(995030.4);   // Level 98
        experienceTable.add(1027103.8);  // Level 99
        experienceTable.add(1059860.0);  // Level 100
    }

    // Method to get the experience for a given level
    public double getExperienceForLevel(int level)
    {
        if (level < 1 || level > 100) {
            throw new IllegalArgumentException("Level must be between 1 and 100");
        }
        return experienceTable.get(level - 1);
    }

    public byte getLevelForExperience(int exp)
    {
        // Iterate through the experience table to find the corresponding level
        for (int level = 1; level <= 100; level++) {
            if (exp < experienceTable.get(level - 1)) {
                return (byte) (level - 1);  // Return the previous level if exp is less
            }
        }
        return 100;  // Return max level if exp exceeds the highest level threshold
    }
}
