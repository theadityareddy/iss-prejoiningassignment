package com.aditya.cubing.collections;

// Implementing Comparable interface for natural ordering
public class CubingResult implements Comparable<CubingResult> {

    private String solverName;
    private int solveTime;

    public CubingResult(String solverName, int solveTime) {
        this.solverName = solverName;
        this.solveTime = solveTime;
    }

    // Getter method - encapsulation
    public String getSolverName() {
        return solverName;
    }

    // Getter method
    public int getSolveTime() {
        return solveTime;
    }

    // Overriding compareTo() method from Comparable interface
    @Override
    public int compareTo(CubingResult other) {
        return this.solveTime - other.solveTime; // Compare by solve time
    }

    // Overriding toString() method for string representation
    @Override
    public String toString() {
        return solverName + " : " + solveTime;
    }
}
