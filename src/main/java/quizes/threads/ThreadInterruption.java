package quizes.threads;

public class ThreadInterruption {

        public static void main(String[] args)
        {
            Thread thread = new Thread()
            {
                @Override
                public void run()
                {
                    System.out.println(isInterrupted());

                    try
                    {
                        Thread.sleep(5000);
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println("I am interrupted");
                        System.out.println(isInterrupted());
                    }

                    System.out.println(isInterrupted());
                }
            };

            thread.start();

            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            thread.interrupt();
        }


}
