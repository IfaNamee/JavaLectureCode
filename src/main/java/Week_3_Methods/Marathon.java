package Week_3_Methods;

public class Marathon {
    public static void main(String[] args) {

        // Variables are declared
        double start = 1;        // Variable start point.
        double end = 26.2;       // Variable of plan to run.
        double increase = 1.10;  // Variable to increase per week.

        int week = 1; //  integer variable week is initialized to 1

        while (start < end){  // While loop iterates as long as start is less than end.
            System.out.println(week + " " + start);  // Prints message.
            start = start * increase;  //  Multiplying it with the increase percentage.
            week++;   // counter week incremented by 1.
        }

        System.out.println(week + " " + start); // Print message.

    }
}
