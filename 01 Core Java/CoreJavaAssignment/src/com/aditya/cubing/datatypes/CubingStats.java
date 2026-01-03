package com.aditya.cubing.datatypes;

public class CubingStats {

    // static final variable - constant, class-level
    public static final String EVENT_NAME = "Speed Cubing";

    // Primitive data types - instance variables
    private byte attemptCount; // 8-bit integer
    private short bestAverage; // 16-bit integer
    private int solveTime; // 32-bit integer
    private long totalPracticeTime; // 64-bit integer
    private float accuracy; // 32-bit floating point
    private double personalBest; // 64-bit floating point
    private char cubeCategory; // single character
    private boolean isRecordBroken; // boolean (true/false)

    // Default constructor - no parameters
    public CubingStats() {
        this.attemptCount = 0;
        this.isRecordBroken = false;
    }

    // Parameterized constructor - with parameters
    public CubingStats(int solveTime, double personalBest) {
        this.solveTime = solveTime;
        this.personalBest = personalBest;
    }

    // Method with local variable
    public void updateSolve(int newSolveTime) {
        int improvement; // Local variable - method scope
        improvement = solveTime - newSolveTime;
        solveTime = newSolveTime;

        System.out.println("Improvement: " + improvement);
    }

    // final method - cannot be overridden
    public final void displayEvent() {
        System.out.println("Event: " + EVENT_NAME);
    }
}
