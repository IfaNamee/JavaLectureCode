package Week_7_object_oriented;

public class SwimmingPoolProgram {

    public static void main(String[] args) {

        SwimmingPool ymca = new SwimmingPool("YMCA", 50, "Minneapolis", 11);

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam + " meters");

        System.out.println(ymca);

        SwimmingPool como = new SwimmingPool("Como park", 25,"Saint Paul", 10);
        System.out.println(como.distanceForLaps(10));

        System.out.println(como);

        SwimmingPool edina = new SwimmingPool("Edina Park", 50,"Edina", 12);
        System.out.println(edina.distanceForLaps(12));

        System.out.println(edina);
    }
}
