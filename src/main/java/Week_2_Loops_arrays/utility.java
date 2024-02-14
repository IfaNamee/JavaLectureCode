package Week_2_Loops_arrays;

import static input.InputUtils.intInput;
public class utility {
    public static void main(String[] args) {

        // Array containing the names of months
        String[] months = {"January", "February", "March", "April", "May", "Jun", "July",
                "August", "September", "October", "November", "December"};

        // Variables to store the average and sum
        double ave;
        double sum = 0;

        // Loop through each month
        for (int each = 0; each < months.length; each++) {
            // Get the name of the month
            String month = months[each];

            // Prompt the user for the amount paid for this month
            double amount = intInput("Enter amount you paid for " + month + "?");

            // Add the amount to the total sum
            sum += amount;
        }

        // Calculate the average after the loop has finished
        ave = sum / months.length;

        // Print the average amount paid per month
        // Using printf to format the output with two decimal places
        System.out.printf("Average amount paid per month: %.2f", ave);
    }
}
