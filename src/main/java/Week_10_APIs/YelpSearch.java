package Week_10_APIs;

import kong.unirest.Unirest;

import java.util.Map;
import java.util.Objects;

import static input.InputUtils.stringInput;

public class YelpSearch {
    public static void main(String[] args) {

        String yelpURL = "https://api.yelp.com/v3/businesses/search";
        String YELP_API_KEY = System.getenv("YELP_API_KEY"); // my API KEY in edit configuration

        String typeOfRestaurant = stringInput("Enter type of restaurant you like to search? ");
        Map<String, Object>yelpQuery = Map.of(
                "location", "Minneapolis,MN",  // Specify location you want
                "categories", "restaurants",      // Specify categories business.
                "term", typeOfRestaurant,             // Type of restaurant. "pizza", "burger"...
                "price", "1");                    // lowest price start 1, 2, 3 and 4

        YelpResponse response = Unirest.get(yelpURL)
                .queryString(yelpQuery)
                .header("Authorization", "Bearer " + YELP_API_KEY)
                .asObject(YelpResponse.class)
                .getBody();

        System.out.println(response);
        for (Business b: response.businesses) {
            System.out.println("Name of restaurant: " + b.name);
            System.out.println("Rating: " + b.rating);
            System.out.println("Location: " + b.location.address1 + ", " + b.location.city);
        }
    }
}