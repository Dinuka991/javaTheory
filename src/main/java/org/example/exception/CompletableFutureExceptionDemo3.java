package org.example.exception;

import java.sql.SQLOutput;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExceptionDemo3 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10 / 0);
        future.handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Error is  this :" + ex.getMessage());
            }
            return result;
        });
    }
}
