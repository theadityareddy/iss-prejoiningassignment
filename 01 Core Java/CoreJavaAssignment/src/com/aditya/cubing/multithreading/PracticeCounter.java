package com.aditya.cubing.multithreading;

public class PracticeCounter {

    // volatile keyword - ensures visibility across threads
    private volatile int count = 0;

    // synchronized method - thread-safe operation
    public synchronized void increment() {
        count++; // Atomic operation with synchronization
    }

    public int getCount() {
        return count;
    }
}
