package quizes.inheritance;

public class MainClassGetHiddenAndNotHiddenFromDescendant {
    public static void main(String[] args) {
        GetHiddenAndNotHiddenFromDescendant a = new B();
        GetHiddenAndNotHiddenFromDescendant aa = new GetHiddenAndNotHiddenFromDescendant();
        B b = new B();

        System.out.println(a.i);
        System.out.println(aa.i);
        System.out.println(b.i);
    }
}
