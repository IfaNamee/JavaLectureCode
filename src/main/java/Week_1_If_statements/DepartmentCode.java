package Week_1_If_statements;

import java.util.Locale;

import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {

        // Prompt and ask user to enter.
        String departmentCode = stringInput("Enter department code");

        // Using '.length()' to see how many character we use.
        if (departmentCode.length() == 4){ // check if character is entered is equal 4.
            System.out.println("This code is valid."); // Print message.
            departmentCode = departmentCode.toUpperCase(); // Change character to upper case.
            System.out.println("This code is " + departmentCode); // Print message.
        } else { // return statement to false.
            System.out.println("The code is  not valid"); // Print message.
        }
    }
}
