package Week_1_If_statements;

import static input.InputUtils.intInput;
import static input.InputUtils.yesNoInput;

public class canBePresident {
    public static void main(String[] args) {

        System.out.println("Are you eligible to become a president of the United State?");
        System.out.println("Please answer these there question");

        boolean citizen = yesNoInput("Were you born in the United State?");
        int age = intInput("How old are you? ");
        int liveUsa = intInput("How long you lived in United State? ");

        if (citizen && age >= 35 && liveUsa >= 14){
            System.out.println("You are eligible to become a president. ");
        } else{
            System.out.println("Sorry, you do not meet the requirement.");
        }
    }
}
