package Week_4_List;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {

        // Another way to create a list,but you can't add or remove from list it error
        List<String> animal = List.of("Cat","Dog","Fox");
        System.out.println(animal);
    }
}
