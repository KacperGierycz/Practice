package quizes.threads;

public class JavaThreadsQuiz {
    public static void main(String[] args) {
        Waiting anyClass = new Waiting();

        Thread thread = new Thread() {
            @Override
            public void run() {
                anyClass.anyMethod();
            }
        };

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getState());
    }


}
