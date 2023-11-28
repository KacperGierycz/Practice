package quizes.threads;

public class WaitOnThread {

        public static void main(String[] args)
        {
            Thread thread = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        System.out.println("sleep5 start");
                        Thread.sleep(5000);
                        System.out.println("sleep5 over");
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            };

            thread.start();

            try
            {
                System.out.println("sleep2 start");
                Thread.sleep(2000);
                System.out.println("sleep2 over");
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println(thread.getState());
        }


}
