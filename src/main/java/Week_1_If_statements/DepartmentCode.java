package Week_1_If_statements;

import java.util.Locale;

import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {

        String departmentCode = stringInput("Enter department code");

        // check for valid code, ITET, BTEC, ENGL, MATH...

        if (departmentCode.length() == 4){
            System.out.println("This code is valid.");
            departmentCode = departmentCode.toUpperCase();
            System.out.println("This code is " + departmentCode);
        } else {
            System.out.println("The code is  not valid");
        }
    }
}
