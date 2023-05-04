package org.example.thread;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread = new Thread( () -> {
            System.out.println("thread is up");
        });
        thread.start();
        System.out.println("not in the thread");
        try {
            thread.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}
