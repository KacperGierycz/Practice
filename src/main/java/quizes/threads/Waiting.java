package quizes.threads;

public class Waiting {

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

