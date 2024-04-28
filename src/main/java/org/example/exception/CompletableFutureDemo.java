package org.example.exception;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            // perform some task for thread 1
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            // task 2
        });

        CompletableFuture.allOf(future1, future2).join();
    }
}
