package services.menu;

import java.util.Scanner;

public class CombatMainMenu implements MenuInterface
{
    @Override
    public void display()
    {
        System.out.println("1. Attack");
        System.out.println("2. Bag");
        System.out.println("3. Run");
        System.out.println("4. Pokemon");
    }
    
    @Override
    public void choose(Scanner sc)
    {
        System.out.println("Choose (1-4)");
        int option = sc.nextInt()-1;
        doOption(option);
    }
    
    private void doOption(int option)
    {
        switch(option)
        {
            case 0:
            {
                System.out.println("//TODO: Attack Menu");
                break;
            }
            case 1:
            {
                System.out.println("//TODO: Bag Menu");
                break;
            }
            case 2:
            {
                System.out.println("//TODO: Run()");
                break;
            }
            case 3:
            {
                System.out.println("//TODO: Switch pokemon menu");
                break;
            }
        }
    }
}