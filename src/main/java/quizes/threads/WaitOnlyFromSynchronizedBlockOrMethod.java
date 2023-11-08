package quizes.threads;

public class WaitOnlyFromSynchronizedBlockOrMethod {

    class AnyClass
    {
        synchronized void anyMethod()
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

        public static void main(String[] args)
        {
            AnyClass anyClass = new WaitOnlyFromSynchronizedBlockOrMethod().new AnyClass();

            new Thread()
            {
                @Override
                public void run()
                {
                    anyClass.anyMethod();
                }
            }.start();
        }


}
