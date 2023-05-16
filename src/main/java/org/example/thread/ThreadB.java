package org.example.thread;

import java.util.List;

public class ThreadB extends Thread {
    public List<Integer> integerList;
    public ThreadB(List<Integer> integerList) {
        this.integerList = integerList;
    }
    @Override
    public void run() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
    }
}
