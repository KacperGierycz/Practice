package generics;

public class Runner {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<Integer>();

        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());

        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");

        Pair<String, Integer> pp1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  pp2 = new OrderedPair<String, String>("hello", "world");

    }
}
