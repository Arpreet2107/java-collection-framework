package NavigableMap;
import java.util.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();

        // Adding entries
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");

        System.out.println("Original map: " + map);

        // Navigation methods
        System.out.println("Lower key than 25: " + map.lowerKey(25));       // 20
        System.out.println("Floor key of 30: " + map.floorKey(30));          // 30
        System.out.println("Ceiling key of 35: " + map.ceilingKey(35));      // 40
        System.out.println("Higher key than 40: " + map.higherKey(40));      // 50

        System.out.println("Lower entry than 25: " + map.lowerEntry(25));    // 20=Twenty
        System.out.println("Floor entry of 30: " + map.floorEntry(30));      // 30=Thirty
        System.out.println("Ceiling entry of 35: " + map.ceilingEntry(35));  // 40=Forty
        System.out.println("Higher entry than 40: " + map.higherEntry(40));  // 50=Fifty

        // First and last key/entry
        System.out.println("First key: " + map.firstKey());                  // 10
        System.out.println("First entry: " + map.firstEntry());              // 10=Ten
        System.out.println("Last key: " + map.lastKey());                    // 50
        System.out.println("Last entry: " + map.lastEntry());                // 50=Fifty

        // Submaps with inclusiveness
        System.out.println("Submap 15 (incl) to 45 (excl): " + map.subMap(15, true, 45, false)); // 20=Twenty,30=Thirty,40=Forty
        System.out.println("HeadMap (<40 excl): " + map.headMap(40, false)); // 10=Ten,20=Twenty,30=Thirty
        System.out.println("TailMap (>=30 incl): " + map.tailMap(30, true)); // 30=Thirty,40=Forty,50=Fifty

        // Descending map view
        System.out.println("Descending map:");
        for (var entry : map.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Polling first and last entries
        System.out.println("Poll first entry: " + map.pollFirstEntry());    // 10=Ten
        System.out.println("Poll last entry: " + map.pollLastEntry());      // 50=Fifty

        System.out.println("Map after polling: " + map);
    }
}

