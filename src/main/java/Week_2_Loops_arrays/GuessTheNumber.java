package Week_2_Loops_arrays;

import java.util.Random;
import static input.InputUtils.intInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random(); // Random number object generator object.
        int secretNumber = random.nextInt(0,10);  // Generate a random number 1-9 and store.

        int guess = intInput("Guess the number!");  // Ask user to enter integer number.

        while (guess != secretNumber){ // will check if statement is false.
            System.out.println("That's wrong, try again!"); // Print message

            if (guess < secretNumber){ // check if input is higher than entered.
                System.out.println("Guess is higher!"); // Print message
            }
            if (guess > secretNumber){ // check if input is lower than entered.
                System.out.println("Guess is lower!");  // Print message
            }
            guess = intInput("Guess the number!"); // Ask user to enter integer number again.
        }
        System.out.println("Correct!"); // Print message
    }
}
