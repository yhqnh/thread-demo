package com.example.thread.demo.pkg19;

import lombok.Synchronized;

public class Producter implements Runnable {

    @Override
    public void run() {
        for(;;) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }
                if (Desk.foodFlag == 0) {
                    System.out.println("producter=" + Desk.count);
                    Desk.lock.notifyAll();
                    Desk.foodFlag = 1;
                }
                if (Desk.foodFlag == 1) {
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
