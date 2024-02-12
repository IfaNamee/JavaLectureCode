package Week_2_Loops_arrays;

import static input.InputUtils.intInput;

public class busExpenses {
    public static void main(String[] args) {

        int numberDay = 7;   // Variable integer to store a day
        double total = 0;    // Variable double to record total amount.

        for (int day = 1; day <= numberDay; day++){  // Initialize a day 1 to 7.
            double amountSpend = intInput("What did you spend on bus " +
                    "fares on day " + day); // Ask user to enter
            total = total + amountSpend;    // Store add all amounts and store.
        }
        System.out.printf("Total for the week = $%.2f", total);   // Print result.
    }
}
