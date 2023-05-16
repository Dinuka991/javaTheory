package org.example.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread( () -> {
//            System.out.println("thread is up");
//        });
//        thread.start();
//        System.out.println("not in the thread");
//        try {
//            thread.join();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        List<Integer> integerList = new ArrayList<>();
        ThreadB thread1 = new ThreadB(integerList);
        thread1.start();
        thread1.join();
        System.out.println(integerList);
    }

}
