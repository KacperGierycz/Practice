package collections.list;

import collections.set.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    List<Person> list1 = Arrays.asList(new Person("Wojtek", 0), new Person("Kacper", 0));

    List<Person> list4 = Arrays.asList(new Person("Wojtek", 0), new Person("Kacper", 0));


    List<Person> list3 = new ArrayList<Person>(list1);
    List<Person> list2 = new ArrayList<Person>(list4);
    List<Person> people;


 public Lists(){
    people = new ArrayList<>(list2);
     System.out.println(people.equals(list2));
    list2.addAll(list3);
     System.out.println(people);
     System.out.println(list2);
     List<String> list = people.stream()
             .map(Person::getName)
             .collect(Collectors.toList());

     List<String> sub2 = list.subList(0,1);
     sub2.add("Kinia");



     System.out.println(list);

}



    public static void main(String[] args) {
        Lists l = new Lists();
    }
}
