package Week_4_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections {
    public static void main(String[] args) {

        // Create a new ArrayList of strings called classNames
        List<String> classNames = new ArrayList<>();
        // Add some strings to the classNames list
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        // Sort the list in alphabetical order
        System.out.println("Sort example:");
        Collections.sort(classNames);
        System.out.println(classNames);

        // Shuffle the list randomly
        System.out.println("Shuffle example:");
        Collections.shuffle(classNames);
        System.out.println(classNames);

        // Reverse the order of elements in the list
        System.out.println("Reverse example:");
        Collections.reverse(classNames);
        System.out.println(classNames);

        // Find the minimum element in the list (alphabetically first).
        System.out.println("Min example:");
        String alphabeticalFirst = Collections.min(classNames);
        System.out.println(alphabeticalFirst);

        // Find the maximum element in the list (alphabetically last)
        System.out.println("Max example:");
        String alphabeticalLast = Collections.max(classNames);
        System.out.println(alphabeticalLast);
    }
}
