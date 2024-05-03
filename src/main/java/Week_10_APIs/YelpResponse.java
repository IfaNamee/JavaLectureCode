package Week_10_APIs;

// Yelp API response classes to map JSON to Java objects.
public class YelpResponse {

    // field for businesses
    // what type
    // it will be an array

    public Business[] businesses;
}

class Business {
    // represent one business object
    public String name;
    public double rating;
    public Location location;

}

class Location {
    public String city;
    public String address1;
}