package quizes.inheritance;

public class LetsRockClassTwo extends LetsRock {
    static {
        System.out.println("first static" + i + " " + j);
        i++;
    }

    static {
        System.out.println("second static" + j + " " + i);
        --j;
    }

    public static void main(String[] args) {
        System.out.println(i);

        System.out.println(j);
    }
}
