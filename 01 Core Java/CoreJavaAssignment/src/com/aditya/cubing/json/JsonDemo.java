package com.aditya.cubing.json;

import java.sql.SQLOutput;

public class JsonDemo {

    public static void main(String[] args) {

        // String concatenation - building JSON string
        String json =
                "{"
                        + "\"solver\":\"Aditya\","
                        + "\"cube\":\"3x3\","
                        + "\"bestTime\":12"
                        + "}";

        System.out.println(json);

        // String method - contains() for checking substring
        if (json.contains("solver")) {
            System.out.println("Solver key exists");
        } else {
            System.out.println("The key doesn't exist");
        }
    }
}
