package org.example.exception;

import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5);
        CompletableFuture<Integer> future2 = future.thenApply(x -> x*2);
        System.out.println(future2.get());

        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 5);
        CompletableFuture<Integer> future4 = future3.thenCompose(x -> CompletableFuture.supplyAsync(() -> x * 2));
        System.out.println(future4.get());

    }
}
