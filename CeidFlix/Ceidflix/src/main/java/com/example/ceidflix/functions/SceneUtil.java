package com.example.ceidflix.functions;

import com.example.ceidflix.ceidFlix;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneUtil {

    public static void changeScene(String fxmlFileName, Button button) {
        try {
            // Load the FXML file for the new scene
            FXMLLoader fxmlLoader = new FXMLLoader(ceidFlix.class.getResource(fxmlFileName));
            Parent root = fxmlLoader.load();

            // Create a new scene with the loaded FXML content
            Scene scene = new Scene(root);

            // Get the current stage (window)
            Stage stage = (Stage) button.getScene().getWindow();

            // Set the new scene as the active scene on the stage
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle any exceptions that occur during scene loading
        }
    }

    public static <T> void changeScene(String fxmlFileName, Button button,  T controller){
        try {
            // Load the FXML file for the new scene
            FXMLLoader fxmlLoader = new FXMLLoader(ceidFlix.class.getResource(fxmlFileName));
            Parent root = fxmlLoader.load();

            controller = fxmlLoader.getController();

            // Create a new scene with the loaded FXML content
            Scene scene = new Scene(root);

            // Get the current stage (window)
            Stage stage = (Stage) button.getScene().getWindow();

            // Set the new scene as the active scene on the stage
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle any exceptions that occur during scene loading
        }
    }
}
