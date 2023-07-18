package aggregateOperations;

import java.util.List;

public class Collect {

    public static void main(String[] args) {

        List<Person> roster = Person.createRoster();

        Averager averageCollect = roster.stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .map(Person::getAge)
                .collect(Averager::new, Averager::accept, Averager::combine);


        System.out.println("Average age of male members: " +
                averageCollect.average());

    }
}
