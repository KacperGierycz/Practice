package collections.map;

public class Employee {
    Integer salary;

    String name;

    public Department department;

    public Employee() {
    }

    public Employee(String name, Department department, Integer salary ) {
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    public enum Department{SALES, HR, MANAGEMENT}

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
