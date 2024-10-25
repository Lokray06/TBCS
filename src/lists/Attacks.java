package lists;

import objects.Attack;
import java.util.ArrayList;
import java.util.List;

public class Attacks
{
    public static List<Attack> attacks;

    public Attacks()
    {
        attacks = new ArrayList<>();

        //AAttack(int id, String name, int type, int cat, int power, int acc, int pp, int maxPp, String desc, String effect)
        /*0*/attacks.add
            (new Attack
                    (
                            /*ID*/		0,
                            /*Name*/	"Pound",
                            /*Type*/	1,
                            /*Cat*/		1,
                            /*Power*/	40,
                            /*Acc*/		100,
                            /*PP*/		35,
                            /*Max PP*/	56,
                            /*Desc*/	"The target is physically pounded with a long tail or a foreleg, etc.",
                            /*Effect*/	"Pound inflicts damage and has no secondary effect."
                    )
            );
    }
}