import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main
{
    public static void main(String[] args)
    {
        //Get a move choice from playerA which must be R, P, S or r, p, s
        // Loop until you get a valid move
        //Get a move choice from playerB in the same manner
        //Display the results using the accepted phrases from the game
        // Rock breaks Scissors,
        // Paper covers Rock,
        // Scissors cuts Paper
        // and indicate the winner (Player A wins) or
        // Rock vs Rock it’s a Tie!  Etc…
        //Prompt the user to play again [Y/N]
        //Continue or terminate based on the user’s choice

        Scanner in = new Scanner(System.in);
        String trash;
        boolean validInput = false;
        boolean continuePlaying = false;

        String playerA;
        String playerB;
        String challengeAgain;

        Timer timer = new Timer();
        boolean youFool = false;

        do
        {
            //playerA
            do
            {
                System.out.print("Player A, choose your weapon [R P S]: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                {
                    validInput = true;
                }
                else if (playerA.equalsIgnoreCase("C"))
                {
                    youFool = true;
                    System.out.println("C stands for Crazy, and you know what that reminds me of?");
                    while(youFool)
                    {
                        System.out.println("Crazy? I was crazy once");
                        System.out.println("They locked me in a room");
                        System.out.println("A rubber room");
                        System.out.println("A rubber room with rats");
                        System.out.println("The rats drove me crazy");
                    }
                }
                else
                {
                    trash = playerA;
                    playerA = "";
                    System.out.println("You incorrectly entered " + trash + ", and you're going to need to be better prepared for this battle!");
                }
            } while(!validInput);

            validInput = false;

            //playerB
            do
            {
                System.out.print("Player B, choose your weapon [R P S]: ");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                {
                    validInput = true;
                }
                else if (playerB.equalsIgnoreCase("C"))
                {
                    youFool = true;
                    System.out.println("C stands for Crazy, and you know what that reminds me of?");
                    while(youFool)
                    {
                        System.out.println("Crazy? I was crazy once");
                        System.out.println("They locked me in a room");
                        System.out.println("A rubber room");
                        System.out.println("A rubber room with rats");
                        System.out.println("The rats drove me crazy");
                    }
                }
                else
                {
                    trash = playerB;
                    playerB = "";
                    System.out.println("You incorrectly entered " + trash + ", and you're going to need to be better prepared for this battle!");
                }
            } while(!validInput);

            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock is equal to rock; The battle was a draw!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers rock; Player B is victorious!");
                }
                else //playerB S
                {
                    System.out.println("Rock breaks scissors; Player A is victorious!");
                }
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers rock; Player A is victorious!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper is equal to paper; The battle was a draw!");
                }
                else //playerB S
                {
                    System.out.println("Scissors cut paper; Player B is victorious!");
                }
            }
            else //playerA S
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks scissors; Player B is victorious!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cut paper; Player A is victorious!");
                }
                else //playerB S
                {
                    System.out.println("Scissors are equal to scissors; The battle was a draw!");
                }
            }

            validInput = false;

            do
            {
                System.out.print("Ready for another challenge? [Y N]: ");
                challengeAgain = in.nextLine();
                if (challengeAgain.equalsIgnoreCase("Y"))
                {
                    continuePlaying = true;
                    validInput = true;
                }
                else if (challengeAgain.equalsIgnoreCase("N"))
                {
                    continuePlaying = false;
                    validInput = true;
                    System.out.println("Come back anytime to battle again!");
                }
                else if (challengeAgain.equalsIgnoreCase("L"))
                {
                    System.out.println("Well that was a little rude, please do not L the opponent; Let's try that again...");
                }
                else if (challengeAgain.equalsIgnoreCase("C"))
                {
                    youFool = true;
                    System.out.println("C stands for Crazy, and you know what that reminds me of?");
                    while(youFool)
                    {
                        System.out.println("Crazy? I was crazy once");
                        System.out.println("They locked me in a room");
                        System.out.println("A rubber room");
                        System.out.println("A rubber room with rats");
                        System.out.println("The rats drove me crazy");
                    }
                }
                else
                {
                    trash = challengeAgain;
                    challengeAgain = "";
                    System.out.println("You incorrectly entered " + trash);
                    continuePlaying = false;
                    validInput = false;
                }
            } while(!validInput);
        } while(continuePlaying);
    }
}