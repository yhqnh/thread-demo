package com.example.thread.demo.pkg21;

import java.util.concurrent.ArrayBlockingQueue;

public class Producter implements Runnable {

    private ArrayBlockingQueue<Integer> queue;

    public Producter(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(;;) {
            try {
                queue.put(1);
                System.out.println("producter");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
