package aggregateOperations.parallelism;

import methodReference.Person;

import java.util.List;

public class ParallelExercises {

    public static void main(String[] args) {

        List<Person> roster = Person.createRoster();

        double average = roster
                .parallelStream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println(average);

    }

}
