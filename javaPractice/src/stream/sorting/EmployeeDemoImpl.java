package stream.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDemoImpl implements EmployeeDemo {


    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee("Kasun",33,5444.00);
        Employee employee1 = new Employee("Ajith",55,484322.00);
        Employee employee2 = new Employee("saman",64,474342.00);
        Employee employee3 = new Employee("Anathnoy De So",64,434342.00);
        Employee employee4 = new Employee("Silve",64,434342.00);

        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        EmployeeDemo employeeDemo = new EmployeeDemoImpl();
        System.out.println(employeeDemo.employeeWithMaxSalary(employeeList));
        System.out.println(employeeDemo.employeeWithMinSalary(employeeList));
        System.out.println(employeeDemo.sortByEmployeeAgeAsc(employeeList));
        System.out.println(employeeDemo.sortEmployeeAgeDesc(employeeList));
        employeeDemo.groupByAge(employeeList).forEach((k,v)-> System.out.println("Age : "+k+" Count : "+v));
        System.out.println(employeeDemo.secondHighestSalary(employeeList));
        System.out.println(employeeDemo.employeesWithSalaryGreaterThan(employeeList,450000));
        System.out.println(employeeDemo.sumOfSalaries(employeeList));
        System.out.println(employeeDemo.employeeWithLongestName(employeeList));
        System.out.println(employeeDemo.averageSalary(employeeList));
        System.out.println(employeeDemo.employeesWithSalaryLessThanAverage(employeeList));

    }

    @Override
    public Employee employeeWithMaxSalary(List<Employee> employeeList) {
        return employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
    }

    @Override
    public Employee employeeWithMinSalary(List<Employee> employeeList) {
        return employeeList.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
    }


    @Override
    public List<Employee> sortByEmployeeAgeAsc(List<Employee> employeeList) {
        return  employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
    }

    @Override
    public List<Employee> sortEmployeeAgeDesc(List<Employee> employeeList) {
        return  employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).toList();
    }

    @Override
    public Map<Integer, Long> groupByAge(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
    }

    @Override
    public Optional<Employee> secondHighestSalary(List<Employee> employeeList) {
        return employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
    }

    @Override
    public List<Employee> employeesWithSalaryGreaterThan(List<Employee> employeeList, double salary) {
        return employeeList.stream().filter(employee ->  employee.getSalary() > salary).toList();
    }

    @Override
    public Double sumOfSalaries(List<Employee> employeeList) {
         return  employeeList.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public Optional<Employee> employeeWithLongestName(List<Employee> employeeList) {
        return employeeList.stream().max(Comparator.comparing(employee -> employee.getName().length()));
    }

    @Override
    public Double averageSalary(List<Employee> employeeList) {
        return employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    @Override
    public List<Employee> employeesWithSalaryLessThanAverage(List<Employee> employeeList) {
        return employeeList.stream().filter(employee -> employee.getSalary() < averageSalary(employeeList)).toList();
    }


}
