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
                            new Employee("Susan", Employee.Department.SALES,5500),
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

    public Map<Employee.Department, Integer> getSalariesPerDep(){
        Map<Employee.Department, Integer> totalByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));
        return totalByDept;
    }

    void printEmpl(){
        System.out.println(byDept);

    }

    public static void main(String[] args) {
        aggregateOperatinos arg = new aggregateOperatinos();
        System.out.println("Printing EmplList:");
        arg.printEmplList();
        System.out.println("Printing printEmployees:");
        arg.printEmpl();
        System.out.println("Printing getSalariesPerDepartment:");
        System.out.println(arg.getSalariesPerDep());
    }


}
