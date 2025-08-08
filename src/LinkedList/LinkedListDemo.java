package LinkedList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Adding elements
        names.add("Alice");
        names.addFirst("Bob");
        names.addLast("Charlie");
        names.add(1, "David");

        // Display list
        System.out.println("Names: " + names);

        // Accessing elements
        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());

        // Modifying an element
        names.set(1, "Dan");
        System.out.println("After modification: " + names);

        // Removing elements
        names.removeFirst();
        names.remove("Charlie");
        names.remove("David");
        System.out.println("After removals: " + names);


        // Iterating and printing
        System.out.println("Iterating:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
