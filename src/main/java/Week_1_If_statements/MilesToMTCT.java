package Week_1_If_statements;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMTCT {
    public static void main(String[] args) {

        // Prompt and ask user to enter.
        double miles = positiveDoubleInput("How many miles your house from MTCT? ");
        double km =  miles * 1.6; // math calculator to convert mile to km.
        System.out.println("You live " + km + " km away from MTCT."); // Print message.

        if (miles > 10){ // check if miles more than 10
            System.out.println("You live more 10 miles away from MTCT."); // Print message.
        } else if (miles == 10) { // check if miles is equal 10.
            System.out.println("You live exactly 10 miles away from MTCT."); // Print message.
        } else { // check if statement is false.
            System.out.println("You live less 10 miles away from MTCT. "); // Print message.
        }
    }

}
