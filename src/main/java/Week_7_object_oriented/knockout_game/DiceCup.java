package Week_7_object_oriented.knockout_game;

import java.util.ArrayList;
import java.util.List;

public class DiceCup {

    private List<Dice> allDice;

    public DiceCup(int numberOfDice) {
        allDice = new ArrayList<>();
        for (int d = 0; d < numberOfDice; d++) {
            Dice dice = new Dice();
            allDice.add(dice);
        }
    }

    public int rollAll() {
        int total = 0;
        for (Dice dice: allDice) {
            int diceRoll = dice.roll();
            total = total + diceRoll;
        }
        return total;
    }
}
