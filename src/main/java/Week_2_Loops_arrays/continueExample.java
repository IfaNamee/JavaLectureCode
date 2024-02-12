package Week_2_Loops_arrays;

public class continueExample {
    public static void main(String[] args) {

        for (int x = 0; x < 5; x++) {
            if (x == 2) { // check if x equal 2.
                continue; // Skip the identify loop body "2" and continue -
                          // with the next iteration when until to get initialize number '5'.
            }
            System.out.println(x); // Print message.
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 2) { // check if i equal 2.
                    continue; // Skip the current iteration when i equals 2 and continue next loop.
                }
                System.out.println(i); // Print message.
            }
        }

    }
}
