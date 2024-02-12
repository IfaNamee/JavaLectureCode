package Week_2_Loops_arrays;

import static input.InputUtils.intInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        int secretNumber = 7;  // Variable integer to store secret number.

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
