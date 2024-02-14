package Week_2_Loops_arrays;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String[] args) {

        // Display a square of *
        int size = positiveIntInput("Enter size of square?"); // Ask user to enter.

        // The outer loop prints one row per loop repeat
        for (int x = 0; x < size; x++) {

            // Inner for loop. For each row, print a star 'size' times
            for (int y = 0; y < size; y++) {
                // Notice System.out.print - not println. This doesn't add the newline
                // at the end of the output, so all the stars are on same line.
                System.out.print("* ");
            }

            // And then to the next line
            System.out.println();
        }
    }
}
