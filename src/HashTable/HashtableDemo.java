package HashTable;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> products = new Hashtable<>();

        // Adding entries
        products.put("Laptop", 5);
        products.put("Phone", 12);
        products.put("Tablet", 8);

        // Update value
        products.put("Phone", 20);

        // Accessing values
        System.out.println("Phone Qty: " + products.get("Phone"));

        // Removing an entry
        products.remove("Laptop");

        // putIfAbsent
        products.putIfAbsent("Monitor", 7);

        // replace
        products.replace("Tablet", 10);

        // Size and contains
        System.out.println("Contains Tablet? " + products.containsKey("Tablet"));
        System.out.println("Contains value 20? " + products.containsValue(20));
        System.out.println("Number of entries: " + products.size());

        // Iteration using entrySet
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Using Enumeration (legacy)
        System.out.println("Enumerating keys:");
        Enumeration<String> keys = products.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + "=" + products.get(key));
        }

        // Clear all
        products.clear();
        System.out.println("Cleared. Is empty: " + products.isEmpty());
    }
}
