package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// A class that creates and executes tasks using an ExecutorService
public class ConcurrencyExample {

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 4
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit 10 tasks to the executor
        for (int i = 0; i < 10; i++) {
            executor.submit(new Task("Task " + i));
        }

        // Shutdown the executor gracefully
        executor.shutdown();
    }
}
