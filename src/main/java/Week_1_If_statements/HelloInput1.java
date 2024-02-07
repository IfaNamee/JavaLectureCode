package Week_1_If_statements;

import static input.InputUtils.*;

public class HelloInput1 {
    public static void main(String[] args) {

        String name = stringInput("Please enter your name? ");
        System.out.println("Hello, " + name + "!");

        // positiveInput is accepted only positive numbers
        int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");

        String units = "classes";

        if (numberOfClasses == 1){
            units = "class";
        } else{
        }


        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester.");


    }
}
