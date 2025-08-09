package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> capitals = new LinkedHashMap<>();

        // Adding entries
        capitals.put("India", 91);
        capitals.put("USA", 1);
        capitals.put("UK", 44);
        capitals.put("Canada", 1);

        // Display entries (in insertion order)
        System.out.println("Capitals: " + capitals);

        // Accessing values
        System.out.println("USA code: " + capitals.get("USA"));

        // Update a value
        capitals.put("UK", 999);

        // Remove entry
        capitals.remove("India");

        // Size and contains
        System.out.println("Contains UK? " + capitals.containsKey("UK"));
        System.out.println("Number of entries: " + capitals.size());

        // Iteration
        for (Map.Entry<String, Integer> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Using forEach (Java 8+)
        capitals.forEach((k, v) -> System.out.println("[forEach] " + k + ": " + v));
    }
}
