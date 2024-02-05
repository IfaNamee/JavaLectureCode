package Week_0_Variable_and_Math;

public class PizzaRolls {

    public static void main(String[] args) {
        // sharing pizza rolls between peoples
        double pizzaRolls = 16;
        int people = 3;

        double rollsPerPeoples = pizzaRolls / people;
        System.out.println("Each people gets " + rollsPerPeoples + " pizza rolls.");
        System.out.printf("Each people gets %.1f pizza rolls", rollsPerPeoples);



    }
}
