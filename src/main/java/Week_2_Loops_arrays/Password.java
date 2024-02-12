package Week_2_Loops_arrays;

import static input.InputUtils.stringInput;

public class Password {
    public static void main(String[] args) {

        String secretPassword = "kittens"; // Variable string to store a password.
        String userPassword = stringInput("Enter the password "); // Ask user to enter String.

        int maxGuesses = 5;

        // Before we let user in, we need to check that password correct.
        // This loop will repeat while the password in not "kittens".

        while (! userPassword.equals(secretPassword) && maxGuesses > 1) {  // will check if it false
            System.out.println("Incorrect password, access denied!\nTry again"); // Print message.
            userPassword = stringInput("Enter the password ");  // Ask user to enter String.
            maxGuesses--;  // Variable to decrease guesses enter and store.

        }
        // if statement let user try max guesses and after max guesses exit program
        if (maxGuesses > 1) {  // will count max guesses to initialize number .
            System.out.println("Correct password - access granted"); // Print message.
        } else { // will apply if user is rich max guesses
            System.out.println("Max number of password attempts."); // Print message.
        }

    }
}
