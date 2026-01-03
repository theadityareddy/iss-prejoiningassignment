package com.aditya.cubing.exceptions;

// Custom exception class - extends Exception
public class InvalidSolveTimeException extends Exception {

    // Constructor calling parent class constructor
    public InvalidSolveTimeException(String message) {
        super(message); // super keyword to call parent constructor
    }
}
