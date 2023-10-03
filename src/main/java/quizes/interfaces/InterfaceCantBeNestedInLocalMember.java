package quizes.interfaces;

public class InterfaceCantBeNestedInLocalMember {

    interface A
    {
        void methodA();
    }

    class B implements A
    {
        public void methodA()
        {
            interface C
            {
                int i = 123;
            }
        }
    }

}
