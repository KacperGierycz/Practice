package quizes.inheritance;

public class ConstructorCanHasThisOrSuper {


        public ConstructorCanHasThisOrSuper()
        {
            super();

         //   this(10);
        }

        public ConstructorCanHasThisOrSuper(int i)
        {
            System.out.println(i);
        }


}
