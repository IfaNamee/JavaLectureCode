package Week_3_Methods;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {

        // The 'main' method is used to prompt the user to enter the number of credits required by the
        // program and the number of credits earned by the student
        int required = intInput("How many credits does your program required? ");
        int earned = intInput("How many credits you earned? ");

        // The 'int creditsToGraduate' stored in the required and earned variables.
        int creditsToGraduate = howManyCreditsToGraduate(required,earned);

        // Print result.
        System.out.printf("You need %d credits to graduate. You've got this!", creditsToGraduate);
    }

    // The 'howManyCreditsToGraduate' method is take parameter required and earned variables as arguments.
    public static int howManyCreditsToGraduate(int creditNeeded, int creditsEarned){
        int creditsToGraduate = creditNeeded - creditsEarned; // Math to calculates
        return creditsToGraduate;  // return result and pass to print.
    }
}
