package org.example.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        // Create a mutable list using ArrayList
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 5));

        // Create and start ThreadB
        ThreadB thread1 = new ThreadB(integerList);
        thread1.start();

        // Ensure the main thread waits for thread1 to complete
        thread1.join();

        // Print the list after thread1 has finished its execution
        System.out.println(integerList);
    }

}
