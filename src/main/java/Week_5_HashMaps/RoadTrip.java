package Week_5_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {

        // Creating a HashMap to store distances between cities
        Map< String, Integer> distances = new HashMap<>();
        distances.put("Stillwater", 26);
        distances.put("Duluth", 154);
        distances.put("Brained", 127);
        distances.put("Red wing", 54);
        distances.put("Ely", 245);

        System.out.println(distances);  // Print Message.

        // Prompt and ash user to enter number.
        int maxDriveDistance = positiveIntInput("Enter the max distance you want to drive? ");

        // Iterating through the HashMap to find cities within the maximum driving distance
        List<String> cities = new ArrayList<>();
        for (String city: distances.keySet()) {
            int distance = distances.get(city);
            if (distance <= maxDriveDistance) {
                cities.add(city);
            }
        }

        // Outputting the results and message.
        if (cities.isEmpty()){
            System.out.println("Sorry, no city associated with in your driving distance.");
        } else {
            System.out.println("Here are cities you can drive to is " + cities.size());
            for (String city: cities) {
                System.out.println(city);
            }
        }
    }

}
