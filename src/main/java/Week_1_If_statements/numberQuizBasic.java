package Week_1_If_statements;

import static input.InputUtils.intInput;

public class numberQuizBasic {
    public static void main(String[] args) {

        // int variable to store data
        int secretNUmber = 6;

        // Prompt and ask user to enter in number only.
        int guess = intInput("Guess the number I am thinking of? ");

        // Using '==' operator to check if user enter are equal or match.
        if (guess == secretNUmber) { // will check if statement is true.
            System.out.println("You guessed correctly."); // Print message.
        } else { // will check is statement is false.
            // else statement run if it wrong and tell the answer.
            System.out.println("Sorry, I was thinking of " + secretNUmber); // Print message.
        }

    }
}
