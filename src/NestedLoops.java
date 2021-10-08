import java.util.Random;
import java.util.Scanner;

public class NestedLoops {


    public static void main(String[] args) {

        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;
        int dice4 = 0;
        int dice5 = 0;
        int dice6 = 0;
        Random rand = new Random();


        boolean isDone = true;
        int count = 0;
        while (isDone) {
            count++;


            for (int index = 0; index <= 5; index++) {
                if (index == 0) {
                    dice1 = rand.nextInt(6);

                } else if (index == 1) {
                    dice2 = rand.nextInt(6);

                } else if (index == 2) {
                    dice3 = rand.nextInt(6);

                } else if (index == 3) {
                    dice4 = rand.nextInt(6);

                } else if (index == 4) {
                    dice5 = rand.nextInt(6);


                } else if (index == 5) {
                    dice6 = rand.nextInt(6);

                }
            }

            if (dice1 == 1 && dice2 == 1 && dice3 == 2 && dice4 == 2 && dice5 == 3 && dice6 == 3) {
                System.out.println(dice1);
                System.out.println(dice2);
                System.out.println(dice3);
                System.out.println(dice4);
                System.out.println(dice5);
                System.out.println(dice6);
                System.out.println("The loop took " + count + " times");
                isDone = false;
            }


        }


    }


}
