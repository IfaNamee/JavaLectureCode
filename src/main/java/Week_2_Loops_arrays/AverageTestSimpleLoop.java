package Week_2_Loops_arrays;

import static input.InputUtils.doubleInput;

public class AverageTestSimpleLoop {
    public static void main(String[] args) {

        // calculate the average of 5 test scores

        int numberOfTests = 5;       // Variable integer to store number of tests.
        double testScore;            // Variable double to record each test.
        double testScoreSum = 0.0;   // Variable double To store all tests score.
        double testAverage;          // Variable double to store average.

        for (int test = 1; test <= numberOfTests; test++){   // initialize star and end number.
            testScore = doubleInput("Enter Test score #" + test); // Ask user to enter
            testScoreSum = testScoreSum + testScore;  // Math to store add all numbers.
        }

        testAverage = testScoreSum / numberOfTests;  // Math to calculate average and store.
        System.out.println("Average score = " + testAverage);  // Print message.
    }
}
