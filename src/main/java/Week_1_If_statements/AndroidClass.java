package Week_1_If_statements;

import static input.InputUtils.yesNoInput;

public class AndroidClass {
    public static void main(String[] args) {

        System.out.println("This program will check if you can take Android programming class");
        System.out.println("Please answer these there question");

        boolean takenCsharp = yesNoInput("Have you taken C# (ITEC 2505) programming?");
        boolean takenJava = yesNoInput("Have you taken Java (ITEC 2545) programming?");

        // Use an OR '||' operator in the condition to check if one or both is true.
        if (takenCsharp || takenJava){
            System.out.println("You meet pre-requisites, you can take Android programming.");
        } else{
            System.out.println("You do not meet pre-requisites, you can not take Android programming. ");
        }
    }
}
