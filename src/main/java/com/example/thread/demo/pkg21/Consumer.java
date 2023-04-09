package com.example.thread.demo.pkg21;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable {

    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(;;) {
            try {
                Integer count = queue.take();
                System.out.println("consumer=" + count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
