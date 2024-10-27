package lists.data.exp;

import java.util.ArrayList;
import java.util.List;

public class MediumSlowLookup {

    // Creating a static list to store experience values for levels 1 to 100
    private final List<Integer> experienceTable = new ArrayList<>();

    public MediumSlowLookup()
    {
        experienceTable.add(0); // Level 0
        experienceTable.add(9); // Level 1
        experienceTable.add(57); // Level 2
        experienceTable.add(96); // Level 3
        experienceTable.add(135); // Level 4
        experienceTable.add(179); // Level 5
        experienceTable.add(236); // Level 6
        experienceTable.add(314); // Level 7
        experienceTable.add(419); // Level 8
        experienceTable.add(560); // Level 9
        experienceTable.add(742); // Level 10
        experienceTable.add(973); // Level 11
        experienceTable.add(1261); // Level 12
        experienceTable.add(1612); // Level 13
        experienceTable.add(2035); // Level 14
        experienceTable.add(2535); // Level 15
        experienceTable.add(3120); // Level 16
        experienceTable.add(3798); // Level 17
        experienceTable.add(4575); // Level 18
        experienceTable.add(5460); // Level 19
        experienceTable.add(6458); // Level 20
        experienceTable.add(7577); // Level 21
        experienceTable.add(8825); // Level 22
        experienceTable.add(10208); // Level 23
        experienceTable.add(11735); // Level 24
        experienceTable.add(13411); // Level 25
        experienceTable.add(15244); // Level 26
        experienceTable.add(17242); // Level 27
        experienceTable.add(19411); // Level 28
        experienceTable.add(21760); // Level 29
        experienceTable.add(24294); // Level 30
        experienceTable.add(27021); // Level 31
        experienceTable.add(29949); // Level 32
        experienceTable.add(33084); // Level 33
        experienceTable.add(36435); // Level 34
        experienceTable.add(40007); // Level 35
        experienceTable.add(43808); // Level 36
        experienceTable.add(47846); // Level 37
        experienceTable.add(52127); // Level 38
        experienceTable.add(56660); // Level 39
        experienceTable.add(61450); // Level 40
        experienceTable.add(66505); // Level 41
        experienceTable.add(71833); // Level 42
        experienceTable.add(77440); // Level 43
        experienceTable.add(83335); // Level 44
        experienceTable.add(89523); // Level 45
        experienceTable.add(96012); // Level 46
        experienceTable.add(102810); // Level 47
        experienceTable.add(109923); // Level 48
        experienceTable.add(117360); // Level 49
        experienceTable.add(125126); // Level 50
        experienceTable.add(133229); // Level 51
        experienceTable.add(141677); // Level 52
        experienceTable.add(150476); // Level 53
        experienceTable.add(159635); // Level 54
        experienceTable.add(169159); // Level 55
        experienceTable.add(179056); // Level 56
        experienceTable.add(189334); // Level 57
        experienceTable.add(199999); // Level 58
        experienceTable.add(211060); // Level 59
        experienceTable.add(222522); // Level 60
        experienceTable.add(234393); // Level 61
        experienceTable.add(246681); // Level 62
        experienceTable.add(259392); // Level 63
        experienceTable.add(272535); // Level 64
        experienceTable.add(286115); // Level 65
        experienceTable.add(300140); // Level 66
        experienceTable.add(314618); // Level 67
        experienceTable.add(329555); // Level 68
        experienceTable.add(344960); // Level 69
        experienceTable.add(360838); // Level 70
        experienceTable.add(377197); // Level 71
        experienceTable.add(394045); // Level 72
        experienceTable.add(411388); // Level 73
        experienceTable.add(429235); // Level 74
        experienceTable.add(447591); // Level 75
        experienceTable.add(466464); // Level 76
        experienceTable.add(485862); // Level 77
        experienceTable.add(505791); // Level 78
        experienceTable.add(526260); // Level 79
        experienceTable.add(547274); // Level 80
        experienceTable.add(568841); // Level 81
        experienceTable.add(590969); // Level 82
        experienceTable.add(613664); // Level 83
        experienceTable.add(636935); // Level 84
        experienceTable.add(660787); // Level 85
        experienceTable.add(685228); // Level 86
        experienceTable.add(710266); // Level 87
        experienceTable.add(735907); // Level 88
        experienceTable.add(762160); // Level 89
        experienceTable.add(789030); // Level 90
        experienceTable.add(816525); // Level 91
        experienceTable.add(844653); // Level 92
        experienceTable.add(873420); // Level 93
        experienceTable.add(902835); // Level 94
        experienceTable.add(932903); // Level 95
        experienceTable.add(963632); // Level 96
        experienceTable.add(995030); // Level 97
        experienceTable.add(1027103); // Level 98
        experienceTable.add(1059860); // Level 99
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
