package quizes.inheritance;

public class ConstructorChaining1 {

        public ConstructorChaining1()
        {
            System.out.println("Class A Constructor");
        }
    }

    class ConstructorChaining2 extends ConstructorChaining1
    {
        public ConstructorChaining2()
        {
            System.out.println("Class B Constructor");
        }
    }

    class ConstructorChaining3 extends ConstructorChaining2
    {
        public ConstructorChaining3()
        {
            System.out.println("Class C Constructor");
        }
    }


