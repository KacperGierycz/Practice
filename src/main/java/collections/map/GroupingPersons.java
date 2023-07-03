package collections.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingPersons {

    List<Person> persons = Arrays.asList(new Person[]{new Person("John","London")
        , new Person("Julia", "New York")});

    List<Person> personsStates = Arrays.asList(
            new Person[]{new Person("John","London", "County Of London")
                    , new Person("Elizabeth", "Brickstone","County Of London")
            , new Person("Julia", "New York","New York")
            ,new Person("Lisa","Princeton", "New York")});


    Map<String,List<Person>> getPeopleByCity(){
        // Classify Person objects by city
        Map<String, List<Person>> peopleByCity
                = persons.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        return peopleByCity;
    }

    Map<String, Map<String, List<Person>>> getPeopleByStateAndCity(){
        Map<String, Map<String, List<Person>>> peopleByStateAndCity = personsStates.stream()
                .collect(Collectors.groupingBy(Person::getState,
                        Collectors.groupingBy(Person::getCity)));


        return peopleByStateAndCity;
    }

    void printMap(Map<?,?> m){
        System.out.println(m);
    }

    public static void main(String[] args) {
        GroupingPersons gp = new GroupingPersons();
        gp.printMap(gp.getPeopleByCity());
        gp.printMap(gp.getPeopleByStateAndCity());
    }



}
