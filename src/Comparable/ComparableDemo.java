package Comparable;

import java.util.*;

public class ComparableDemo {
    static class Student implements Comparable<Student> {
        String name;
        int age;
        double grade;

        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        @Override
        public int compareTo(Student other) {
            // Primary sort by age ascending
            int ageCompare = Integer.compare(this.age, other.age);
            if (ageCompare != 0) {
                return ageCompare;
            }
            // Secondary sort by name alphabetically
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return name + " (Age: " + age + ", Grade: " + grade + ")";
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 21, 88.5));
        students.add(new Student("Bob", 20, 92.0));
        students.add(new Student("Charlie", 21, 85.0));
        students.add(new Student("David", 20, 90.0));

        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        Collections.sort(students); // Uses compareTo

        System.out.println("\nAfter sorting (by age, then name):");
        students.forEach(System.out::println);

        // Alternatively, sorting by grade using Comparator (not Comparable)
        students.sort(Comparator.comparingDouble(s -> s.grade));

        System.out.println("\nAfter sorting by grade:");
        students.forEach(System.out::println);
    }
}
