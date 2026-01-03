package com.aditya.cubing.oops;

// Abstract class - cannot be instantiated directly
public abstract class Cube {

    // protected access modifier - accessible in subclasses
    protected int size;

    public Cube(int size) {
        this.size = size;
    }

    // Abstract method - must be implemented by subclasses
    public abstract void solve();

    // Concrete method - has implementation
    public void displaySize() {
        System.out.println("Cube size: " + size);
    }
}
