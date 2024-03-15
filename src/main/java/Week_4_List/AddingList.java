package Week_4_List;

import java.util.ArrayList;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {

        // Create a new ArrayList of integers called classCodes
        List<Integer> classCodes = new ArrayList<>();
        // Add some integers to the classCodes list
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        // Add the integer 1425 at index 0
        classCodes.add(0, 1425);
        // Add the integer 1100 at index 2
        classCodes.add(2,1100);

        // Print the classCodes list
        System.out.println(classCodes);
        // Print the size of the classCodes list.
        System.out.println(classCodes.size());

        // Loop through each integer in the classCodes list
        for (int classCode: classCodes) {
            // Print the integer prefixed with "ITEC"
            System.out.println("ITEC " + classCode);
        }

        classCodes.remove(Integer.valueOf(1250)); // To remove 1250 from list
        System.out.println(classCodes);
    }
}
