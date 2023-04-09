package com.example.thread.demo.pkg05;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1 + 5;
    }
}
