/*
 * This program allows the users to input 10 integers and output their total.
 */

import java.util.Scanner;

public class LoopCompAssign {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;
        String msg = "";

        // Loop should start here
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    msg = "st";
                    break;

                case 2:
                    msg = "nd";
                    break;

                case 3:
                    msg = "rd";
                    break;

                default:
                    msg = "th";
                    break;
            }
            System.out.printf("Enter %d%s integer: ", i, msg);
            num = keyboard.nextInt();
            total += num;
            // Loop should end here
        }

        System.out.println("The total of all 10 numbers is " + total);

    }

}