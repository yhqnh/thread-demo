package com.example.thread.demo.pkg19;

public class Consumer implements Runnable {

    @Override
    public void run() {
        for(;;) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }
                if (Desk.foodFlag == 0) {
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (Desk.foodFlag == 1) {
                    Desk.count--;
                    System.out.println("consumer=" + Desk.count);
                    Desk.lock.notifyAll();
                    Desk.foodFlag = 0;
                }
            }
        }
    }
}
