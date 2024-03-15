package Week_3_Methods;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {

        // Print a list of number in order
        int smallNumber = intInput("Enter small number: "); // Ask user to enter integer number.
        int largeNumber = intInput("Enter large number: "); // Ask user to enter integer number.

        System.out.println("I will count from " + smallNumber + " to " + largeNumber); // Prompt and print.

        count(smallNumber,largeNumber);  // count parameter create.
    }

    // Methods that don't return.
    public static void count (int min, int max){
        // If we don't need return anything we can use 'void' method.
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}
