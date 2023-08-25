package quizes.ClassesAObjects;

public class InstanceInitializationBlockAndOthers {

        int i;

        {
            System.out.println("IIB-1");

            i = 100;
        }

        {
            System.out.println("IIB-2");

            System.out.println(i);

            i = 200;
        }

        public static void main(String[] args)
        {
            System.out.println("main");

            InstanceInitializationBlockAndOthers a = new InstanceInitializationBlockAndOthers();

            System.out.println(a.i);
        }
    }


