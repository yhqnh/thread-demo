package com.example.thread.demo.pkg19;

public class Main {

    public static void main(String[] args) {
        Producter producter = new Producter();
        Consumer consumer = new Consumer();
        Thread threadProduct = new Thread(producter);
        Thread threadConsumer = new Thread(consumer);
        threadConsumer.start();
        threadProduct.start();
    }
}
