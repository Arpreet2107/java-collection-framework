package ConcurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<>();

        // Adding entries
        cmap.put(1, "One");
        cmap.put(2, "Two");
        cmap.put(3, "Three");

        // Iterating while adding new entry
        Iterator<Integer> it = cmap.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            if(key == 2)
                cmap.put(4, "Four");
        }

        // Display contents
        System.out.println("ConcurrentHashMap: " + cmap);

        // Get/Update/Remove
        System.out.println("Key 1 value: " + cmap.get(1));
        cmap.replace(2, "Two updated");           // Updates value for key 2
        cmap.remove(3);                           // Removes key 3

        // Atomic add-if-absent
        cmap.putIfAbsent(5, "Five");

        // Final contents after modifications
        cmap.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
