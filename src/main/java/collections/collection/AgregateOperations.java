package collections.collection;

import collections.set.Person;
import inheritance.innerNestedClassAscendant.Outer;

import java.util.*;
import java.util.stream.Collectors;

public class AgregateOperations {

    Person[] people = new Person[]{new Person("John"),new Person("Zami")};
    List<Person> listOfPeople = Arrays.asList(people);
    ArrayList<Person> arrayListOfPeople = new ArrayList<>(listOfPeople);
    Person alice = new Person("Alice",8000);
    Person John = new Person("John", 4000);

  //  List<Person> PList = Arrays.asList(new Person("John", 4000),new Person("Alice",8000),new Person("John", 4000),new Person("John", 4000),new Person("John", 4000));
  List<Person> PList = new ArrayList<>();

    ArrayList<Person> employees = new ArrayList<Person>(PList);



    public int getSalary(){
    int total = employees.stream()
            .collect(Collectors.summingInt(Person::getSalary));
    return total;
    }

    static void filter(Collection<?> c) {
        for (Iterator<?> it = c.iterator(); it.hasNext(); )
            if (!cond(it.next())) {
                it.remove();
            }
    }

    private static boolean cond(Object next) {

        if (next instanceof Person) {
            if ((int) ((Person) next).getSalary() > 4000) {
                System.out.println(next);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        AgregateOperations calc = new AgregateOperations();
        int salary = calc.getSalary();
        System.out.println(salary);

        Person alice = new Person("Alice",8000);
        Person John = new Person("John", 4000);
        calc.employees.add(alice);
        calc.employees.add(John);
        calc.employees.add(John);
        calc.employees.add(John);
        calc.employees.add(John);
        Object[] toArrayEmployees = calc.employees.toArray();
        Person[] arrayOfTypePersonFromMethod = calc.employees.toArray(new Person[0]);
        Person[] pp = new Person[]{new Person("Ian")};
        System.out.println(arrayOfTypePersonFromMethod);
        System.out.println("array: ");
for(Person p:arrayOfTypePersonFromMethod){
    System.out.print(p.toString());
}
        System.out.println("End of Array.");

   //     filter(calc.employees);
        System.out.println(calc.employees);
        Person john = calc.employees.get(1);//new Person("John", 4000);

       // calc.employees.removeAll(Collections.singleton(john));
        calc.employees.removeAll(Collections.singleton(john));
        System.out.println("after removeAll");
        System.out.println(calc.employees);


    }


}
