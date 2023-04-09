package com.example.thread.demo.pkg24;

public class Main {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        MyThread myThread5 = new MyThread();

        myThread1.setName("thread1");
        myThread2.setName("thread2");
        myThread3.setName("thread3");
        myThread4.setName("thread4");
        myThread5.setName("thread5");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
