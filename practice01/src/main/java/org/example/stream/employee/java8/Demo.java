package org.example.stream.employee.java8;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Employee employee =  new Employee(1L,33,22343,"lasith");
        Employee employee2 =  new Employee(2L,30,134343,"lasith");
        Employee employee3 =  new Employee(3L,43,445343,"lasith");
        Employee employee4 =  new Employee(4L,53,1000342,"prag");
        Employee employee5 =  new Employee(5L,83,1000343,"lasith");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        System.out.println(findEmployeeSalarySum(employeeList));
        System.out.println(employeeSecondLargestSalary(employeeList));

    }


    // Find the sum  of the salary

    public  static double  findEmployeeSalarySum(List<Employee> employeeList){
        return employeeList.stream().mapToDouble(Employee::getSalary).sum();
    }

    // Find the employee with second largest salary
    public  static Optional<Employee>  employeeSecondLargestSalary(List<Employee> employeeList){
        return employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
    }



}
