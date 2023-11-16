package quizes.threads;

public class WhatIsWait {

    class AnyClass
    {
        void anyMethod()
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
            AnyClass anyClass = new WhatIsWait().new AnyClass();

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
