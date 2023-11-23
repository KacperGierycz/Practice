package quizes.threads;

public class WaitNotifyAllAndPriority {


        public static void main(String[] args)
        {
            AnyClass anyClass = new AnyClass();
            System.out.println(1);
            Thread t1 = new Thread("Thread_1")
            {
                @Override
                public void run()
                {
                    System.out.println(2);
                    anyClass.methodOne();
                }
            };
            t1.setPriority(Thread.MIN_PRIORITY);
            t1.start();

//            try
//            {
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
            System.out.println(3);
            Thread t2 = new Thread("Thread_2")
            {
                @Override
                public void run()
                {
                    System.out.println(4);
                    anyClass.methodOne();
                }
            };
            t2.setPriority(Thread.MAX_PRIORITY);
            t2.start();

//            try
//            {
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }

            Thread t3 = new Thread("Thread_3")
            {
                @Override
                public void run()
                {
                    System.out.println(5);
                    anyClass.methodTwo();
                }
            };
            t3.start();
        }


}
