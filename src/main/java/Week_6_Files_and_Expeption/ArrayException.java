package Week_6_Files_and_Expeption;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;

public class ArrayException {
    public static void main(String[] args) {

        String[] className = {"Web", "Java", "C#"};

        for (String name : className) {
            System.out.println(name);
        }

        System.out.println("........OR..........");
        for (int i = 0; i < className.length; i++) {
            System.out.println(className[i]);
        }

        List<Integer> classes = List.of(2545, 2460, 2505);

        for (int i = 0; i < classes.size(); i++) {
            System.out.println(classes.get(i));
        }


        Random rnd = makeRandomGenerator();  // rnd is null
        System.out.println(getNumber(rnd));
    }

    public static Random makeRandomGenerator() {
        return new Random();
    }
    public static int getNumber(Random rnd) {
        return rnd.nextInt(10);
    }
}
