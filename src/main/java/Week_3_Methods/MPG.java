package Week_3_Methods;

import static input.InputUtils.doubleInput;

public class MPG {

    // method is used to prompt the user to enter the number of miles driven and the gallons of gas used.
    public static void main(String[] args) {
        double miles = doubleInput("Enter number of miles driven: "); // Ask user To enter double number.
        double gas = doubleInput("Enter gallons of gas used: ");  // Ask user To enter double number.

        double mpg = milesPerGallon(miles,gas); // Stored in the miles and gas variables in mpg.
        System.out.println("The MPG for this journey is " + mpg + " miles per gallon"); // Print result.
    }


    // The miles and gas variables are passed as parameters to the milesPerGallon method.
    // The mpg variable contains the outcome.
    public static double milesPerGallon(double miles, double gallonOfGas){
        double mpg = miles / gallonOfGas; // Math formula to calculate.
        return mpg; // Return value mpg.
    }
}
