package quizes;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        String[] fruits = {
                "banana",
                "apple",
                "pears",
                "grapes"
        };
        Arrays.sort(fruits, (a, b) -> a.compareTo(b));
        for (String s: fruits) {
            System.out.print(" " + s);
        }
    }
}