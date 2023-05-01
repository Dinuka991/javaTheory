package org.example.stream.grouping;

public class Employee {
    private Long id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    private String name;
    private String gender;


    static class EmployeeBuilder {
        private Long id;
        private String name;
        private String gender;

        public EmployeeBuilder(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public EmployeeBuilder setEmployeeGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    private Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
        this.gender = employeeBuilder.gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
}
