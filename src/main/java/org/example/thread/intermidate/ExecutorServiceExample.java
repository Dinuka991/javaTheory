package org.example.thread.intermidate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();


        executorService.execute(() -> System.out.println("Executing task 1"));
        executorService.execute(() -> System.out.println("Executing task 2"));

        executorService.shutdown();

        try {
            if(!executorService.awaitTermination(800, TimeUnit.MICROSECONDS)){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            throw new RuntimeException(e);
        }


    }




}
