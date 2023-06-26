package collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class PeopleToSet {

    public static <E> Set<E> removeDups(Collection<E> c) {
        return new LinkedHashSet<E>(c);
    }

    public static void main(String[] args) {

        Person[] arrayPeople = new Person[]{new Person("John"),new Person("Agnes"),new Person("Kinia"),new Person("Kinia")};

        List<Person> people = Arrays.asList(arrayPeople);

        ArrayList<Person> peopleArrayList = new ArrayList<Person>(people);


        people.stream().forEach(System.out::println);

        Set<String> set = people.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        set.stream().forEach(a -> System.out.println(a.toString()));

        Collection<Person> noDups = new LinkedHashSet<Person>(people);

        Set<String> people1 = people.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        PeopleToSet peop = new PeopleToSet();
    //    Set<String> people1 = peop.removeDups(noDups);
        System.out.println("Linked Set with no duplicates size: "+ noDups.size() + " distinct world: "+ noDups );

        System.out.println("Linked Set with no duplicates size: "+ people1.size() + " distinct world: "+ people1 );

        people1.stream().forEach(a -> people1.contains(a));


    }

}
