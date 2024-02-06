package Week_1_If_statements;

import static input.InputUtils.yesNoInput;

public class takenClass {
    public static void main(String[] args) {
        System.out.println("This program will check if you meet per-requirement to register ");
        System.out.println("Please answer the following three questions");

        boolean gradHigh = yesNoInput("Did you graduate high school");
        boolean itecClass = yesNoInput("Have you take ITEC 1110 class? ");
        boolean windows = yesNoInput("Have you tahe 1100 class?");

        // use AND operator in the condition to check if all of the pre_requirement are meet.
        if (gradHigh && itecClass && windows){
            System.out.println("You meet pre-requirement.");
        } else {
            System.out.println("You do not meet the pre-requirement.");
        }
    }
}
