package ArrayList;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Inserting element at position 1
        fruits.add(1, "Mango");

        // Display list
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

        // Iterating
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
