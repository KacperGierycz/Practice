package aggregateOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.jar.JarOutputStream;
import java.util.stream.Collectors;

public class Exercises {

    static void exampleForLoop(){
        List<Person> roster = Person.createRoster();
        for (Person p : roster) {
            if (p.getGender() == Person.Sex.MALE) {
                System.out.println(p.getName());
            }
        }
    }

    static void streamInsteadOfLoop(){

        List<Person> roster = Person.createRoster();
        roster.stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .map(p -> p.getName())
                .forEach(System.out::println);

    }



    static void nestedLoopWithSortAfter(){
        List<Album> favs = new ArrayList<>();
        ArrayList<Album> albums = Album.createAlbums();
        for (Album a : albums) {
            boolean hasFavorite = false;
            for (Track t : a.tracks) {
                if (t.rating >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                favs.add(a);
        }
        Collections.sort(favs, new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                return a1.name.compareTo(a2.name);
            }});
        for (Album a : favs){
            System.out.println(a.name);
        }
    }

    static void streamFromLoopInLoopAndSorting(){
//        List<Album> favs = new ArrayList<>();
        ArrayList<Album> albums = Album.createAlbums();

//        albums.stream().peek(a-> System.out.println(a));

//        List<Album> favs =  albums
//                .stream()
//                        .collect(Collectors.toList());



        List<Album> favs =  albums
                .stream()
                        .filter(a -> a.getTracks()
                                .stream()
                                .anyMatch(t->t.getRating() >= 4))
                .sorted(Comparator.comparing(a -> a.name))
                                        .collect(Collectors.toList());

        favs.stream()
                .forEach(a -> System.out.println(a.name));

//        System.out.println(favs);

    }


    public static void main(String[] args) {

        System.out.println("Standard Loop: ");
        exampleForLoop();
        System.out.println("Stream from standard loop: ");
        streamInsteadOfLoop();
        System.out.println("Standard loop with loop and sorting with comparator with anonymous class: ");
        nestedLoopWithSortAfter();
        System.out.println("Stream of list nested in list with sorting after:");
        streamFromLoopInLoopAndSorting();


    }

}
