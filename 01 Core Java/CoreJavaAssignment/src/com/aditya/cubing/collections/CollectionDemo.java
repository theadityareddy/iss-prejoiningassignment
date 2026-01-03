package com.aditya.cubing.collections;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        // List interface - ordered collection with duplicates
        List<CubingResult> resultsList = new ArrayList<>();
        resultsList.add(new CubingResult("Aditya", 13));
        resultsList.add(new CubingResult("Mitali", 11));
        resultsList.add(new CubingResult("Jay", 14));

        // Collections.sort() using Comparable interface
        Collections.sort(resultsList);
        System.out.println("Sorted by solve time:");
        System.out.println(resultsList);

        // Collections.sort() using Comparator interface
        Collections.sort(resultsList, new NameComparator());
        System.out.println("Sorted by name:");
        System.out.println(resultsList);

        // Set interface - no duplicates, unordered
        Set<CubingResult> resultsSet = new HashSet<>(resultsList);
        System.out.println("Set size (duplicates removed): " + resultsSet.size());

        // Map interface - key-value pairs
        Map<String, Integer> bestTimes = new HashMap<>();
        bestTimes.put("3x3", 12); // Adding key-value pair
        bestTimes.put("2x2", 6);

        // Retrieving value using key
        System.out.println("Best 3x3 time: " + bestTimes.get("3x3"));
    }
}
