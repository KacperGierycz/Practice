package quizes.interfaces;

public class ImplementedMethodHasToBePublic {

    interface X
    {
        void methodX();
    }

    class Y implements X
    {
        public void methodX()
        {
            System.out.println("Method X");
        }
    }

}
