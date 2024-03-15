package Week_4_List;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        // Create a new ArrayList of strings called classNames
        List<String> classNames = new ArrayList<>();
        // Add some strings to the classNames list
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        // Print the classNames list
        System.out.println(classNames);

        // Remove the string "Project Management" from the classNames list
        classNames.remove("Project Management"); // object remove
        // Print the classNames list after removing "Project Management"
        System.out.println(classNames);

        // Remove the string at index 0 from the classNames list
        classNames.remove(0); // index remove
        // Print the classNames list after removing the string at index 0
        System.out.println(classNames);

    }
}
