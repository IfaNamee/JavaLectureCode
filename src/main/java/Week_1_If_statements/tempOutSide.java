package Week_1_If_statements;

import static input.InputUtils.intInput;

public class tempOutSide {
    public static void main(String[] args) {

        // The Symbol || are used for testing if one condition
        // or another condition or both condition is true

        // Prompt and ask user to enter
        System.out.println("What is outside temperature? ");
        int outSide = intInput(); // ask user to enter integer number only.

        // Prompt and ask user to enter
        System.out.println("What is outside windchill? ");
        int windChill = intInput(); // ask user to enter integer number only.

        // Using OR '||' operator to check the of statement
        if (outSide < 20 || windChill < -30){ // check one or both is true.
            System.out.println("Brrr, stay inside"); // Print message
        } else{ // check if statement is false.
            System.out.println("You can go outside temperature is good."); // Print message.
        }
    }
}
