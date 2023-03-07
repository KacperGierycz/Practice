package generics;

import java.util.Arrays;
import java.util.Collection;

public class Test {

    public static void main(String[] args) {

        Collection<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int t = ClassForMethod.countEven(integers, new OddPredicate());
        System.out.println("Number of odd integers = " + t);

    }
}
