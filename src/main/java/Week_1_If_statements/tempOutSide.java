package Week_1_If_statements;

import static input.InputUtils.intInput;

public class tempOutSide {
    public static void main(String[] args) {

        // The Symbol || are used for testing if one condition
        // or another condition or both condition is true

        System.out.println("What is outside temperature? ");
        int outSide = intInput();

        System.out.println("What is outside windchill? ");
        int windChill = intInput();

        if (outSide < 20 || windChill < -30){
            System.out.println("Brrr, stay inside");
        } else{
            System.out.println("You can go outside temperature is good.");
        }
    }
}
