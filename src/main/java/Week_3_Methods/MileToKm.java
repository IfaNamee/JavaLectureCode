package Week_3_Methods;

import static input.InputUtils.doubleInput;

public class MileToKm { //  method is the entry point of the program.

    public static void main(String[] args) { //  method is used to prompt and store miles.

        // Ask and stored in the miles variable.
        double miles = doubleInput("Enter a number of miles: ");
        double km = milesToKm(miles);  // Store double km in milesToKm method.

        System.out.println(miles + " miles is equal to " + km + " kilometers."); // Print result.
    }

    private static double milesToKm(double miles) {
        // The 'milesToKm' method is called with the 'double miles'
        // variable as an argument. The result is stored in the km variable.
        double km = miles * 1.6;
        return km;  // return valve to print.
    }
}
