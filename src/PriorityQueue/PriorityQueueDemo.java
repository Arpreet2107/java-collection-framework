package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // PriorityQueue with natural ordering (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.offer(15);
        pq.offer(10);
        pq.add(20);
        pq.offer(5);

        System.out.println("PriorityQueue contents (iteration order not guaranteed): " + pq);

        // Peek at the smallest element
        System.out.println("Peek element: " + pq.peek());  // 5

        // Poll elements in priority order
        while (!pq.isEmpty()) {
            System.out.println("Polled element: " + pq.poll());
        }

        // PriorityQueue with custom comparator (max-heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        maxHeap.add(15);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);

        System.out.println("\nMax-Heap PriorityQueue contents: " + maxHeap);
        System.out.println("Peek max element: " + maxHeap.peek());  // 20

        while (!maxHeap.isEmpty()) {
            System.out.println("Polled element from maxHeap: " + maxHeap.poll());
        }

        // PriorityQueue with custom objects
        class Task {
            String name;
            int priority;

            Task(String name, int priority) {
                this.name = name;
                this.priority = priority;
            }

            @Override
            public String toString() {
                return name + "(" + priority + ")";
            }
        }

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                (t1, t2) -> Integer.compare(t1.priority, t2.priority)
        );

        taskQueue.offer(new Task("Laundry", 3));
        taskQueue.offer(new Task("Homework", 1));
        taskQueue.offer(new Task("Shopping", 2));

        System.out.println("\nTask queue:");
        while (!taskQueue.isEmpty()) {
            System.out.println("Next task: " + taskQueue.poll());
        }
    }
}
