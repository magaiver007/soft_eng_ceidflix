package com.example.ceidflix.functions;
import java.util.Scanner;

public class ValidateCredentials {

    public static <T> void validateCredentials(T username, T password) {
        // Assuming a predefined correct username and password
        T correctUsername = (T) "admin";
        T correctPassword = (T) "password";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
}


