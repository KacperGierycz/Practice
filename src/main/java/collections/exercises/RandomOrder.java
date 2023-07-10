package collections.exercises;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomOrder {


    public static void main(String[] args) {
        //get a list from args
        List<String> l = Arrays.asList(args);
        Collections.shuffle(l);
        Collections.shuffle(Arrays.asList(args));
        for(String s: args){
            System.out.println(s);
        }
        Arrays.asList(args).stream().forEach(System.out::println);
    }
}
