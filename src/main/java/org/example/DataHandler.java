package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    private String[] fruits = new DataRepository().getData();
    private AtomicInteger count = new AtomicInteger(1);

    public synchronized void getOutput() {
        StringBuilder sb = new StringBuilder();
        for (String fruit : fruits) {
            sb.append(String.format("(%d) %s ", count.getAndIncrement(), fruit));
        }
        System.out.println(Thread.currentThread().getName() + ": " + sb);
    }
}