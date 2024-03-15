package Week_4_List;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        // Create a new ArrayList of strings
        List<String> arrayList = new ArrayList<>();

        // Add some strings to the ArrayList.
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Ifa");
        arrayList.add("MTCT");

        for (String s: arrayList) {
            // Print the string in list
            System.out.println(s);
            // Print the string in uppercase
            System.out.println(s.toUpperCase());
            // Print the length of the string
            System.out.println(s.length());
        }
        // Print the ArrayList
        System.out.println(arrayList);
        // Print the ArrayList converted to a string and in uppercase
        System.out.println(arrayList.toString().toUpperCase());
    }
}
