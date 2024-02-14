package Week_2_Loops_arrays;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class salesTaxWhileLoop {
    public static void main(String[] args) {

        // Using while loop and boolean condition to calculate task -
        //sale and ask user to continue to run program.
        boolean moreCalculations = true;  // Variable boolean to ask yesNo question.
        double price;    // Variable double to store price.
        double saleTax = 1.07; // Variable double to initialize.

        // While loop repeat as long as the user want to calculations.
        while (moreCalculations) {  // will check wille condition true.

            price = doubleInput("Enter the price "); // Ask user to enter integer number.
            double priceIncTax = price * saleTax;
            System.out.printf("The price plus sales tax is %s", priceIncTax); // Print message.

            // Ask user if user want to continue calculations. boolean condition yesNo answer.
            // Notice that the number moreCalculations Variable is used in the while loop condition.
            moreCalculations = yesNoInput("\nDo you want to continue? ");
        }
        System.out.println("Thanks for using this program - goodbye!"); // Print Message.
    }
}
