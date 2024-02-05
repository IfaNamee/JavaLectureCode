package Week_0_Variable_and_Math;

public class prices {
    public static void main(String[] args) {
        String productName = "Packet of spaghetti";
        double price = 1.60;
        int quantity = 4;

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName
                + "at $" + price + " each costs a total of $ " + totalPrice);

        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f"
                , quantity, productName, price, totalPrice);
    }
}
