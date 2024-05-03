package Week_10_APIs;

import kong.unirest.Unirest;

import java.util.Map;
import java.util.Objects;

import static input.InputUtils.doubleInput;

public class ExchangeRate {

    public static void main(String[] args) {

    //    String url = "https://1150-exchange-rates.azurewebsites.net/latest?base=USD&symbols=EUR";
    //    RateResponse response = Unirest.get(url).asObject(RateResponse.class).getBody();
    //    String dataRequested = response.date;
    //    double rate = response.rates.EUR;
    //    System.out.println("On " + dataRequested + " the exchange rate USD to Euros is " + rate);

        String url = "https://1150-exchange-rates.azurewebsites.net/latest";
        Map<String, Object> queryParameters = Map.of("base","USD", "symbols", "EUR"); // "EUR, CAD, BRL,..."

        RateResponse response = Unirest.get(url)
                .queryString(queryParameters)
                .asObject(RateResponse.class)
                .getBody();

        String dataRequested = response.date;
        double rate = response.rates.EUR;
        System.out.println("On " + dataRequested + " the exchange rate USD to Euros is " + rate);

        double amountOfDollars = doubleInput("How many US dollars to convert to Euros? ");
        double euroEquivalent = amountOfDollars * rate;
        System.out.println("$" + amountOfDollars + " is equivalence to " + euroEquivalent + " Euros.");
    }
}
class RateResponse {
    public String base;
    public String date;
    public Rates rates;
}

class Rates {
    public double EUR;
}
