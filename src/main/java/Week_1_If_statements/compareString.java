package Week_1_If_statements;

import static input.InputUtils.stringInput;

public class compareString {
    public static void main(String[] args) {

        // Ask user to answer only in String character.
        String college = stringInput("Which college do you attend?");

        // Using '.equalsIgnoreCase()' is ignores upper and lower for the answer.
        if (college.equalsIgnoreCase("MTCT")){ // check answer and ignore case.
            System.out.println("Yay, MTCT"); // Display message.
        }else { // else statement will check is it is false.
            System.out.println("Too bad, you should check out MTCT!."); // Display message.
        }
    }
}
