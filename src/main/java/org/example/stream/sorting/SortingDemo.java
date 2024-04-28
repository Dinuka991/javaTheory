package org.example.stream.sorting;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,5,3,6,8,2,9,2);
        // Ascending
        integerList.stream().sorted().forEach(System.out::println);
        System.out.println();

        //Descending order
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Sort the employees by there age
        List<Employee> employeeList = List.of(
                new Employee("Ajith",21),
                new Employee("Malith",12),
                new Employee("piyal",64),
                new Employee("sadun",5),
                new Employee("malith",43)
        );

        employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
    }


}
