package in.hashhmap;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // put and putIfAbsent
        map.put("India", 91);
        map.putIfAbsent("USA", 1);

        // get and getOrDefault
        System.out.println(map.get("India"));  // 91
        System.out.println(map.getOrDefault("Nepal", -1)); // -1

        // containsKey & containsValue
        System.out.println(map.containsKey("India")); // true
        System.out.println(map.containsValue(91));    // true

        // replace
        map.replace("India", 91, 101);

        // Iterating
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // compute and merge
        map.computeIfAbsent("Nepal", k -> 977);
        map.merge("USA", 99, (oldVal, newVal) -> oldVal + newVal);

        System.out.println("Final Map: " + map);
    }
}
