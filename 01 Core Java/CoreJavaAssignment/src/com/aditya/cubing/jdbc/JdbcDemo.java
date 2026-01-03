package com.aditya.cubing.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) {

        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/cubing";
        String user = "root";
        String password = "password";

        try {
            // Establishing database connection using DriverManager
            Connection connection = DriverManager.getConnection(url, user, password);
            // Creating Statement object for SQL queries
            Statement statement = connection.createStatement();

            System.out.println("Database connected");

            // Closing resources
            statement.close();
            connection.close();

        } catch (Exception exception) {
            // Exception handling for database operations
            System.out.println("Database connection failed");
        }
    }
}
