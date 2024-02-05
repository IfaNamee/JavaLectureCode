package Week_0_Variable_and_Math;

public class Temp {
    public static void main(String[] args) {

        // String and int variable to store the date
        String currentMonth = "January";
        int dayOfMonth = 11;

        // Double variable to store the high and low forecast temperatures.
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        // Calculate the difference between high and low temperature
        double tempDifference = forecastHigh - forecastLow;

        // print all the information
        System.out.println("On " + currentMonth + " " + dayOfMonth
                + " the difference between the high and low temperature is  " + tempDifference + "F");

        // print all the information formatting form
        System.out.printf("On %s %d the difference between the high low temperatures in %.2fF"
                , currentMonth, dayOfMonth, tempDifference);

    }
}
