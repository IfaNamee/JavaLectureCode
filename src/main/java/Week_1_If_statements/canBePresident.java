package Week_1_If_statements;

import static input.InputUtils.intInput;
import static input.InputUtils.yesNoInput;

public class canBePresident {
    public static void main(String[] args) {

        // prompts introduction what this program do.
        System.out.println("Are you eligible to become a president of the United State?");
        System.out.println("Please answer these there question");

        // Using boolean statement to ask user to enter yes or no answer
        boolean citizen = yesNoInput("Were you born in the United State?");
        int age = intInput("How old are you? "); // ask user to enter age only in number.
        int liveUsa = intInput("How long you lived in United State? "); // ask user to enter in number.

        // Using AND '&&' operator to check if they meet requirement.
        if (citizen && age >= 35 && liveUsa >= 14){ // check if boolean is true or yes, age and lived is meet.
            System.out.println("You are eligible to become a president. "); // Display result
        } else{ // else statement is play if one or more is false.
            System.out.println("Sorry, you do not meet the requirement."); // Display result.
        }
    }
}
