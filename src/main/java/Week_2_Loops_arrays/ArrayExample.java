package Week_2_Loops_arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        //TODO REMEMBER Array is a data structure that stores a fixed-size sequential
        // collection of elements of the same type. Strings or Numbers.

        // Example int array.
        int [] number = new int[5]; // initialize how many data we want store 5.
        number[0] = 2;  // array start with zero
        number[1] = 4;  // data stored in 1
        number[2] = 6;  // data stored in 2
        number[3] = 8;  // data stored in 3
        number[4] = 10; // last data we can store in array 4

        // Also we can store array by using curly brackets, separated by commas
        int [] num = {2,4,6,8,10};  // store data using curly bracket

        System.out.println("This is first number in array " + number[0] +
                "\nThis is last number in array " + number[4]); // Print result.

        System.out.println("This is array by using curly brackets, separated by commas ");
        System.out.println("This is first number in array " + num[0] +
                "\nThis is last number in array " + num[4]); // Print result.

        // Example String array
        String[] string = new String[3];   // initialize how many data we want store 3.
        string[0] = "Java"; // first data store.
        string[1] = "C#";   // second data.
        string[2] = "Web";  // last data store

        System.out.println("First string in array is " + string[0]);

        // Using array name and '.length' to find out how many arrays we have.
        // For example to find out array in number we create first.
        int ExampleNumber = number.length;
        System.out.println("We have " + ExampleNumber + " elements.");

        // To find out string element we in second program.
        int ExampleString = string.length;
        System.out.println("We have " + ExampleString + " elements.");

        // Array and loop together.
        // For the number array we created before.
        for (int y = 0; y < 5; y++){
            System.out.println("List of number stored in array " + number[y]);
        }

        // For the string array we created before.
        for (int x = 0; x < string.length; x++){ // String.length = 3 or base on initialized.
            System.out.println("Class name stored in array " + string[x]);
        }

        // To print out array in curly brackets, separated by commas
        System.out.println(Arrays.toString(num));     // Print message
        System.out.println(Arrays.toString(string));  // Print message

    }
}
