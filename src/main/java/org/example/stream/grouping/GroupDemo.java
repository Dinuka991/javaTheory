package org.example.stream.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupDemo {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee.EmployeeBuilder(1L, "Ajith").setEmployeeGender("Male").build());
        employeeList.add(new Employee.EmployeeBuilder(2L, "Malith").setEmployeeGender("Female").build());
        employeeList.add(new Employee.EmployeeBuilder(3L, "Kamal").setEmployeeGender("Male").build());
        employeeList.add(new Employee.EmployeeBuilder(4L, "Seetha").setEmployeeGender("Female").build());
        employeeList.add(new Employee.EmployeeBuilder(5L, "Saman").setEmployeeGender("Male").build());

        Map<String, List<Employee>> employeeMap = employeeList.stream().distinct().collect(Collectors.groupingBy(Employee::getGender));

        for (Map.Entry<String, List<Employee>> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }


    }
}
