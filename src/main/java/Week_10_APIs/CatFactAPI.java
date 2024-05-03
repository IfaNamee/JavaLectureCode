package Week_10_APIs;

import kong.unirest.Unirest;

public class CatFactAPI {

    public static void main(String[] args) {

        //        String url = "https://catfact.ninja/fact";
        //        String fact = Unirest.get(url).asString().getBody();
        //        System.out.println(fact);

        String url = "https://catfact.ninja/fact";
        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
//        System.out.println(catFact.fact);
        String fact = catFact.fact;
        System.out.println("A cat fact is : \n" + fact);
        System.out.println("This cat fact has " + catFact.length + " characters long.");

    }
}
class CatFact {
    public  String fact;
    public int length;

}
