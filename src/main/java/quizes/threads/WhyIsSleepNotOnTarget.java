package quizes.threads;

public class WhyIsSleepNotOnTarget {

        public static void main(String[] args)
        {
            Thread myThread = new Thread();

            myThread.start();

            try
            {
                myThread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }


}
