package com.aditya.cubing.stringsarrays;

public class CubeNotes {

    // Static method with String parameter
    public static void analyzeNotes(String note) {

        // String concatenation using concat() method
        String updatedNote = note.concat(" - Practice Daily");

        System.out.println("Original note: " + note);
        System.out.println("Updated note: " + updatedNote);

        // String methods - length() and toUpperCase()
        System.out.println("Note length: " + note.length());
        System.out.println("Upper case: " + note.toUpperCase());
    }

    // Static method with array parameter
    public static void displaySolveTimes(int[] solveTimes) {

        try {
            // Enhanced for loop - iterating through array
            for (int time : solveTimes) {
                System.out.println("Solve time: " + time);
            }

            // Array access - accessing element at index
            System.out.println(solveTimes[solveTimes.length]); // Intentionally causes exception

        } catch (ArrayIndexOutOfBoundsException exception) {
            // Catching array index out of bounds exception
            System.out.println("Invalid array index accessed");
        }
    }
}
