package Week_1_If_statements;

import static input.InputUtils.intInput;

public class AboveFreezing {
    public static void main(String[] args) {

<<<<<<< HEAD
        // Prompt and Ask user to enter
        System.out.println("Enter today's temperature in F? ");

        // double variable is store int input and store as temp.
        double temp = intInput();

        // This will run if statement is true.
        if (temp > 32) { // if statement will check if temperature is above 32
            System.out.println("It's above freezing");
        } else { // else statement is applying  if temperature is under 32 and 32
=======
        System.out.println("Enter today's temperature in F? ");
        double temp = intInput();

        // This will run if statement is true.
        if (temp > 32){
            System.out.println("It's above freezing");
        } else {
>>>>>>> origin/master
            System.out.println("It's below freezing");
        }

    }
}
