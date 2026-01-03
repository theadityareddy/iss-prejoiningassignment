package com.aditya.cubing.controlflow;

public class SolveAnalyzer {

    // Static method - can be called without object creation
    public static void analyzeSolveTimes(int[] solveTimes) {

        // if statement - conditional execution
        if (solveTimes == null || solveTimes.length == 0) {
            throw new IllegalArgumentException("Solve times cannot be empty");
        }

        // Enhanced for loop - iterating through array
        for (int time : solveTimes) {

            // continue statement - skip current iteration
            if (time <= 0) {
                continue;
            }

            // if-else if-else chain - multiple conditions
            if (time < 10) {
                System.out.println("World class solve: " + time);
            } else if (time < 20) {
                System.out.println("Good solve: " + time);
            } else {
                System.out.println("Needs improvement: " + time);
            }
        }
    }

    public static void evaluateCubeType(int cubeSize) {

        // switch statement - multi-way branching
        switch (cubeSize) {
            case 2:
                System.out.println("2x2 Cube");
                break; // break statement to exit switch
            case 3:
                System.out.println("3x3 Cube");
                break;
            case 4:
                System.out.println("4x4 Cube");
                break;
            default: // default case
                System.out.println("Unknown cube type");
        }
    }

    public static void practiceCountdown(int seconds) {

        // while loop - pre-test loop
        while (seconds > 0) {
            System.out.println("Practice starts in: " + seconds);
            seconds--; // decrement operator
        }

        // do-while loop - post-test loop (executes at least once)
        do {
            System.out.println("Go!");
        } while (false);
    }
}
