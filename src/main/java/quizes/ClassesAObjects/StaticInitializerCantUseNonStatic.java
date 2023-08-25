package quizes.ClassesAObjects;

public class StaticInitializerCantUseNonStatic {


//If static is remove editor is pointing to mistake
        static int i;

        static
        {
            System.out.println(i);
        }

    public static void main(String[] args) {
        System.out.println("this");
    }


}
