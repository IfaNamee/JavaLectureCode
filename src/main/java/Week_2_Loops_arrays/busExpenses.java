package Week_2_Loops_arrays;

import static input.InputUtils.intInput;

public class busExpenses {
    public static void main(String[] args) {

        // Store string in arrays.
        String[] dayNames = { "Monday", "Tuesday", "Wednesday", "Thursday" ,"Friday", "Saturday" , "Sunday"};
        double total = 0;    // Variable double to record total amount.

        for (int day = 0; day < dayNames.length; day++){  // Initialize a days in arrays 0 t0 6.
            String dayName = dayNames[day]; // Identify what is in array String.
            double amountSpend = intInput("What did you spend on bus " +
                    "fare on day " + dayName + "?"); // Ask user to enter
            total = total + amountSpend;    // Store add all amounts and store.
        }
        System.out.printf("Total for the week you spend on bus fare is $%.2f", total);   // Print result.
    }
}
