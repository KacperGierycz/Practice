package quizes.threads;

public class SynchronizedNonStaticBlockWithThis {

        public void AnyClass()
        {
            synchronized (this)
            {
                System.out.println("Synchronized Block");
            }
        }


}
