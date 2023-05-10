package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// A Runnable task that prints a message
class Task implements Runnable {
    private String message;

    public Task(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }
}

