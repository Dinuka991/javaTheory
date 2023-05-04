package org.example.exception;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExceptionDemo4 {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> 10 / 0)
                .whenComplete((result, ex) -> {
                    if (ex != null) {
                        System.out.println("Error occurred: " + ex.getMessage());
                    } else {
                        System.out.println("Result: " + result);
                    }
                });
    }

}
