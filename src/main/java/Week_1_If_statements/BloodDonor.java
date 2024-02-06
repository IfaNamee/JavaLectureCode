package Week_1_If_statements;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {

        // Testing if two things are true with and, the && operator
        // a person can be a blood donor if they weigh at least 110lbs are 17 0r over

        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you? ");
        int age = intInput();

        if (weight >= 110 && age >= 17){
            System.out.println("You are eligible to be a blood donor.");
        } else {
            System.out.println("Sorry, You are not eligible.");

            if (weight < 110){
                System.out.println("You do not weigh enough.");
            }
            if (age <17){
                System.out.println("You must be 17 or more");
            }
        }
    }
}
