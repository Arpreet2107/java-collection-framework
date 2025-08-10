package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Apple");
        queue.offer("Banana");
        queue.add("Cherry");

        System.out.println("Queue contents: " + queue);

        // Peek at the head element
        System.out.println("Head element (peek): " + queue.peek());

        // Remove elements from queue
        System.out.println("Removed element (remove): " + queue.remove());
        System.out.println("Removed element (poll): " + queue.poll());

        // Queue contents after removals
        System.out.println("Queue after removals: " + queue);

        // Try element() and peek() on current queue
        System.out.println("Head element (element): " + queue.element());
        System.out.println("Head element (peek): " + queue.peek());

        // Iterate over queue
        System.out.println("Iterating over queue:");
        for (String fruit : queue) {
            System.out.println(fruit);
        }

        // Remove remaining element
        queue.poll();

        // Attempt to remove from empty queue safely
        System.out.println("Poll on empty queue: " + queue.poll());
        try {
            System.out.println("Remove on empty queue (throws exception): " + queue.remove());
        } catch (Exception e) {
            System.out.println("Exception on remove when queue empty: " + e);
        }
    }
}
