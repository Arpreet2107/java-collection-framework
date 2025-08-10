package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // Adding entries
        sortedMap.put(5, "Five");
        sortedMap.put(1, "One");
        sortedMap.put(3, "Three");
        sortedMap.put(4, "Four");
        sortedMap.put(2, "Two");

        System.out.println("SortedMap: " + sortedMap);

        // Accessing values
        System.out.println("Value for key 3: " + sortedMap.get(3));
        System.out.println("Value for key 10 (default): " + sortedMap.getOrDefault(10, "Not found"));

        // Navigation methods
        System.out.println("First key: " + sortedMap.firstKey());
        System.out.println("Last key: " + sortedMap.lastKey());

        System.out.println("HeadMap (<4): " + sortedMap.headMap(4));
        System.out.println("TailMap (>=3): " + sortedMap.tailMap(3));
        System.out.println("SubMap (2 inclusive to 5 exclusive): " + sortedMap.subMap(2, 5));

        // Iterating
        System.out.println("Iterating SortedMap:");
        for (var entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing an entry
        sortedMap.remove(1);
        System.out.println("After removing key 1: " + sortedMap);

        // Clearing map
        sortedMap.clear();
        System.out.println("After clear, is empty? " + sortedMap.isEmpty());
    }
}
