package Week_7_object_oriented.knockout_game;

import java.util.Random;

public class Dice {

    Random rnd = new Random();
    public int roll() {
        return rnd.nextInt(6) + 1; // add 1, range between 1 and 6
    }
}
