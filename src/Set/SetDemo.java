package Set;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet example (no guaranteed order)
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate, won't be added

        System.out.println("HashSet contents: " + fruits);

        // Check if set contains "Banana"
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Remove "Banana"
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Iterate over HashSet
        System.out.println("Iterating over HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // LinkedHashSet example (maintains insertion order)
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Red");
        linkedSet.add("Green");
        linkedSet.add("Blue");
        linkedSet.add("Green"); // Duplicate

        System.out.println("LinkedHashSet contents: " + linkedSet);

        // TreeSet example (sorted natural order)
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(10); // Duplicate

        System.out.println("TreeSet contents (sorted): " + numbers);

        // Set operations: union, intersection, difference
        Set<String> setA = new HashSet<>();
        setA.add("A");
        setA.add("B");
        setA.add("C");

        Set<String> setB = new HashSet<>();
        setB.add("B");
        setB.add("C");
        setB.add("D");

        // Union
        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        // Intersection
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        // Difference
        Set<String> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference: " + difference);
    }
}
