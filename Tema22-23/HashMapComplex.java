import java.util.HashMap;
import java.util.Map;

public class HashMapComplex {
    /**Tema-22-23:
     Finding Common Entries in Two HashMaps

     Description:
     Create a class named HashMapComplex. In this class, create a method named getCommonEntries which takes
     two HashMaps both with String keys and Integer values as parameters.
     The method should return a new HashMap containing only the entries that exist in both input maps
     (i.e., the keys are present in both maps and associated with the same values in both maps).*/

    public static void main(String[] args) {
        // Sample HashMaps
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("c", 3);
        map2.put("d", 4);

        // Get common entries
        HashMap<String, Integer> commonEntries = getCommonEntries(map1, map2);

        // Print common entries
        System.out.println("Common Entries:");
        for (Map.Entry<String, Integer> entry : commonEntries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static HashMap<String, Integer> getCommonEntries(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> commonEntries = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                commonEntries.put(key, value);
            }
        }

        return commonEntries;
    }
}
