package com.aditya.cubing.multithreading;

// Implementing Runnable interface for thread execution
public class PracticeTask implements Runnable {

    private PracticeCounter counter;

    public PracticeTask(PracticeCounter counter) {
        this.counter = counter;
    }

    // Overriding run() method - defines thread's task
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}
