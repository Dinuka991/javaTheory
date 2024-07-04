package org.example.stream.employee.java8;

public class Employee {
    private Long employeeId;
    private int age;
    private  double salary;

    public Employee(Long employeeId, int age, double salary, String name) {
        this.employeeId = employeeId;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    private String name;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
