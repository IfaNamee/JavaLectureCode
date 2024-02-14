package Week_2_Loops_arrays;

public class January {
    public static void main(String[] args) {

        // Prompt what this program do.
        System.out.println("Here are all the dates in January");

        /* Initialize January days between 1 and 31 */
        for (int day = 1; day <= 31; day++) {  // Variable with start number and end number.
            if (day == 1 || day == 21 || day == 31) { // will check if it has 'st' at the end.
                System.out.println("January " + day + "st");  // Print result
            } else if (day == 2 || day == 22) {  // will check if it has 'nd' at the end.
                System.out.println("January " + day + "nd");  // Print result
            } else if (day == 3 || day == 23) {  // will check if it has 'rd' at the end.
                System.out.println("January " + day + "rd");  // Print result
            } else { // will check if it has 'th' at the end.
                System.out.println("January " + day + "th");  // Print result.
            }
        }
    }
}
