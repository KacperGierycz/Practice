package quizes.threads;

public class WhyThereIsNoPrintOnInterrupt {


        public static void main(String[] args) throws InterruptedException {
            Thread t3 = new Thread()
            {
                @Override
                public void run()
                {
                    try {
                        System.out.println("going to sleep");
                        Thread.sleep(3000);
                        System.out.println("wake up ");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
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
                        Thread.sleep(2000);
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
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(1);
                }
            };

            t1.start();
            t2.start();
            t3.start();

        }


}
