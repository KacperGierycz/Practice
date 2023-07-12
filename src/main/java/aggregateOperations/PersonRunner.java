package aggregateOperations;

import inheritance.innerNestedClassAscendant.Outer;

import java.util.List;

public class PersonRunner {


    Person p = new Person();
    Person.InnerClass i = p.new InnerClass();

    public static void main(String[] args) {

        Person.Roger r = new Person.Roger();


        Person.getInt();

        List<Person> roster = Person.createRoster();

        System.out.println("Printing with for loop: ");

        for (Person p : roster){

            System.out.println(p.getName());
        }

        System.out.println("Printing with stream: ");

        roster.stream()
                .forEach(e -> System.out.println(e.getName()));


        System.out.println("Printing with stream male person: ");
        roster
                .stream()
                .filter(e -> e.getGender() == Person.Sex.MALE)
                .forEach(e -> System.out.println(e.getName()));

        System.out.println("Printing with for loop male person: ");
        for (Person p : roster) {
            if (p.getGender() == Person.Sex.MALE) {
                System.out.println(p.getName());
            }
        }

        double average = roster
                .stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.format("The value of the average of people age is: %f "  ,average);

    }


}

