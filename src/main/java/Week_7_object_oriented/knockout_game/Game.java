package Week_7_object_oriented.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {

    private DiceCup diceCup;
    private List<Player> players;
    public static void main(String[] args) {

        Game knockout = new Game();
        knockout.startGame();
    }

    public void startGame() {

        // Make player objects - need names
        // get knockout numbers
        // create a dice cup
        // play game - take turns until only one player is left
        // each player will roll dice - use dice cup
        // print winner

        diceCup = new DiceCup(2);

        int numberOfPlayers = positiveIntInput("How many players? ");

        createPlayers(numberOfPlayers);

        setKnockoutNumbers();

        play();

        printGameResult();
    }

    private void createPlayers(int numberOfPlayers) {
        players = new ArrayList<>();
        for (int x = 0; x < numberOfPlayers; x++) {
            String name = stringInput("Enter player " + x + "'s name");
            Player player = new Player(name);
            players.add(player);
        }
    }

    private void setKnockoutNumbers() {
        for (Player p: players) {
            int knockoutNumber;

            do {
                knockoutNumber = intInput("Player " + p.getName() + ", enter your knock out number." +
                        " It must be 6,7,8 or 9.");
            } while (knockoutNumber < 6 || knockoutNumber > 9); // number must be 6,7,8,9

            p.setKnockoutNumber(knockoutNumber);
        }
    }
    private void play() {

        int playerIndex = 0;
        int totalPlayers = players.size();

        while (moreThanOnePlayerInPlay()) {
            Player currentPlayer = players.get(playerIndex);

            if (currentPlayer.isKnockedOut()) {
                System.out.println("Sorry, " + currentPlayer.getName() + "you are knocked out.");
            } else {
                stringInput("Player " + currentPlayer.getName() + ", press enter to roll.");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);
            }

            playerIndex = (playerIndex + 1) % totalPlayers;
        }
    }

    private boolean moreThanOnePlayerInPlay() {

        int totalInPlay = 0;
        for (Player p: players) {
            if (!p.isKnockedOut()) {
                totalInPlay++;
            }
        }
        System.out.println("There are " + totalInPlay + " player(s) in the game");
        if (totalInPlay > 1) {
            return true;
        } else {
            return false;
        }
    }

    private void printGameResult() {

        for (Player player: players) {
            if (player.isKnockedOut()) {
                System.out.println("Player " + player.getName() + " was knock out.");
            } else {
                System.out.println("Player " + player.getName() + " IS THE WINNER!");
            }
        }
    }

}
