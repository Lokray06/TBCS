package lists.exp;

import java.util.ArrayList;
import java.util.List;

public class SlowLookup {

    // Creating a static list to store experience values for levels 1 to 100
    private final List<Integer> experienceTable = new ArrayList<>();

    public SlowLookup()
    {
        experienceTable.add(0); // Level 0
        experienceTable.add(10); // Level 1
        experienceTable.add(33); // Level 2
        experienceTable.add(80); // Level 3
        experienceTable.add(156); // Level 4
        experienceTable.add(270); // Level 5
        experienceTable.add(428); // Level 6
        experienceTable.add(640); // Level 7
        experienceTable.add(911); // Level 8
        experienceTable.add(1250); // Level 9
        experienceTable.add(1663); // Level 10
        experienceTable.add(2160); // Level 11
        experienceTable.add(2746); // Level 12
        experienceTable.add(3430); // Level 13
        experienceTable.add(4218); // Level 14
        experienceTable.add(5120); // Level 15
        experienceTable.add(6141); // Level 16
        experienceTable.add(7290); // Level 17
        experienceTable.add(8573); // Level 18
        experienceTable.add(10000); // Level 19
        experienceTable.add(11576); // Level 20
        experienceTable.add(13310); // Level 21
        experienceTable.add(15208); // Level 22
        experienceTable.add(17280); // Level 23
        experienceTable.add(19531); // Level 24
        experienceTable.add(21970); // Level 25
        experienceTable.add(24603); // Level 26
        experienceTable.add(27440); // Level 27
        experienceTable.add(30486); // Level 28
        experienceTable.add(33750); // Level 29
        experienceTable.add(37238); // Level 30
        experienceTable.add(40960); // Level 31
        experienceTable.add(44921); // Level 32
        experienceTable.add(49130); // Level 33
        experienceTable.add(53593); // Level 34
        experienceTable.add(58320); // Level 35
        experienceTable.add(63316); // Level 36
        experienceTable.add(68590); // Level 37
        experienceTable.add(74148); // Level 38
        experienceTable.add(80000); // Level 39
        experienceTable.add(86151); // Level 40
        experienceTable.add(92610); // Level 41
        experienceTable.add(99383); // Level 42
        experienceTable.add(106480); // Level 43
        experienceTable.add(113906); // Level 44
        experienceTable.add(121670); // Level 45
        experienceTable.add(129778); // Level 46
        experienceTable.add(138240); // Level 47
        experienceTable.add(147061); // Level 48
        experienceTable.add(156250); // Level 49
        experienceTable.add(165813); // Level 50
        experienceTable.add(175760); // Level 51
        experienceTable.add(186096); // Level 52
        experienceTable.add(196830); // Level 53
        experienceTable.add(207968); // Level 54
        experienceTable.add(219520); // Level 55
        experienceTable.add(231491); // Level 56
        experienceTable.add(243890); // Level 57
        experienceTable.add(256723); // Level 58
        experienceTable.add(270000); // Level 59
        experienceTable.add(283726); // Level 60
        experienceTable.add(297910); // Level 61
        experienceTable.add(312558); // Level 62
        experienceTable.add(327680); // Level 63
        experienceTable.add(343281); // Level 64
        experienceTable.add(359370); // Level 65
        experienceTable.add(375953); // Level 66
        experienceTable.add(393040); // Level 67
        experienceTable.add(410636); // Level 68
        experienceTable.add(428750); // Level 69
        experienceTable.add(447388); // Level 70
        experienceTable.add(466560); // Level 71
        experienceTable.add(486271); // Level 72
        experienceTable.add(506530); // Level 73
        experienceTable.add(527343); // Level 74
        experienceTable.add(548720); // Level 75
        experienceTable.add(570666); // Level 76
        experienceTable.add(593190); // Level 77
        experienceTable.add(616298); // Level 78
        experienceTable.add(640000); // Level 79
        experienceTable.add(664301); // Level 80
        experienceTable.add(689210); // Level 81
        experienceTable.add(714733); // Level 82
        experienceTable.add(740880); // Level 83
        experienceTable.add(767656); // Level 84
        experienceTable.add(795070); // Level 85
        experienceTable.add(823128); // Level 86
        experienceTable.add(851840); // Level 87
        experienceTable.add(881211); // Level 88
        experienceTable.add(911250); // Level 89
        experienceTable.add(941963); // Level 90
        experienceTable.add(973360); // Level 91
        experienceTable.add(1005446); // Level 92
        experienceTable.add(1038230); // Level 93
        experienceTable.add(1071718); // Level 94
        experienceTable.add(1105920); // Level 95
        experienceTable.add(1140841); // Level 96
        experienceTable.add(1176490); // Level 97
        experienceTable.add(1212873); // Level 98
        experienceTable.add(1250000); // Level 99
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
