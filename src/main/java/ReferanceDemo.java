import java.lang.reflect.Array;
import java.util.ArrayList;

class Person {
    String name;
    Person(String name){
        this.name=name;
    }

public class ReferanceDemo {


    }

    public static void main(String[] args) {
        ArrayList<Person> listOfPersons = new ArrayList<>();
        Person person = new Person("Ali");
        listOfPersons.add(person);
        System.out.println(listOfPersons.get(0).name);
        listOfPersons.get(0).name="Mini";
        person.name=null;
        System.out.println(listOfPersons.get(0).name);



//        String[] students = new String[10];
//        String studentName = "Peter Smith";
//        students[0] = studentName;
//        studentName = "John";
//        studentName = null;
//
//        System.out.println(students[0]);
//        System.out.println(studentName);
    }
}
