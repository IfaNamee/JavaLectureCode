package Week_1_If_statements;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // length method in Java, the '.length()' method is used to find the
        // - length of a string , number of characters in the string.
        String hello = "Hello, World!";  // String variable that store data as String.
        int length = hello.length();     // int variable that store data as integer number
        System.out.println(length);      // Print message of how many character we used in number.

        // Lowercase
        // The '.toLowerCase()' method converts all characters in the string to lowercase.
        String word = "HELLO, WORLD";        // String variable that store data as String.
        String lower = word.toLowerCase();   // Converts all character to lowercase.
        System.out.println(lower);           // Print message.

        // Uppercase
        // The '.toUpperCase()' method converts all characters in the string to uppercase.
        String world = "hello, world";        // String variable that store data as String.
        String upper = world.toUpperCase();   // Converts all character to lowercase.
        System.out.println(upper);            // Print message.

        // ends with
        // The 'endsWith()' method is used to determine whether a string ends with a specified suffix.
        String  ends = "email@gmail.com";
        // Using boolean method
        boolean end = ends.endsWith("com");  // True end with 'com'.
        System.out.println(end);

        // Using another option
        System.out.println(ends.endsWith("com")); // True end with 'com'.
        System.out.println(ends.endsWith("edu")); // false end with 'edu'.

        if (ends.endsWith("com")){ // will check if email is end 'com'
            System.out.println("This is personal email address."); // print Message.
        } else { // will check if statement is false.
            System.out.println("Thi is not personal email address."); // Print message.
        }

        // starts with
        // The 'startsWith()' method is used to determine whether a string starts with a specified suffix.
        System.out.println(ends.startsWith("email")); // True start with 'email'.
        System.out.println(ends.startsWith("com")); // false start with 'com'.

        if (ends.startsWith("email")){ // will check if email is start 'email'
            System.out.println("Correct it is start with 'email'. " + ends); // print Message.
        } else { // will check if statement is false.
            System.out.println("This is not start with 'email'."); // Print message.
        }

        // Contains
        // The 'contains()' method is used to check whether a string contains a -
        // specified sequence of characters. It returns true
        String contain = "How are you doing?";
        System.out.println(contain.contains("are")); // True, 'are' it contains with in.
        System.out.println(contain.contains("doing?")); // True 'doing?' is in contains.
        System.out.println(contain.contains("good"));   // false 'good' is not in contains.

        // Split sentence into words
        // The 'split()' method divides a string into an array of parts based on a specified.
        String java = "Java programming is not hard";
        String[] program = java.split(" ");
        System.out.println(Arrays.toString(program));

        for (int x = 0; x < program.length; x++){
            System.out.println(program[x]);
        }
    }
}
