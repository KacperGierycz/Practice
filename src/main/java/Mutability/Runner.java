package Mutability;

public class Runner{

    public static void main(String[] args) {

        MutabilityAndNoMutability m = new MutabilityAndNoMutability();

        System.out.println(m.mo.x + " " + m.mo.y);

        m.mo.changeX();

        System.out.println(m.mo.x + " " + m.mo.y);

        m.mo.changeY();
        System.out.println(m.mo.x + " " + m.mo.y);
        m.newMutableObject();
        System.out.println(m.mo.x + " " + m.mo.y);

        System.out.println(m.getMy());
        m.changeMyAndthisMy(3);
        m.change();
    }
}
