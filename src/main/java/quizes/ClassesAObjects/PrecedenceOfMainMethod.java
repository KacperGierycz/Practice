package quizes.ClassesAObjects;

public class PrecedenceOfMainMethod {

        {
            System.out.println("First");
        }

        {
            System.out.println("Second");
        }

        {
            System.out.println("Third");
        }

        public PrecedenceOfMainMethod()
        {
            System.out.println("Fourth");
        }

        public static void main(String[] args)
        {
            System.out.println("Fifth");

            PrecedenceOfMainMethod a = new PrecedenceOfMainMethod();
        }
    }


