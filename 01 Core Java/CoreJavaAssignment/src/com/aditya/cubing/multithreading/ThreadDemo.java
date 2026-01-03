package com.aditya.cubing.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

    public static void main(String[] args) {

        PracticeCounter counter = new PracticeCounter();

        // Creating Thread objects using Runnable
        Thread thread1 = new Thread(new PracticeTask(counter));
        Thread thread2 = new Thread(new PracticeTask(counter));

        // start() method - begins thread execution
        thread1.start();
        thread2.start();

        // ExecutorService - thread pool management
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // execute() - submitting tasks to thread pool
        executorService.execute(new PracticeTask(counter));
        executorService.execute(new PracticeTask(counter));

        // shutdown() - gracefully shutting down executor
        executorService.shutdown();

        System.out.println("Total practice count: " + counter.getCount());
    }
}
