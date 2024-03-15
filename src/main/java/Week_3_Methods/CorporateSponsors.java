package Week_3_Methods;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {

        // modify array, make strings uppercase.
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};

        //  loop iterates over each element in the sponsors array.
        for (int i = 0; i < sponsors.length; i++) {
            String sponsor = sponsors[i];    // initialized to strings.
            sponsor = sponsor.toUpperCase(); // convert to uppercase using the toUpperCase method

            sponsors[i] = sponsor;  //  assign to the same index in the sponsors array.
        }

        System.out.println(Arrays.toString(sponsors)); // Print message
    }
}
