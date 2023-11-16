package quizes.threads;

public class WaitNotifyAllAndPriority {


        public static void main(String[] args)
        {
            AnyClass anyClass = new AnyClass();

            Thread t1 = new Thread("Thread_1")
            {
                @Override
                public void run()
                {
                    anyClass.methodOne();
                }
            };
            t1.setPriority(Thread.MIN_PRIORITY);
            t1.start();

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            Thread t2 = new Thread("Thread_2")
            {
                @Override
                public void run()
                {
                    anyClass.methodOne();
                }
            };
            t2.setPriority(Thread.MAX_PRIORITY);
            t2.start();

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            Thread t3 = new Thread("Thread_3")
            {
                @Override
                public void run()
                {
                    anyClass.methodTwo();
                }
            };
            t3.start();
        }


}
