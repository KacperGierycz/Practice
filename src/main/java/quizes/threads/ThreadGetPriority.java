package quizes.threads;

public class ThreadGetPriority {


        public static void main(String[] args)
        {
            Thread thread = new Thread();

            thread.start();

            System.out.println(Thread.currentThread().getPriority());

            System.out.println(thread.getPriority());

            System.out.println(Thread.currentThread().getName());

            System.out.println(thread.getName());

            thread.interrupt();

        }


}
