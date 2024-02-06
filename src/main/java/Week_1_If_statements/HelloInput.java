package Week_1_If_statements;

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {

        String name = stringInput("Please enter your name? ");
        System.out.println("Hello, " + name + "!");

        // intInput is accepted whole number 0, negative numbers and positive numbers
        int numberOfClasses = intInput("How many classes are you taking this semester?");
        System.out.println("You are taking " + numberOfClasses + " classes this semester.");

        // positiveInput is accepted only positive numbers
        int numberOfClasses1 = positiveIntInput("How many classes are you taking this semester?");
        System.out.println("You are taking " + numberOfClasses1 + " classes this semester.");

    }
}
