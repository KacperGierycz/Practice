package concurrency;

public class BadThreads {

    static String message;

    private static class CorrectorThread
            extends Thread {

        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
            // Key statement 1:
            message = "Mares do eat oats.";

            interrupt();
        }
    }

    public static void main(String args[])
            throws InterruptedException {

        CorrectorThread ct = new CorrectorThread();
        ct.start();
        message = "Mares do not eat oats.";
        Thread.sleep(2000);
        if(ct.isInterrupted()){
            System.out.println("name had been changed1");
        }
        System.out.println(message);


    }
}