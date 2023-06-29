package collections.map;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class aggregateOperatinos {

    List<Employee> employees =
            Arrays.asList(
                    new Employee[]{
                            new Employee("John", Employee.Department.SALES, 5000),
                    new Employee("Agnes",Employee.Department.HR,8000),
                            new Employee("Luis",Employee.Department.MANAGEMENT,10000)
                    });

    void printEmplList(){
        System.out.println(employees.size());
        System.out.println(employees);
        employees.stream()
                .forEach(a -> System.out.println(a.getName()));
    }
    Map<Employee.Department, List<Employee>> byDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

    void printEmpl(){
        System.out.println(byDept);

    }

    public static void main(String[] args) {
        aggregateOperatinos arg = new aggregateOperatinos();
        arg.printEmplList();
        arg.printEmpl();
    }


}
