package org.example.thread.intermidate;

import java.util.concurrent.Executor;

public class SimpleExecutor implements Executor {

    public static void main(String[] args) {
        Executor executor = new SimpleExecutor();
        executor.execute(() -> System.out.println("Task is execute by simple executor"));
    }

    @Override
    public  void execute(Runnable runnable){
        new Thread(runnable).start();
    }
}
