import battle.Combat;
import model.Party;
import model.Pokemon;

import static util.Printer.*;

public class Main
{
    public static void main(String[] args)
    {
        Pokemon pokemon1 = new Pokemon(448, "PERRO", "female",100000, true);
        Pokemon pokemon2 = new Pokemon(48,  100000);
        
        Party playerParty = new Party(pokemon1, pokemon2);
        Party enemyParty = new Party(pokemon2);
        printParty(playerParty.getPokemonsNotNull());
        
        Combat combat = new Combat(playerParty, enemyParty);
        combat.init();
    }
}