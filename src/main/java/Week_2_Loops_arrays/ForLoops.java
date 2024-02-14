package Week_2_Loops_arrays;

public class ForLoops {
    public static void main(String[] args) {

        //TODO REMEMBER A loop is a control flow statement that allows
        // code to be executed repeatedly based on a given condition.
        // For loop is when the number of iterations is known or can be determined beforehand
        // While loop is when the number of iterations is not known beforehand and is based on a condition.
        // Condition is evaluated before each iteration.
        // If it evaluates to true or false, the loop continues; otherwise, the loop terminates.

        // Print numbers 1-5
        for (int x = 0; x < 5; x++){
            System.out.println(x);
        }

        // Print count down 10, 9, 8...0
        for (int y = 10;  y >= 0; y--){
            System.out.println(y);
        }

    }
}
