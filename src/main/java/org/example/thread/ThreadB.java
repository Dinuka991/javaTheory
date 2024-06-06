package org.example.thread;

import java.util.List;

public class ThreadB extends Thread {
    private final List<Integer> integerList;

    public ThreadB(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        // Add elements to the list
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
    }
}
