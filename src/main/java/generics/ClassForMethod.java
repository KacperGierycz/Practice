package generics;

import java.util.Arrays;
import java.util.Collection;

public class ClassForMethod {


    public static <T> int countEven(Collection<T> a, UnaryPredicate<T> b) {
        Integer n = 0;

        for (T i : a) {

            if (b.test(i)) {
                ++n;
            }
        }
        return n;

    }
}

class OddPredicate implements UnaryPredicate<Integer> {
        public boolean test(Integer i) {
            return i % 2 == 0;
        }
    }


