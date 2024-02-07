package Week_1_If_statements;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {

        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you? ");
        int age = intInput();

        // Using the AND '&&' operator to test if things are true.
        // a person can be a blood donor if they weigh at least 110lbs are 17 0r over
        if (weight >= 110 && age >= 17) { // if weight is 110lbs or above and if age 17 or above.
            System.out.println("You are eligible to be a blood donor.");
        } else {  // else statement is applying if above listed are false.
            System.out.println("Sorry, You are not eligible.");

            // if statement is identifiers  which is statement is fail and display message
            if (weight < 110){ // if weigh is less than 110lbs
                System.out.println("You do not weigh enough."); // print message.
            }
            if (age <17){ // if age is less than 17.
                System.out.println("You must be 17 or more"); // display result.
            }
        }
    }
}
