package Week_0_Variable_and_Math;

public class Address {
    public static void main(String[] args) {
        String city = "Minneapolis";
        String state = "mn"; // let's start with this lowercase

        // Create a new String variable "Minneapolis, MN"
        String cityState = city + ", " + state.toUpperCase();

        System.out.println(cityState);


        // Can we make a new String with this in lowercase
        // "Minneapolis, MN" with the state in uppercase?
    }
}
