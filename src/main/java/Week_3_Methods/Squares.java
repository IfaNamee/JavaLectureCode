package Week_3_Methods;

import static input.InputUtils.doubleInput;

public class Squares {

    // THis is the main method - the first code to run
    public static void main(String[] args) {

        // Prompt program and ask user to enter double number and store.
        double number = doubleInput("Please enter a number and I'll square it.");
        square(number);
        double squared = square1(number);
        System.out.println("The square of " + number + " is " + squared); // Print message.
    }

    // This method takes one argument, a number.
    // It calculates the square of the number by multiply original number and print out.
    private static void square(double number) { // This method is don't return.

        double sq = number * number; // multiply by itself.(by user entered).
        System.out.println("The square of " + number + " is " + sq); // Print message.
    }

    private static double square1(double number) { // This method is return double sq1.
        double sq1 = number * number; // multiply by itself.(by user entered).
        return sq1; // return value to sq1.
    }

}
