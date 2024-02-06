package Week_1_If_statements;

import static input.InputUtils.intInput;

public class AboveFreezing {
    public static void main(String[] args) {

        System.out.println("Enter today's temperature in F? ");
        double temp = intInput();

        // This will run if statement is true.
        if (temp > 32){
            System.out.println("It's above freezing");
        } else {
            System.out.println("It's below freezing");
        }

    }
}
