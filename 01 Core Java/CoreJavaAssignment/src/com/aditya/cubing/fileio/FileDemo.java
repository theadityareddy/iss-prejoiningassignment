package com.aditya.cubing.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

        // try-with-resources - automatic resource management
        try (FileWriter writer = new FileWriter("practice.txt")) {
            // Writing to file
            writer.write("Cubing practice log");
        } catch (IOException exception) {
            // Handling IOException
            System.out.println("File write error");
        }

        // try-with-resources for reading file
        try (FileReader reader = new FileReader("practice.txt")) {
            int data;
            // Reading file character by character
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); // Type casting int to char
            }
        } catch (IOException exception) {
            // Handling IOException
            System.out.println("File read error");
        }
    }
}
