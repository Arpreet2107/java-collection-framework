package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> fruits = new HashMap<>();

        // Put entries
        fruits.put("Apple", 10);
        fruits.put("Orange", 5);
        fruits.put("Banana", 8);

        // Put with null key and values
        fruits.put(null, 1);        // Allows one null key
        fruits.put("Pineapple", null); // Allows null values

        // Update value
        fruits.put("Apple", 15);

        // Get and getOrDefault
        System.out.println("Oranges: " + fruits.get("Orange"));
        System.out.println("Kiwi count (default 0): " + fruits.getOrDefault("Kiwi", 0));

        // Remove operations
        fruits.remove("Banana");
        fruits.remove("Apple", 15); // only removes if key maps to value

        // Check operations
        System.out.println("Contains Apple? " + fruits.containsKey("Apple"));
        System.out.println("Contains value 5? " + fruits.containsValue(5));
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty? " + fruits.isEmpty());

        // Iterate (entries)
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // putIfAbsent
        fruits.putIfAbsent("Dragonfruit", 20);

        // Java 8 forEach
        fruits.forEach((k, v) -> System.out.println("[forEach] " + k + " = " + v));

        // Clear map
        fruits.clear();
        System.out.println("Cleared: size = " + fruits.size());
    }
}
