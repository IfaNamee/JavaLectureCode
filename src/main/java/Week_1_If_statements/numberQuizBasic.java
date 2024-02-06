package Week_1_If_statements;

import static input.InputUtils.intInput;

public class numberQuizBasic {
    public static void main(String[] args) {

        int secretNUmber = 6;

        int guess = intInput("Guess the number I am thinking of? ");

        if (guess == secretNUmber){
            System.out.println("You guessed correctly.");
        } else {
            // else statement run if it wrong and tell the answer.
            System.out.println("Sorry, I was thinking of " + secretNUmber);
        }

    }
}
