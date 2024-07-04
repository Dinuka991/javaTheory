package org.example.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoStream {

    public static void main(String[] args) {
        System.out.println(getEvenNumbers(List.of(1, 2, 4, 5, 6, 7)));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("ag", 30));
        personList.add(new Person("sam", 54));
        personList.add(new Person("kal", 21));
        personList.add(new Person("re", 22));

        getEmployeeNames(personList).forEach(System.out::println);

        System.out.println(secondLargest(List.of(3.4, 5.5, 1.2, 9.8, 7.6)));

        Optional<String> optionalString = Optional.of("hello");
        System.out.println(convertToUpperIfPresent(optionalString));

        List<String> stringList = List.of("banana", "apple", "orange");
        sortStringList(stringList).forEach(System.out::println);

        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (a, b, c) -> a + b + c;
        System.out.println(addThreeNumbers.apply(1, 2, 3));
    }

    // Write a Java 8 program to filter a list of integers to get only the even numbers using lambda expressions.
    public static List<Integer> getEvenNumbers(List<Integer> myList) {
        return myList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

    // Given a list of Person objects with attributes name and age,
    // write a Java 8 program to filter out all persons whose age is greater than 30 and collect their names into a list.
    public static List<String> getEmployeeNames(List<Person> personList) {
        return personList.stream()
                .filter(t -> t.getAge() > 30)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    // Find the second largest element
    public static Double secondLargest(List<Double> elements) {
        if (elements.size() < 2) {
            throw new ArithmeticException("List must contain at least two elements");
        }
        return elements.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new ArithmeticException("No second largest element found"));
    }

    // Given an Optional<String>, write a Java 8 program to convert it to uppercase if it is present, otherwise return a default string "default".
    public static String convertToUpperIfPresent(Optional<String> optional) {
        return optional.map(String::toUpperCase).orElse("default");
    }

    // Write a Java 8 program to sort a list of String values using method references.
    public static List<String> sortStringList(List<String> stringList) {
        return stringList.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    // Create a custom functional interface TriFunction that takes three arguments and returns a result.
    // Write a Java 8 program to use this functional interface with a lambda expression.
    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }
}

