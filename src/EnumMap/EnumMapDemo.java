package EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    enum Priority { LOW, MEDIUM, HIGH, URGENT }

    public static void main(String[] args) {
        EnumMap<Priority, String> tasks = new EnumMap<>(Priority.class);

        // Put entries
        tasks.put(Priority.LOW, "File paperwork");
        tasks.put(Priority.MEDIUM, "Respond to emails");
        tasks.put(Priority.HIGH, "Prepare meeting");
        tasks.put(Priority.URGENT, null);

        System.out.println("EnumMap contents: " + tasks);

        // Access value
        System.out.println("HIGH priority: " + tasks.get(Priority.HIGH));

        // Update/Remove
        tasks.put(Priority.HIGH, "Finish report");
        tasks.remove(Priority.LOW);

        // Contains checks
        System.out.println("Contains MEDIUM? " + tasks.containsKey(Priority.MEDIUM));
        System.out.println("Null value for URGENT: " + tasks.get(Priority.URGENT));

        // Iteration (enum order)
        System.out.println("Iterating:");
        for (Map.Entry<Priority, String> entry : tasks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Copy constructor
        EnumMap<Priority, String> copy = new EnumMap<>(tasks);
        System.out.println("Copied EnumMap: " + copy);

        // Clear
        tasks.clear();
        System.out.println("Cleared, isEmpty? " + tasks.isEmpty());
    }
}
