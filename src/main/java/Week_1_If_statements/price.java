package Week_1_If_statements;

import static input.InputUtils.*;

public class price {
    public static void main(String[] args) {

        String productName = stringInput("What is the name of product? ");
        double price = positiveDoubleInput("What does " + productName + " costs? ");
        int quantity = intInput("How many " + productName + " to sell? ");

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName
                + " at $" + price + " each costs a total of $ " + totalPrice);

        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f"
                , quantity, productName, price, totalPrice);
    }
}
