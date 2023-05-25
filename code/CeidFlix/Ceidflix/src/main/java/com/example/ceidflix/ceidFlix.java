package com.example.ceidflix;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ceidFlix extends Application {

    //TODO  make a base logic for the startup screen
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ceidFlix.class.getResource("logInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("CeidFlix");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}

