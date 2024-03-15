package Week_4_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        // Create a list to store guest names
        List<String> guestList = new ArrayList<>();

        // get guest names until the user chooses to quit
        while (true) {
            String name = stringInput("Enter name of guest or enter to quit");

            // will check is name is empty and break.
            if (name.isEmpty()){
                break;
            }

            // Will check if name already in list.
            if (containsIgnoreCase(guestList,name)) {
                System.out.println("You already added " + name);
            } else { // will add if name is not in list.
                System.out.println("Adding " + name + " to list.");
                guestList.add(name);
            }
        }

        // Sort a list by alphabet.
        Collections.sort(guestList);

        // print sorted resulted.
        printGuestName(guestList);

        // Allow the user to remove guests from the list
        while (yesNoInput("Do you need remove any guests?")) {
            System.out.println("Here are all the guests");
            printGuestName(guestList);

            // will check if guest list is empty and break.
            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove.");
                break;
            }

            // Allow users to remove by index.
            int index = positiveIntInput("Enter the number of the guest to remove");
            index--;
            if (index < guestList.size()) {
                String removedGuest = guestList.remove(index);
                System.out.println("Removed Guest " + removedGuest);
            } else {
                System.out.println("Error - Please enter a valid number of a guest.");
            }
        }

        // Print the all the guests
        printGuestName(guestList);

        // Print the total number of guests
        System.out.println("The number of guest is " + guestList.size());

        // Select a prize winner from the guest list
        selectPrizeWinner(guestList);

    }
    // Method to randomly select a prize winner from the guest list.
    public static void selectPrizeWinner(List<String> guest) {

        if (guest.isEmpty()) { // will check if guest is empty.
            System.out.println("Warning - no guest - there is no winner.");
            return;
        }
        Random randaNumber = new Random();  // generate random number.
        int randomGuestIndex = randaNumber.nextInt(guest.size()); // range random number by guest size.

        String prizeWinner = guest.get(randomGuestIndex); // Get random index from guest size.
        System.out.println("GuestList" + (randomGuestIndex + 1) + " " + prizeWinner + " wins a prize!");
    }

    // Method to print the guest list
    public static void printGuestName (List<String> guests) {

        // prompt
        System.out.println("You guest list is: \n");

        // will check if list is empty.
        if (guests.isEmpty()) {
            System.out.println("There is no guest in list.");
        } else {  // print guest name index.
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }
    }
    // Method to check if a guest is already in the list (case-insensitive).
    public static boolean containsIgnoreCase(List<String>list, String enter) {
        for (String item : list) {
            if (item.equalsIgnoreCase(enter)) {
                return true;
            }
        }
        return false;
    }
}
