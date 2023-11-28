package quizes.threads;

public class InterruptClearsFlagAfterUse {

    public class JavaThreadsQuiz
    {
        public static void main(String[] args)
        {
            Thread thread = new Thread()
            {
                @Override
                public void run()
                {
                    System.out.println(interrupted());

                    interrupt();

                    System.out.println(interrupted());

                    System.out.println(interrupted());
                }
            };

            thread.start();
        }
    }

}
