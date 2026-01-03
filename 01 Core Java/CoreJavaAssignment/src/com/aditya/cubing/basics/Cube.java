package com.aditya.cubing.basics;

// Class definition - basic OOP concept
public class Cube {

    // Instance variables - encapsulation with private access modifier
    private int size;
    private String color;
    private boolean isSolved;

    // Constructor - object initialization
    public Cube(int size, String color) {
        this.size = size; // this keyword to reference instance variable
        this.color = color;
        this.isSolved = false;
    }

    // Instance method - behavior of the object
    public void scramble() {
        isSolved = false;
        System.out.println("Cube is scrambled");
    }

    // Instance method
    public void solve() {
        isSolved = true;
        System.out.println("Cube is solved");
    }

    // Instance method
    public void displayState() {
        System.out.println("Cube size: " + size);
        System.out.println("Cube color: " + color);
        System.out.println("Is cube solved: " + isSolved);
    }
}

