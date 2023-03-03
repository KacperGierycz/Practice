package generics;

public class Runner {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<Integer>();

        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());

        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");

        PairX<String, Integer> pp1 = new OrderedPair<String, Integer>("Even", 8);
        PairX<String, String>  pp2 = new OrderedPair<String, String>("hello", "world");


        Pair<Integer, String> ppp1 = new Pair<>(1, "apple");
        Pair<Integer, String> ppp2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(ppp1, ppp2);

        Pair<Integer, String> pppp1 = new Pair<>(1, "apple");
        Pair<Integer, String> pppp2 = new Pair<>(2, "pear");
        boolean same2 = Util.compare(pppp1, pppp2);

    }
}
