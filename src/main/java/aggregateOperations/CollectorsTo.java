package aggregateOperations;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTo {

    public static void main(String[] args) {

        List<Person> roster = Person.createRoster();


        List<String> namesOfMaleMembersCollect = roster
                .stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .map(p -> p.getName())
                .collect(Collectors.toList());

        Map<Person.Sex, List<Person>> byGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(Person::getGender));


        Map<Person.Sex, List<String>> namesByGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getGender,
                                        Collectors.mapping(
                                                Person::getName,
                                                Collectors.toList())));

        Map<Person.Sex, Integer> totalAgeByGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getGender,
                                        Collectors.reducing(
                                                0,
                                                Person::getAge,
                                                Integer::sum)));

        Map<Person.Sex, Double> averageAgeByGender = roster
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getGender,
                                Collectors.averagingInt(Person::getAge)));

        System.out.println(namesOfMaleMembersCollect);
        System.out.println(byGender);
        System.out.println(namesByGender);
        System.out.println(totalAgeByGender);
        System.out.println(averageAgeByGender);

    }



}
