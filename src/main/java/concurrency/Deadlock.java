package concurrency;

public class Deadlock {
    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                            + "  has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        });
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        });
        while(thread1.isAlive()){
            try {
                thread1.join(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        thread2.start();
    }
}
