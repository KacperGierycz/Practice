package aggregateOperations;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class ParallelStreams{

    public static void main(String[] args) {

        List<Person> roster = Person.createRoster();

        // First use of parallel stream with parallelStream()
        System.out.println("Average with average()");
        double average = roster
                .parallelStream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println(average);


    }

}
