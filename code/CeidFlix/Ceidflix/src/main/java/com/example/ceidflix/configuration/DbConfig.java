package com.example.ceidflix.configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConfig {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "username", "password")) {

            try (Statement statement = connection.createStatement()) {
                // Create a table
                String createTableQuery = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age INT)";
                statement.executeUpdate(createTableQuery);

                // Insert data into the table
                String insertDataQuery = "INSERT INTO users (name, age) VALUES ('John Doe', 25)";
                int rowsAffected = statement.executeUpdate(insertDataQuery);

                // Check the result
                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

