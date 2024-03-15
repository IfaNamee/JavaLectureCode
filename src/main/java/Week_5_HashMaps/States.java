package Week_5_HashMaps;

import java.util.HashMap;

public class States {
    public static void main(String[] args) {

        // HashMap named 'stateAbbreviations', where keys are of type String.
        HashMap<String,String> stateAbbreviations = new HashMap<>();

        // Store state and abbreviation.
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");

        // prints out the entire HashMap.
        System.out.println(stateAbbreviations);

        // Print minnesota abbreviation from HashMap.
        System.out.println(stateAbbreviations.get("Minnesota"));
        // "Iowa" is not in the HashMap, it will return null.
        System.out.println(stateAbbreviations.get("Iowa"));

        // stores the abbreviation for "Wisconsin" in a separate variable
        String WisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        // Print wisconsin abbreviation.
        System.out.println(WisconsinAbbreviation);

        // Loop over HashMap keys.
        //  Set view of the keys contained in the map. This set contains all -
        //  the keys present in the map. You can use this set to iterate over -
        //  the keys, perform operations on them, or retrieve values associated with those keys.
        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        // Loop over HashMap values.
        //  Collection view of the values contained in the map. This collection -
        //  contains all the values present in the map. You can use this collection -
        //  to iterate over the values, perform operations on them, or analyze them.
        for (String abbreviation : stateAbbreviations.values()) {
            System.out.println(abbreviation);
        }

        // Size HashMap
        // "size" class returns the number of key-value mappings in the map.
        // It provides the size or the number of entries present in the map.

        System.out.println("There are " + stateAbbreviations.size() + " states in map.");
    }
}
