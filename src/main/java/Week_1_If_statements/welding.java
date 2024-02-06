package Week_1_If_statements;

import static input.InputUtils.yesNoInput;

public class welding {
    public static void main(String[] args) {

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?");

        // Use AND '&&' and OR '||'  operator to check first one is correct or something else correct.
        if (cottonClothes || woolClothes && closedToeShoes){
            System.out.println("You are dressed safety.");
        } else {
            System.out.println("You must wear cotton or wool clothes and closed toe shoes.");
        }
    }
}
