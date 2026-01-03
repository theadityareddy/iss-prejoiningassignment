package com.aditya.cubing.collections;

import java.util.Comparator;

// Implementing Comparator interface for custom sorting
public class NameComparator implements Comparator<CubingResult> {

    // Overriding compare() method to define custom comparison logic
    @Override
    public int compare(CubingResult first, CubingResult second) {
        return first.getSolverName().compareTo(second.getSolverName()); // Compare by name
    }
}
