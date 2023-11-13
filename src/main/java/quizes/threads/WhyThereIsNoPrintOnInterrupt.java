package quizes.threads;

public class WhyThereIsNoPrintOnInterrupt {


        public static void main(String[] args)
        {
            Thread t3 = new Thread()
            {
                @Override
                public void run()
                {
                    System.out.println(3);

                }
            };

            Thread t2 = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        t3.join();
                        t3.interrupt();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(2);
                }
            };

            Thread t1 = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        t2.join();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(1);
                }
            };

            t1.start();
//            t1.interrupt();
            t2.start();
//            t2.interrupt();

            t3.start();
            t3.interrupt();

        }


}
