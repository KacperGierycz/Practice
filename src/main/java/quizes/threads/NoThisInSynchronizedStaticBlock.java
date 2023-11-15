package quizes.threads;

public class NoThisInSynchronizedStaticBlock {


        static
        {
            synchronized (NoThisInSynchronizedStaticBlock.class)
            {
                System.out.println("Synchronized Block");
            }
        }


}
