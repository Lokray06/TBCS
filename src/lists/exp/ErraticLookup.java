package lists.exp;

import java.util.ArrayList;
import java.util.List;

public class ErraticLookup {

    // Creating a static list to store experience values for levels 1 to 100
    private final List<Integer> experienceTable = new ArrayList<>();

    public ErraticLookup()
    {
        experienceTable.add(0); // Level 0
        experienceTable.add(15); // Level 1
        experienceTable.add(52); // Level 2
        experienceTable.add(122); // Level 3
        experienceTable.add(237); // Level 4
        experienceTable.add(406); // Level 5
        experienceTable.add(637); // Level 6
        experienceTable.add(942); // Level 7
        experienceTable.add(1326); // Level 8
        experienceTable.add(1800); // Level 9
        experienceTable.add(2369); // Level 10
        experienceTable.add(3041); // Level 11
        experienceTable.add(3822); // Level 12
        experienceTable.add(4719); // Level 13
        experienceTable.add(5737); // Level 14
        experienceTable.add(6881); // Level 15
        experienceTable.add(8155); // Level 16
        experienceTable.add(9564); // Level 17
        experienceTable.add(11111); // Level 18
        experienceTable.add(12800); // Level 19
        experienceTable.add(14632); // Level 20
        experienceTable.add(16610); // Level 21
        experienceTable.add(18737); // Level 22
        experienceTable.add(21012); // Level 23
        experienceTable.add(23437); // Level 24
        experienceTable.add(26012); // Level 25
        experienceTable.add(28737); // Level 26
        experienceTable.add(31610); // Level 27
        experienceTable.add(34632); // Level 28
        experienceTable.add(37800); // Level 29
        experienceTable.add(41111); // Level 30
        experienceTable.add(44564); // Level 31
        experienceTable.add(48155); // Level 32
        experienceTable.add(51881); // Level 33
        experienceTable.add(55737); // Level 34
        experienceTable.add(59719); // Level 35
        experienceTable.add(63822); // Level 36
        experienceTable.add(68041); // Level 37
        experienceTable.add(72369); // Level 38
        experienceTable.add(76800); // Level 39
        experienceTable.add(81326); // Level 40
        experienceTable.add(85942); // Level 41
        experienceTable.add(90637); // Level 42
        experienceTable.add(95406); // Level 43
        experienceTable.add(100237); // Level 44
        experienceTable.add(105122); // Level 45
        experienceTable.add(110052); // Level 46
        experienceTable.add(115015); // Level 47
        experienceTable.add(120001); // Level 48
        experienceTable.add(125000); // Level 49
        experienceTable.add(131324); // Level 50
        experienceTable.add(137795); // Level 51
        experienceTable.add(144410); // Level 52
        experienceTable.add(151165); // Level 53
        experienceTable.add(158056); // Level 54
        experienceTable.add(165079); // Level 55
        experienceTable.add(172229); // Level 56
        experienceTable.add(179503); // Level 57
        experienceTable.add(186894); // Level 58
        experienceTable.add(194400); // Level 59
        experienceTable.add(202013); // Level 60
        experienceTable.add(209728); // Level 61
        experienceTable.add(217540); // Level 62
        experienceTable.add(225443); // Level 63
        experienceTable.add(233431); // Level 64
        experienceTable.add(241496); // Level 65
        experienceTable.add(249633); // Level 66
        experienceTable.add(257834); // Level 67
        experienceTable.add(267406); // Level 68
        experienceTable.add(276458); // Level 69
        experienceTable.add(286328); // Level 70
        experienceTable.add(296358); // Level 71
        experienceTable.add(305767); // Level 72
        experienceTable.add(316074); // Level 73
        experienceTable.add(326531); // Level 74
        experienceTable.add(336255); // Level 75
        experienceTable.add(346965); // Level 76
        experienceTable.add(357812); // Level 77
        experienceTable.add(367807); // Level 78
        experienceTable.add(378880); // Level 79
        experienceTable.add(390077); // Level 80
        experienceTable.add(400293); // Level 81
        experienceTable.add(411686); // Level 82
        experienceTable.add(423190); // Level 83
        experienceTable.add(433572); // Level 84
        experienceTable.add(445239); // Level 85
        experienceTable.add(457001); // Level 86
        experienceTable.add(467489); // Level 87
        experienceTable.add(479378); // Level 88
        experienceTable.add(491346); // Level 89
        experienceTable.add(501878); // Level 90
        experienceTable.add(513934); // Level 91
        experienceTable.add(526049); // Level 92
        experienceTable.add(536557); // Level 93
        experienceTable.add(548720); // Level 94
        experienceTable.add(560922); // Level 95
        experienceTable.add(571333); // Level 96
        experienceTable.add(583539); // Level 97
        experienceTable.add(591882); // Level 98
        experienceTable.add(600000); // Level 99
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
