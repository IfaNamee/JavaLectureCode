package Week_4_List;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class speeds {
    public static void main(String[] args) {

        // Create a list to store internet speeds for each hour
        List<Double> speeds = new ArrayList<>();

        // Define the total number of hours
        int totalHours = 12;

        // Collect internet speed data for each hour
        for (int hour = 0; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour + ": ");
            speeds.add(speed);
        }

        // Display all the collected speeds
        System.out.println("All the speeds are:");
        for (int hour = 0; hour < speeds.size(); hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d Speed: %.2f\n", hour, speed);
        }

        // Count the number of times the speed was 0 (indicating no connection).
        int zeroCount = 0;
        for (double speed : speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }
        System.out.println("Number of times speed was 0 (no connection): " + zeroCount);

        // Remove zero speeds from the list
        speeds.removeIf(speed -> speed == 0);

        // Display the speeds after removing zeros
        System.out.println("Speeds after removing zeros: " + speeds);

        // Calculate the total speed (excluding zeros)
        double total = 0;
        for (double speed : speeds) {
            total += speed;
        }

        // Calculate the average speed
        double average = speeds.isEmpty() ? 0 : total / speeds.size();

        // Display the average speed
        System.out.println("Average speed is " + average);
    }
}