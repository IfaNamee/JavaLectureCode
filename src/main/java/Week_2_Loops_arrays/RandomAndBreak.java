package Week_2_Loops_arrays;

import java.util.Random;
import static input.InputUtils.stringInput;
public class RandomAndBreak {
    public static void main(String[] args) {

        while (true) { // checks if while loop is true.
            System.out.println("Would you like a random?");  // Prompt program.
            System.out.println("Enter any key for a random, or Q to quit"); // Prompt and ask user to enter.

            String user = stringInput();  // Variable string to enter string character.

            if (user.equalsIgnoreCase("Q")) { // will check and ignore case.
                break;  // 'Break' statement help us to stop loops or switch
                        // statements under certain conditions. Break must be inside of loop.
            }

            // If we get to this line, the loop didn't break
            // Generate and display a random number.

            Random randomNumber = new Random(); // Variable random number to generate number.
            int random = randomNumber.nextInt(1,100);  // arrange between 1 and 100.
            // .nextInt() with no argument generate a random number
            // from all the possible integer values.

            System.out.println("Your random number is " + random); // Print result.

        }
    }
}
