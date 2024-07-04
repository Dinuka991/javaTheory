package sorting.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static sorting.DemoBubbleSort.bubbleSort;

public class DemoSort {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Dinuka", 12 , 3332));
        employees.add(new Employee(2, "Saman", 44,44224));
        employees.add(new Employee(3, "Ajith", 11,99544));

        // Sorting using stream in ascending order of age
        List<Employee> ascendingOrder = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();
        System.out.println("Ascending order of age:");
        ascendingOrder.forEach(System.out::println);

        // Sorting using stream in descending order of age
        List<Employee> descendingOrder = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .toList();
        System.out.println("\nDescending order of age:");
        descendingOrder.forEach(System.out::println);
    }



}
