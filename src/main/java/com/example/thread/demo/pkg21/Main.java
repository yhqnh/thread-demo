package com.example.thread.demo.pkg21;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(1);
        Producter producter = new Producter(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        Thread threadProduct = new Thread(producter);
        Thread threadConsumer = new Thread(consumer);
        threadConsumer.start();
        threadProduct.start();
    }
}
