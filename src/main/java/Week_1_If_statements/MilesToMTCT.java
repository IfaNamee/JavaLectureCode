package Week_1_If_statements;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMTCT {
    public static void main(String[] args) {

        double miles = positiveDoubleInput("How many miles your house from MTCT? ");
        double km =  miles * 1.6;
        System.out.println("You live " + km + " km away from MTCT.");

        if (miles > 10){
            System.out.println("You live more 10 miles away from MTCT.");
        } else if (miles == 10) {
            System.out.println("You live exactly 10 miles away from MTCT.");
        } else {
            System.out.println("You live less 10 miles away from MTCT. ");
        }
    }

}
