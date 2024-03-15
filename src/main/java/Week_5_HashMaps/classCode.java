package Week_5_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class classCode {
    public static void main(String[] args) {

        // Creating a HashMap to store class codes and names
        Map<Integer, String> classCodes = new HashMap<>();

        // Adding class codes and names to the HashMap.
        classCodes.put(2545,"Java");
        classCodes.put(1425,"DataCommunication");
        classCodes.put(2560,"Web");
        classCodes.put(2417, "Android");

        // Iterating over the HashMap to print class codes and names.
        for (Integer classCode: classCodes.keySet()){
            String className = classCodes.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);

        }

        // Printing the number of classes stored in the HashMap
        System.out.println("I am taking " + classCodes.size() + " Classes");

        // Searching for a class code (findCode) in the HashMap
        int findCode = 2417;
        if (classCodes.containsKey(findCode)){
            System.out.println("This class is found in the HashMap. The class name is "
                    + classCodes.get(findCode));
        } else {
            System.out.println(findCode + " not found.");
        }

        // Searching for a class code (searchCode) and its corresponding class name in the HashMap
        int searchCode = 2547;
        String className = classCodes.get(searchCode);
        if(className == null) {
            System.out.println(searchCode + " not found");
        } else {
            System.out.println("This class is found in the HashMap. The class name is " + className);
        }
    }
}
