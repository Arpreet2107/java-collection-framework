package LambdaExpressions;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        // Sort fruits by length using lambda
        Collections.sort(fruits, (a, b) -> a.length() - b.length());

        System.out.println("Sorted by length: " + fruits);

        // Filter fruits starting with 'B' or later using stream and lambda
        List<String> filteredFruits = fruits.stream()
                .filter(f -> f.compareToIgnoreCase("B") >= 0)
                .collect(Collectors.toList());

        System.out.println("Filtered fruits (start with B or later): " + filteredFruits);

        // Use Predicate functional interface with lambda
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        filteredFruits.stream()
                .filter(lengthGreaterThan5)
                .forEach(f -> System.out.println("Long fruit: " + f));
    }
}
