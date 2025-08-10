package Java8CoreConcepts;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.time.*;

public class Java8CoreConceptsDemo {
    public static void main(String[] args) {
        // 1. Lambda Expression and Functional Interface
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        // Using forEach with lambda
        System.out.println("All fruits:");
        fruits.forEach(f -> System.out.println(f));

        // 2. Stream API - filter and map
        List<String> filteredFruits = fruits.stream()
                .filter(f -> f.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nFruits with length > 5 (uppercase): " + filteredFruits);

        // 3. Default method in interface with custom Functional Interface
        Printable print = (msg) -> System.out.println("Message: " + msg);
        print.printMessage("Hello from lambda with default method!");
        print.defaultPrint();

        // 4. Optional to handle null safely
        Optional<String> optionalFruit = Optional.ofNullable(null);
        System.out.println("\nOptional fruit: " + optionalFruit.orElse("No fruit found"));

        // 5. New Date and Time API
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("\nCurrent Date: " + date);
        System.out.println("Current Time: " + time);

        // 6. Collection enhancements - removeIf and replaceAll
        List<String> animals = new ArrayList<>(Arrays.asList("Dog", "Cat", "Elephant", "Cow"));
        animals.removeIf(a -> a.startsWith("C")); // Removes Cat and Cow
        animals.replaceAll(String::toUpperCase);
        System.out.println("\nAnimals after removal and uppercase: " + animals);

        // 7. Method References
        System.out.println("\nPrinting animals using method reference:");
        animals.forEach(System.out::println);

        // 8. Parallel stream example
        System.out.println("\nProcessing numbers in parallel:");
        IntStream.range(1, 6)
                .parallel()
                .forEach(i -> System.out.println("Number: " + i + " processed by " + Thread.currentThread().getName()));
    }

    // Functional interface with default method
    @FunctionalInterface
    interface Printable {
        void printMessage(String message);

        default void defaultPrint() {
            System.out.println("This is a default method in the interface.");
        }
    }
}
