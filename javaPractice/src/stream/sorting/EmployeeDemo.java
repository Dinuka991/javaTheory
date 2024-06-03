package stream.sorting;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeDemo {

      Employee  employeeWithMaxSalary(List<Employee> employeeList);
      Employee  employeeWithMinSalary(List<Employee> employeeList);
      List<Employee>  sortByEmployeeAgeAsc(List<Employee> employeeList);
      List<Employee>  sortEmployeeAgeDesc(List<Employee> employeeList);
      Map<Integer,Long> groupByAge(List<Employee> employeeList);
      Optional<Employee> secondHighestSalary(List<Employee> employeeList);
      List<Employee> employeesWithSalaryGreaterThan(List<Employee> employeeList, double salary);
      Double sumOfSalaries(List<Employee> employeeList);
      Optional<Employee>  employeeWithLongestName(List<Employee> employeeList);
      Double averageSalary(List<Employee> employeeList);
        List<Employee> employeesWithSalaryLessThanAverage(List<Employee> employeeList);



}
