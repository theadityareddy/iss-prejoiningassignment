package com.aditya.cubing.exceptions;

public class SolveValidator {

    // Method declaring checked exception with throws keyword
    public static void validateSolveTime(int solveTime) throws InvalidSolveTimeException {

        if (solveTime <= 0) {
            // throw statement - throwing custom exception
            throw new InvalidSolveTimeException("Solve time must be greater than zero");
        }

        System.out.println("Valid solve time: " + solveTime);
    }

    public static void main(String[] args) {

        // try-catch-finally block - exception handling
        try {
            validateSolveTime(12);
            validateSolveTime(-5);
        } catch (InvalidSolveTimeException exception) {
            // catch block - handling specific exception
            System.out.println(exception.getMessage());
        } finally {
            // finally block - always executes
            System.out.println("Validation completed");
        }
    }
}
