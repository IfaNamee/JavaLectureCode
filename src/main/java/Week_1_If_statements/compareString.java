package Week_1_If_statements;

import static input.InputUtils.stringInput;

public class compareString {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        if (college.equalsIgnoreCase("MTCT")){
            System.out.println("Yay, MTCT");
        }else {
            System.out.println("Too bad, you should check out MTCT!.");
        }
    }
}
