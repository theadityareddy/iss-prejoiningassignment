package com.aditya.cubing.datatypes;

public class CubeStatsDemo {

    public static void main(String[] args) {
        // Object creation with parameterized constructor
        CubingStats stats = new CubingStats(15, 12.45);

        // Calling instance methods
        stats.updateSolve(13);
        stats.displayEvent();
    }
}
