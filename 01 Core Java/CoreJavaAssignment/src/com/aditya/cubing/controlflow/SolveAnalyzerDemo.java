package com.aditya.cubing.controlflow;

public class SolveAnalyzerDemo {

    public static void main(String[] args) {
        // Array initialization
        int[] solves = {12, 9, 25, -1};

        // Calling static methods using class name
        SolveAnalyzer.analyzeSolveTimes(solves);
        SolveAnalyzer.evaluateCubeType(3);
        SolveAnalyzer.practiceCountdown(3);
    }
}
