package org.example.stream.advance;


import java.util.*;
import java.util.stream.Collectors;

public class Advance {
    public static void main(String[] args) {

        List<AdEmployee> employeeList = new ArrayList<>();
        employeeList.add(new AdEmployee.EmployeeBuilder(1L, "Ajith").setEmployeeGender("Male").setEmployeeAge(22).build());
        employeeList.add(new AdEmployee.EmployeeBuilder(2L, "Malith").setEmployeeGender("Female").setEmployeeAge(54).build());
        employeeList.add(new AdEmployee.EmployeeBuilder(3L, "Kamal").setEmployeeGender("Male").setEmployeeAge(23).build());
        employeeList.add(new AdEmployee.EmployeeBuilder(4L, "Seetha").setEmployeeGender("Female").setEmployeeAge(65).build());
        employeeList.add(new AdEmployee.EmployeeBuilder(5L, "Saman").setEmployeeGender("Male").setEmployeeAge(71).build());

        /**
         * AVERAGE  AGE OF THE EMPLOYEES
         */

        OptionalDouble countAge = employeeList.stream().mapToInt(AdEmployee::getAge).average();

        if (countAge.isPresent()) {
            System.out.println(countAge.getAsDouble());
        }


        /**
         * Average age of the employee base on gender
         */

        Map<String, Double> doubleMap = employeeList.stream()
                .collect(Collectors
                        .groupingBy(AdEmployee::getGender, Collectors.averagingDouble(AdEmployee::getAge)));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        /**
         * Write a program to find the employee with the highest age by gender
         */
        Map<String, Optional<AdEmployee>> integerMap = employeeList.stream()
                .collect(Collectors.
                        groupingBy(AdEmployee::getGender, Collectors.maxBy(Comparator.comparingInt(AdEmployee::getAge))));

        integerMap.forEach((key, value) -> {
            value.ifPresent(adEmployee -> System.out.println(key + "\t" + adEmployee.getAge()));
        });

        /**
         * Write a program to group a list of employees by their gender,
         * and then sort each group by age in descending order.
         */

        System.out.println("Sorting");

        Map<String, List<AdEmployee>> emp = employeeList.stream()
                .collect(Collectors.groupingBy(AdEmployee::getGender));

        emp.forEach((k, v) -> {
            System.out.println(k);
            v.stream().sorted(Comparator.comparing(AdEmployee::getAge).reversed()).forEach(System.out::println);
        });

    }

}
