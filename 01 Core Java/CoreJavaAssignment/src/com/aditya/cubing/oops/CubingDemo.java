package com.aditya.cubing.oops;

public class CubingDemo {

    public static void main(String[] args) {

        // Polymorphism - reference of parent type, object of child type
        Cube cube = new ThreeByThreeCube(15);

        // Method calls resolved at runtime (dynamic binding)
        cube.displaySize();
        cube.solve();

        // Type casting - converting reference type
        Timer timer = (Timer) cube;
        timer.startTimer();
        timer.stopTimer();
    }
}
