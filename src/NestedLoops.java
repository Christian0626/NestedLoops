import java.util.Random;
import java.util.Scanner;

public class NestedLoops {


    public static void main(String[] args) {

        Random rand = new Random();
        int count;
        int diceSet = 0;
        Scanner input = new Scanner(System.in);
        String askAgain;
        do {

            for (count = 1; count <= 6; count++) {
                int diceRoll = rand.nextInt(7);
                diceSet++;
                if (count == 1) {
                    if (diceRoll == 1) {
                        System.out.println("You first roll was equal to a: " + diceRoll);
                    }
                }
                if (count == 2) {
                    if (diceRoll == 2) {
                        System.out.println("Your second roll was equal to a:  " + diceRoll);
                    }
                }
                if (count == 3) {
                    if (diceRoll == 3) {
                        System.out.println("Your third roll was equal to a:  " + diceRoll);
                    }
                }
                if (count == 4) {
                    if (diceRoll == 4) {
                        System.out.println("Your fourth roll was equal to a:  " + diceRoll);
                    }
                }
                if (count == 5) {
                    if (diceRoll == 5) {
                        System.out.println("Your fifth roll was equal to a:  " + diceRoll);
                    }
                }
                if (count == 6) {
                    if (diceRoll == 6) {
                        System.out.println("Your sixth roll is a equal to a:  " + diceRoll);
                    }
                }

            }
            System.out.println("Would you like to roll again? Y for (YES). Enter any other letter to exit program when dice roll sequence has been achieved!" +
                               "\nIf you roll 1,2,3 etc in a row. Your result will be displayed.");
            askAgain = input.nextLine();
        } while (askAgain.equalsIgnoreCase("y"));
        System.out.println("It took " + diceSet + "times to get all dice to be rolled in a row");


    }


}
