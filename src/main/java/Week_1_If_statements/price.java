package Week_1_If_statements;

import static input.InputUtils.*;

public class price {
    public static void main(String[] args) {

        // Prompt and ask user to enter
        String productName = stringInput("What is the name of product? "); // enter only string
        double price = positiveDoubleInput("What does " + productName + " costs? "); // enter ony positive number.
        int quantity = intInput("How many " + productName + " to sell? "); // enter integer number only.

        // math to calculate total price and store
        double totalPrice = price * quantity;

        // Print Message
        System.out.println(quantity + " of " + productName
                + " at $" + price + " each costs a total of $ " + totalPrice);

        // Print message using formatting form with decimal.
        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f"
                , quantity, productName, price, totalPrice);
    }
}
