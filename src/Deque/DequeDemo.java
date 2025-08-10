package Deque;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at both ends
        deque.addFirst("Apple");     // Front: Apple
        deque.addLast("Banana");     // End: Banana
        deque.offerFirst("Mango");   // Front: Mango, Apple, Banana
        deque.offerLast("Cherry");   // End: Mango, Apple, Banana, Cherry

        System.out.println("Deque after additions: " + deque);

        // Access first and last elements without removing
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Remove elements from front and end
        String removedFirst = deque.removeFirst();  // Removes Mango
        String removedLast = deque.removeLast();    // Removes Cherry
        System.out.println("Removed first: " + removedFirst);
        System.out.println("Removed last: " + removedLast);

        System.out.println("Deque after removals: " + deque);

        // Using as stack
        deque.push("Date");    // Push on front
        System.out.println("Deque after push: " + deque);
        String popped = deque.pop();  // Pop from front
        System.out.println("Popped from stack: " + popped);
        System.out.println("Deque after pop: " + deque);

        // Iterating front to end
        System.out.println("Iterating deque:");
        for (String item : deque) {
            System.out.println(item);
        }

        // Iterating end to front
        System.out.println("Iterating deque in reverse:");
        Iterator<String> descIter = deque.descendingIterator();
        while (descIter.hasNext()) {
            System.out.println(descIter.next());
        }
    }
}
