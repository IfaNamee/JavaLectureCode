package Week_5_HashMaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {

    public static void main(String[] args) {

        // Initialize HashMap to store snowfall data
        Map<String, Double> snowFall = new HashMap<>();

        // initial snowfall data
        snowFall.put("January", 3.1);
        snowFall.put("February", 10.8);
        snowFall.put("June", 3.1);

        // Print message.
        System.out.println(snowFall);

        // Add new months in Hashmap.
        snowFall.put("June", 12.4);
        snowFall.put("March", 4.1);
        snowFall.put("April", 0.0);  // This variable wrong in is only take double number.

        System.out.println(snowFall);

        // Print each month with snow fall.
        for (String month: snowFall.keySet()){
            double snow = snowFall.get(month);
            System.out.printf("The snow in %s was %.2f inches\n", month , snow);
            }

        // Print message.
        System.out.println("The snow in January is " + snowFall.get("January") + " inches");
        System.out.println("The snow in July is " + snowFall.get(" July") + " inches");

        // Check if there is any snowfall data for July and print message
        if (snowFall.containsKey("July")){
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There is no snow in July.");
        }

        // Prompt user to input new month and snowfall data
        String newMonth = stringInput("Enter name of month ");
        double amountSnow = positiveDoubleInput("Enter amount of snow for " + newMonth);

        // Print current snowfall data
        System.out.println(snowFall);

        // Check if the month already exists in the HashMap,
        // then prompt user for data modification
        if (snowFall.containsKey(newMonth)) {
            double snow = snowFall.get(newMonth);

            System.out.println("The hashmap is already contains thar month "
                    + newMonth + " snow " + snow + "inches");
            boolean modify = yesNoInput("Modify Data? ");
            if (modify){
                snowFall.put(newMonth,amountSnow);
            } else {
                System.out.println("Data is not modified.");
            }
        } else {
            snowFall.put(newMonth,amountSnow);
        }

        // Print current snowfall data
        System.out.println(snowFall);

        // Calculate total snowfall
        double totalSnowfall = 0.0;
        for (double snow : snowFall.values()) {
            totalSnowfall += snow;
        }

        // Print total amount of snow fall.
        System.out.printf("Total snowfall is %.2f inches ", totalSnowfall);
    }
}
