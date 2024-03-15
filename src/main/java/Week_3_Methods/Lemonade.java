package Week_3_Methods;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Lemonade {
    public static void main(String[] args) { // The 'main' method is the entry start of the program.

        // To calculate profit, need to know how was spent on lemonade supplies,
        // what one cup of lemonade sold for, and the number of cups sold.
        // The 'doubleInput' and 'intInput' methods are used to prompt the user to enter the cost of supplies,
        // the sale price, and the quantity sold for both lemonade and cookies. These values are stored in variables.
        double lemonadeSupplies = doubleInput("How much did you spend on lemonade supplies? ");
        double lemonadeSalePrice = doubleInput("What did you sell one cup of lemonade for? ");
        int lemonadeCupsSold = intInput("How many cups of lemonade did you sell? ");

        double lemonade = lemonadeProfit(lemonadeSupplies,lemonadeSalePrice, lemonadeCupsSold);
        System.out.println("Lemonade profit is $" + lemonade); // Print result.

        double cookiesSupplies = doubleInput("How much did you spend on cookies supplies? ");
        double cookiesSalePrice = doubleInput("What did you sell one cookie for? ");
        int cookiesSold = intInput("How many cookies did you sell? ");

        double cookies = cookiesProfit(cookiesSupplies, cookiesSalePrice, cookiesSold);
        System.out.println("Cookies profit is $" + cookies);  // Print result.

    }

    // The 'cookiesProfit' methods are appropriate values as arguments.
    // The result of cookies profit calculation is stored in variables.
    private static double cookiesProfit(double cookiesSupplies, double cookiesSalePrice, int cookiesSold) {

        double cookiesProfit = (cookiesSold * cookiesSalePrice) - cookiesSupplies;
        return cookiesProfit;  // Return value of cookies profit to print out
    }

    // The 'lemonadeProfit' methods are appropriate values as arguments.
    // The result of lemonade profit calculation is stored in variables.
    private static double lemonadeProfit(double lemonadeSupplies, double lemonadeSalePrice, int lemonadeCupsSold) {
        double lemonadesProfit = (lemonadeCupsSold * lemonadeSalePrice) - lemonadeSupplies;
        return lemonadesProfit; // Return value of lemonade profit to print out
    }
}
