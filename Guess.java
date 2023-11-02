import java.util.Random;
import java.util.Scanner;

class Select{
    int tries;
    private int choose()
    {   
        Random random = new Random(); 
        int x=random.nextInt(51);
        return x;
    }
    void game(int max)
    {
        int tries=0;
        int num=choose();
        Scanner gme = new Scanner(System.in);
        System.out.println("Your number lies between 0 and 50 (inclusive).\n In the easy level, you have "+max+" guesses.");
        do{
            System.out.println("Enter your guess: ");
            int g2= gme.nextInt();
            if (g2==num)
            {
                System.out.println("You have guessed correctly. Congratulations");
                break;
            }
            else if(tries==max)
            {
                System.out.println("Sorry, you have run out of tries. The correct answer is:"+num);
            }
            else if (tries==max-1)
            {
                System.out.println("Last Try");
            }
            else
            {
                System.out.println("Sorry, wrong guess!");
                if(g2>num)
                {
                    System.out.println("Hot");
                }
                else
                {
                    System.out.println("Cold");
                }
                System.out.println("Try again!");
            }
            tries++;
        }while(tries<=max);

    }
    void easy()
    {  
        int max=10;
        game(max);

    }

     void inter()
    {
        int max=5;
        game(max);
    }

     void diff()
    {
        int max=3;
        game(max);
    }
    
}

public class Guess {
    public static void main(String args[])
    {   int exit =0;
        //Instructions on how to play the game.
        System.out.println("\n********************************INSTRUCTIONS********************************");
        System.out.println("This game is a random number guessing game.");
        System.out.println("There are 3 difficulty levels. You may choose your preference. \nFollow the steps below to play:");
        System.out.println("Step 1) Run the Program.");
        System.out.println("Step 2) The compiler will generate a random number for you. When prompted, enter your guess.");
        System.out.println("Step 3) You will be notified whether your guess is Hot(greater than the Answer) or Cold(Further than the answer).");
        System.out.println("Step 4) Keep trying. ALl THE BEST!!!\n");
        //Game begins here.
        System.out.println("GAME STARTS NOW!!!");
        while(exit!=1)
        {
        System.out.println("Select your difficulty level:\n1.Easy\n2.Intermediate\n3.Difficult");
        Scanner obj = new Scanner(System.in);
        Select difflvl = new Select();
        int op = obj.nextInt();

        switch (op) {
            case 1:
                difflvl.easy();
                break;

            case 2:
                difflvl.inter();
                break;

            case 3:
                difflvl.diff();
                break;
            
            default:
                System.out.println("Invalid Input!");
                exit=1;
                break;
        }
    }
    System.out.println("Thanks for playing!");
    }
}
