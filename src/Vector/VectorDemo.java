package Vector;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Inserting an element at position 1
        fruits.add(1, "Mango");

        // Display vector
        System.out.println("Fruits: " + fruits);

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Modifying elements
        fruits.set(2, "Grapes");
        System.out.println("After modifying: " + fruits);

        // Removing elements
        fruits.remove("Mango");
        fruits.remove(0);
        System.out.println("After removals: " + fruits);

        // Iterating using Enumeration
        System.out.println("Iterating using Enumeration:");
        Enumeration<String> e = fruits.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
