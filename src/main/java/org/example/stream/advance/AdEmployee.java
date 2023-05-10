package org.example.stream.advance;

public class AdEmployee {
    private Long id;
    private String name;
    private String gender;
    private Integer age;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    static class EmployeeBuilder {
        private Long id;
        private String name;
        private String gender;

        private Integer age;

        public EmployeeBuilder(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public EmployeeBuilder setEmployeeGender(String gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setEmployeeAge(Integer age) {
            this.age = age;
            return this;
        }


        public AdEmployee build() {
            return new AdEmployee(this);
        }

    }

    private AdEmployee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
        this.gender = employeeBuilder.gender;
        this.age = employeeBuilder.age;
    }

    public Long getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
