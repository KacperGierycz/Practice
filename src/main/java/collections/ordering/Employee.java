package collections.ordering;

import java.util.Date;

public class Employee implements Comparable<Employee> {
    public Name name;
    public int number;
    public Date hireDate;

    public Employee(Name name, int number, Date hireDate) {
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }

    public Date hireDate(){
        return hireDate;
    }

    public Integer number(){
        return this.number;
    }

    @Override
    public int compareTo(Employee n) {
        int lastCmp = name.compareTo(n.name);
        return (lastCmp != 0 ? lastCmp : name.compareTo(n.name));
    }


}
