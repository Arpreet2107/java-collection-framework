package ConcurrentSkipListMap;

import java.util.concurrent.*;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();

        // Adding entries
        map.put("3", "Three");
        map.put("1", "One");
        map.put("2", "Two");g
        map.put("5", "Five");
        map.put("4", "Four");

        System.out.println("Initial map: " + map);

        // Navigational queries
        System.out.println("ceilingEntry(\"2\"): " + map.ceilingEntry("2"));
        System.out.println("firstEntry: " + map.firstEntry());
        System.out.println("lastEntry: " + map.lastEntry());

        // Descending keys
        System.out.print("Descending keys: ");
        for (String k : map.descendingKeySet()) System.out.print(k + " ");
        System.out.println();

        // Remove first and last entries
        System.out.println("pollFirstEntry: " + map.pollFirstEntry());
        System.out.println("pollLastEntry: " + map.pollLastEntry());
        System.out.println("Now map: " + map);

        // Submaps
        System.out.println("headMap(\"3\"): " + map.headMap("3"));
        System.out.println("tailMap(\"2\"): " + map.tailMap("2"));
        System.out.println("subMap(\"2\", \"4\"): " + map.subMap("2", "4"));
    }
}
