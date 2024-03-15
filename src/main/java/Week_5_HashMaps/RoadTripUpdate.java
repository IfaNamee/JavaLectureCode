package Week_5_HashMaps;// Importing necessary classes and methods
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static input.InputUtils.positiveIntInput; // Importing a specific method from input.InputUtils

// RoadTrip class definition
class RoadTripUpdate {

    // Main method
    public static void main(String[] args) {

        // Creating a HashMap to store distances between cities
        // Adding distances between cities to the HashMap
        Map<String, Integer> distances = Map.of(
                "Stillwater", 26,
                "Duluth", 154,
                "Brained", 127,
                "Red wing", 54,
                "Ely", 245);

        // Printing the distances between cities
        System.out.println(distances);

        // Prompting the user to input the maximum driving distance
        int maxDriveDistance = positiveIntInput("Enter the max distance you want to drive? ");

        // Creating a list to store cities within the maximum driving distance
        List<String> cities = new ArrayList<>();

        // Iterating through the HashMap to find cities within the maximum driving distance
        for (String city: distances.keySet()) {
            int distance = distances.get(city); // Getting the distance of the current city
            if (distance <= maxDriveDistance) { // Checking if the distance is within the maximum driving distance
                cities.add(city); // Adding the city to the list if it is within the maximum driving distance
            }
        }

        // Outputting the results
        if (cities.isEmpty()){ // If no cities are within the maximum driving distance
            System.out.println("Sorry, no city associated with in your driving distance.");
        } else { // If there are cities within the maximum driving distance
            System.out.println("Here are cities you can drive to is " + cities.size());
            for (String city: cities) { // Printing the cities within the maximum driving distance
                System.out.println(city);
            }
        }
    }
}
