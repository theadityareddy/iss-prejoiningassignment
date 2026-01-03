package com.aditya.cubing.basics;

public class CubeDemo {

    // Main method - entry point of Java program
    public static void main(String[] args) {
        // Object creation using new keyword
        Cube cube = new Cube(3, "White");

        // Method calls on object
        cube.displayState();
        cube.scramble();
        cube.solve();
        cube.displayState();
    }
}
