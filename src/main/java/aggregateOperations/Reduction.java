package aggregateOperations;

import java.util.List;

public class Reduction {


    public static void main(String[] args) {

        List<Person> roster = Person.createRoster();

        Integer totalAge = roster
                .stream()
                .mapToInt(Person::getAge)
                .sum();

        Integer totalAgeReduce = roster
                .stream()
                .map(Person::getAge)
                .reduce(
                        0,
                        (a, b) -> a + b);


        System.out.println("totalAge: " + totalAge);

        System.out.println("totalAgeReduce: " + totalAgeReduce);


    }

}
