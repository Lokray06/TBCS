package services;

import lists.Party;
import pokemons.Pokemon;

import java.io.IOException;

public class CombatPrinter
{
    public static final char alive = '◉';
    public static final char fainted = '◎';
    public static final char empty = '○';
    public static final char state = '◍';
    
    public void print(Party player, Party enemy)
    {
        printPokemon(enemy);
        printPokemon(player);
    }
    
    public void printArray(char[] array)
    {
        for(char c : array)
        {
            System.out.print(c + " ");
        }
    }
    
    public char[] partyState(Party party)
    {
        char[] array = new char[6];
        
        for(int i = 0; i < array.length; i++)
        {
            if(i < party.getPokemons().length)
            {
                Pokemon pokemon = party.getPokemon(i);
                if(pokemon != null) // Check if the Pokémon exists
                {
                    if(!pokemon.isFainted())
                    {
                        array[i] = alive;
                    }
                    else
                    {
                        array[i] = fainted;
                    }
                }
                else
                {
                    array[i] = empty;
                }
            }
            else
            {
                array[i] = empty;
            }
        }
        
        return array;
    }
    
    
    private void printPokemon(Party party)
    {
        Pokemon pokemon = party.getPokemon(0);
        System.out.print("\n\n");
        System.out.println(pokemon.getName() + ", Lvl: " + pokemon.getLevel());
        System.out.println("HP: " + pokemon.getHp() + "/" + pokemon.getBaseHp());
        printArray(partyState(party));
    }
    
    public void clear() throws IOException
    {
        Runtime.getRuntime().exec("cls");
        System.out.println("\u001B[2J");
        String lowerOSName = System.getProperty("os.name").toLowerCase();
        
        if(lowerOSName.contains("window")) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}