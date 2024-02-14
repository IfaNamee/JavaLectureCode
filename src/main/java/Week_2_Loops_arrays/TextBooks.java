package Week_2_Loops_arrays;

import java.util.Arrays;
import static input.InputUtils.stringInput;

public class TextBooks {
    public static void main(String[] args) {

        String[] textBooks = new String[5]; // Create an array to store 5 string.

        // Loop repeats 5 times. Notice the loop counter variable 'number'.
        for (int number = 0; number < textBooks.length; number++) { // Initialize by textbook entered.

            // Get data about one book from the user.
            String bookName = stringInput("Enter book name of textbook ");

            // Using the loop counter to write to each array elements in turn.
            textBooks[number] = bookName; // Store data entered in array.
        }
        System.out.println("Thank you, here is the data you entered ");  // Print result.
        System.out.println(Arrays.toString(textBooks)); // Print data entered by user.
    }
}
