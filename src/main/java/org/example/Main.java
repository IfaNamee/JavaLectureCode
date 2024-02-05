package org.example;

import static input.InputUtils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String userName = stringInput("Please enter your name: ");
        System.out.println("Hello, " + userName);

        int howManyClasses = positiveIntInput("How many classes are you taking? ");

        String units = "classes";

        if (howManyClasses == 1){
            units = "class";
        }

        System.out.println("You are taking " + howManyClasses + " " + units + " classes");
        System.out.printf("You are taking %d %s classes", howManyClasses, units);

    }
}