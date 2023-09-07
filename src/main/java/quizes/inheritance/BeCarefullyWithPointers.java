package quizes.inheritance;

public class BeCarefullyWithPointers {


        int i = 1212;

}

    class BeCarefullyWithPointers2 extends BeCarefullyWithPointers
    {
        BeCarefullyWithPointers a;

        public BeCarefullyWithPointers2(BeCarefullyWithPointers a)
        {
            this.a = a;
        }
    }

