package com.example.thread.demo.pkg24;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread extends Thread {

    private static int count = 3;
    private static BigDecimal price = new BigDecimal(100);
    private static BigDecimal minPrice = new BigDecimal(0.01);
    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println("没有抢到红包");
            } else {
                if (count == 1) {
                    System.out.println("抢到红包=" + price);
                } else {
                    BigDecimal money = price.subtract(minPrice.multiply(BigDecimal.valueOf(count - 1)));
                    BigDecimal v = BigDecimal.valueOf(new Random().nextDouble(money.doubleValue()));
                    if (v.doubleValue() < minPrice.doubleValue()) {
                        v = minPrice;
                    }
                    v = v.setScale(2, RoundingMode.HALF_UP);
                    System.out.println("抢到红包=" + v);
                    price = price.subtract( v);
                }
                count --;
            }
        }
    }
}
