package quizes.inheritance;

public class MainClassBeCarefullyWithPointers {
    public static void main(String[] args) {
        BeCarefullyWithPointers a = new BeCarefullyWithPointers();

        BeCarefullyWithPointers2 b = new BeCarefullyWithPointers2(a);

        System.out.println(a.i);

        System.out.println(b.i);

        System.out.println(b.a.i);

        b.a.i = 2121;

        System.out.println("--------");

        System.out.println(a.i);

        System.out.println(b.i);
    }


}
