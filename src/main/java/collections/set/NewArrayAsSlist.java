package collections.set;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewArrayAsSlist {
    String[] strings = new String[]{"one","two","two"};

    private void SezameOpenStream(){

        String string = strings[1];
        List<Person> listOfPersons1 = listOfPersons;
        Stream<String> stream = Arrays.stream(strings);
        stream.forEach(System.out::println);

    }


    Person[]arrOfPerson = new Person[]{new Person("Jin")};

    List<Person> firstOfList = Arrays.asList(arrOfPerson);

    List<Person> listOfPersons = Arrays.asList(new Person("Josh"),new Person("Josh"));


    public void Streamer(){
        listOfPersons.stream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        Person[]arrOfPerson = new Person[]{new Person("Jin")};

        List<Person> firstOfList1 = Arrays.asList(arrOfPerson);

        firstOfList1.stream()
                .filter(a -> a.getName().equals("Jin"))
                .forEach(System.out::println);

    }


}
