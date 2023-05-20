package com.example.ceidflix.functions;
//import com.example.ceidflix.interfaces.DataReceiver;
import com.example.ceidflix.ceidFlix;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SceneUtil {

    public static void changeScene(String fxmlFileName, Button button) {
        changeScene(fxmlFileName, button, null);
    }

    public static void changeScene(String fxmlFileName, Button button,  ArrayList<Object> data){
        try {
            // Load the FXML file for the new scene
            FXMLLoader fxmlLoader = new FXMLLoader(ceidFlix.class.getResource(fxmlFileName));
            Parent root = fxmlLoader.load();

            // Create a new scene with the loaded FXML content
            Scene scene = new Scene(root);

//            if (data != null) {
//                // If data is provided, pass it to the controller
//                Object controller = fxmlLoader.getController();
//                if (controller instanceof DataReceiver) {
//                    ((DataReceiver) controller).setData(data);
//                }
//            }

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
