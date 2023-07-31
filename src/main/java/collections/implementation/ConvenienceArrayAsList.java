package collections.implementation;

import java.util.Arrays;
import java.util.List;

public class ConvenienceArrayAsList {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Ann");
        names.add("lisa");

        System.out.println(names);
    }



}
