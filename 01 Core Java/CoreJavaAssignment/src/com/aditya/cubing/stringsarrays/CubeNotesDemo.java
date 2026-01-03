package com.aditya.cubing.stringsarrays;

public class CubeNotesDemo {

    public static void main(String[] args) {
        // String initialization
        String note = "Focus on look ahead";

        // Array initialization with values
        int[] solves = {14, 12, 11};

        // Calling static methods
        CubeNotes.analyzeNotes(note);
        CubeNotes.displaySolveTimes(solves);
    }
}
