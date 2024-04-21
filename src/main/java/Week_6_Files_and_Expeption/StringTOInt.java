package Week_6_Files_and_Expeption;

public class StringTOInt {
    public static void main(String[] args) {

        String number = "cat";
        try {
            int Number = Integer.parseInt(number);
            System.out.println("This is number " + Number);
        } catch (NumberFormatException e) {
            System.out.println(number + "is not valid number.");
        }
        System.out.println("This program is end.");
    }
}
