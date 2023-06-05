package quizes;

import java.util.stream.Stream;

public class App3 {
    public static void main(String[] args) {
        Stream < Integer > nums = Stream.of(1, 2, 3, 4, 5);
        nums.filter(n -> n % 2 == 1);
        nums.forEach(p -> System.out.print(p));
    }
}