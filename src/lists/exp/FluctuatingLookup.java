package lists.exp;

import java.util.ArrayList;
import java.util.List;

public class FluctuatingLookup {

    // Creating a static list to store experience values for levels 1 to 100
    private final List<Integer> experienceTable = new ArrayList<>();

    public FluctuatingLookup()
    {
        experienceTable.add(0); // Level 0
        experienceTable.add(4); // Level 1
        experienceTable.add(13); // Level 2
        experienceTable.add(32); // Level 3
        experienceTable.add(65); // Level 4
        experienceTable.add(112); // Level 5
        experienceTable.add(178); // Level 6
        experienceTable.add(276); // Level 7
        experienceTable.add(393); // Level 8
        experienceTable.add(540); // Level 9
        experienceTable.add(745); // Level 10
        experienceTable.add(967); // Level 11
        experienceTable.add(1230); // Level 12
        experienceTable.add(1591); // Level 13
        experienceTable.add(1957); // Level 14
        experienceTable.add(2457); // Level 15
        experienceTable.add(3046); // Level 16
        experienceTable.add(3732); // Level 17
        experienceTable.add(4526); // Level 18
        experienceTable.add(5440); // Level 19
        experienceTable.add(6482); // Level 20
        experienceTable.add(7666); // Level 21
        experienceTable.add(9003); // Level 22
        experienceTable.add(10506); // Level 23
        experienceTable.add(12187); // Level 24
        experienceTable.add(14060); // Level 25
        experienceTable.add(16140); // Level 26
        experienceTable.add(18439); // Level 27
        experienceTable.add(20974); // Level 28
        experienceTable.add(23760); // Level 29
        experienceTable.add(26811); // Level 30
        experienceTable.add(30146); // Level 31
        experienceTable.add(33780); // Level 32
        experienceTable.add(37731); // Level 33
        experienceTable.add(42017); // Level 34
        experienceTable.add(46656); // Level 35
        experienceTable.add(50653); // Level 36
        experienceTable.add(55969); // Level 37
        experienceTable.add(60505); // Level 38
        experienceTable.add(66560); // Level 39
        experienceTable.add(71677); // Level 40
        experienceTable.add(78533); // Level 41
        experienceTable.add(84277); // Level 42
        experienceTable.add(91998); // Level 43
        experienceTable.add(98415); // Level 44
        experienceTable.add(107069); // Level 45
        experienceTable.add(114205); // Level 46
        experienceTable.add(123863); // Level 47
        experienceTable.add(131766); // Level 48
        experienceTable.add(142500); // Level 49
        experienceTable.add(151222); // Level 50
        experienceTable.add(163105); // Level 51
        experienceTable.add(172697); // Level 52
        experienceTable.add(185807); // Level 53
        experienceTable.add(196322); // Level 54
        experienceTable.add(210739); // Level 55
        experienceTable.add(222231); // Level 56
        experienceTable.add(238036); // Level 57
        experienceTable.add(250562); // Level 58
        experienceTable.add(267840); // Level 59
        experienceTable.add(281456); // Level 60
        experienceTable.add(300293); // Level 61
        experienceTable.add(315059); // Level 62
        experienceTable.add(335544); // Level 63
        experienceTable.add(351520); // Level 64
        experienceTable.add(373744); // Level 65
        experienceTable.add(390991); // Level 66
        experienceTable.add(415050); // Level 67
        experienceTable.add(433631); // Level 68
        experienceTable.add(459620); // Level 69
        experienceTable.add(479600); // Level 70
        experienceTable.add(507617); // Level 71
        experienceTable.add(529063); // Level 72
        experienceTable.add(559209); // Level 73
        experienceTable.add(582187); // Level 74
        experienceTable.add(614566); // Level 75
        experienceTable.add(639146); // Level 76
        experienceTable.add(673863); // Level 77
        experienceTable.add(700115); // Level 78
        experienceTable.add(737280); // Level 79
        experienceTable.add(765275); // Level 80
        experienceTable.add(804997); // Level 81
        experienceTable.add(834809); // Level 82
        experienceTable.add(877201); // Level 83
        experienceTable.add(908905); // Level 84
        experienceTable.add(954084); // Level 85
        experienceTable.add(987754); // Level 86
        experienceTable.add(1035837); // Level 87
        experienceTable.add(1071552); // Level 88
        experienceTable.add(1122660); // Level 89
        experienceTable.add(1160499); // Level 90
        experienceTable.add(1214753); // Level 91
        experienceTable.add(1254796); // Level 92
        experienceTable.add(1312322); // Level 93
        experienceTable.add(1354652); // Level 94
        experienceTable.add(1415577); // Level 95
        experienceTable.add(1460276); // Level 96
        experienceTable.add(1524731); // Level 97
        experienceTable.add(1571884); // Level 98
        experienceTable.add(1640000); // Level 99
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
