package com.aditya.cubing.oops;

// Inheritance - extends abstract class, implements interface (multiple inheritance via interfaces)
public class ThreeByThreeCube extends Cube implements Timer {

    private int solveTime;

    // Constructor calling parent constructor using super keyword
    public ThreeByThreeCube(int solveTime) {
        super(3); // Calling parent class constructor
        this.solveTime = solveTime;
    }

    // Getter method - encapsulation
    public int getSolveTime() {
        return solveTime;
    }

    // Setter method - encapsulation
    public void setSolveTime(int solveTime) {
        this.solveTime = solveTime;
    }

    // Overriding abstract method from parent class
    @Override
    public void solve() {
        System.out.println("Solving 3x3 cube");
    }

    // Implementing interface method
    @Override
    public void startTimer() {
        System.out.println("Timer started");
    }

    // Implementing interface method
    @Override
    public void stopTimer() {
        System.out.println("Timer stopped at " + solveTime + " seconds");
    }
}
