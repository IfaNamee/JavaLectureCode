package Week_2_Loops_arrays;

public class oilChange {
    public static void main(String[] args) {

        int mileage = 150000;   // Variable to store mileage
        int interval = 3000;    // Variable to store interval or oil change circle.

        for (int oilChange = 0; oilChange < 10; oilChange++){    // initialize amount print.
            mileage = mileage + interval; // Math formula to add mileage.
            System.out.println("Get oil change at " + mileage + " miles."); // Print result.
        }

        // Another from to loop
        int mileage1 = 150000;  // Variable to store mileage.
        int interval1 = 30000;  // Variable to store interval or oil change circle.

        System.out.println("...................."); // Used to separate.

        // initialize amount you want to print out and math formula to add mileage.
        for (int miles = mileage1; miles < (mileage1 + 10 * interval1); miles+=interval1){
            System.out.println("Get oil change at " + miles + " miles."); // Print result.
        }
    }
}
