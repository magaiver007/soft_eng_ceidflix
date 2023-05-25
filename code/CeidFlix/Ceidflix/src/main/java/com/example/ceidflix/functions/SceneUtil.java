package com.example.ceidflix.functions;
//import com.example.ceidflix.interfaces.DataReceiver;
import com.example.ceidflix.ceidFlix;
<<<<<<< Updated upstream:code/CeidFlix/Ceidflix/src/main/java/com/example/ceidflix/functions/SceneUtil.java
import com.example.ceidflix.controllers.signUpController;
=======
import com.example.ceidflix.models.User;
>>>>>>> Stashed changes:CeidFlix/Ceidflix/src/main/java/com/example/ceidflix/functions/SceneUtil.java
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SceneUtil extends signUpController {

    public static void changeScene(String fxmlFileName, MouseEvent event) {
        changeScene(fxmlFileName, event, null);
    }

    public static void changeScene(String fxmlFileName, MouseEvent event, Object data) {
        try {
            // Step 1: Grab the node representing the button from the event object
            Node node = (Node) event.getSource();

            // Step 2: Get the instance of the stage from the node and close it
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();

            // Step 3: Load the scene through the FXMLLoader class
            FXMLLoader fxmlLoader = new FXMLLoader(ceidFlix.class.getResource(fxmlFileName));
            Parent root = fxmlLoader.load();

            // Step 4: Pass the information to the stage using the setUserData function
            if (data != null){
                stage.setUserData(data);
            }

            // Step 5: Create a new scene and pass it to the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);

            // Step 6: Make the stage visible again
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readData() {
        // Retrieve the current stage
        Stage stage = (Stage) Stage.getWindows().stream()
                .filter(Window::isShowing)
                .findFirst()
                .orElse(null);

        // Retrieve the data from the stage's user data
        if (stage != null) {
            Object data = stage.getUserData();
            // You can perform any additional processing or checks here if needed
            return data;
        }

        return null;
    }

}
