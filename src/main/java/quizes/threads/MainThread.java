package quizes.threads;

public class MainThread {

        public static void main(String[] args)
        {
            String name = Thread.currentThread().getName();

            System.out.println(name);
        }


}
