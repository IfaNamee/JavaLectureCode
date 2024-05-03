package Week_10_APIs;

import kong.unirest.Unirest;

public class BusTimeTable {
    public static void main(String[] args) {


        String busTimeUrl = "http://svc.metrotransit.org/NexTrip/17940?format=json";
        BusList response = Unirest.get(busTimeUrl).asObject(BusList.class).getBody();

        Bus[] bus = response.departures;
        String busTableTemplate = "%-10s%-40s%-20s\n";  // table create.

        System.out.printf(busTableTemplate, "Route", "Description", "Arrival Time");
        System.out.println("*".repeat(65));

        for (Bus buses: bus) {
            System.out.printf(busTableTemplate, buses.route_id, buses.description, buses.departure_text);
        }
    }
}

class BusList {
    Bus[] departures;
}
class Bus {
    public String departure_text;  // must match with property is spells.
    public String description;
    public String route_id;
}
