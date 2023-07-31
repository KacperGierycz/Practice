package collections.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMultipleCopyList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Collections.nCopies(1000, (String) null));
        list.set(0,"String");
        System.out.println(list.get(0));
        list.add("add");


        list.addAll(Collections.nCopies(69, "fruit bat"));

        list.stream()
                .forEach(o-> System.out.println(o));
        System.out.println(list.size());
    }

}
