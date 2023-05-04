package org.example.exception;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureException {
    public static void main(String[] args)  {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int numerator = 10;
            int denominator = 0;
            return numerator / denominator; // this will throw an ArithmeticException
        }).exceptionally(ex -> {
            if (ex instanceof ArithmeticException) {
                return 0; // return a default value instead of the exception
            } else {
                throw new RuntimeException(ex); // re-throw the exception for other exception types
            }
        });

    }
    }
