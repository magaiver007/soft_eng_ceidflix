package com.example.ceidflix.controllers;

//import com.example.ceidflix.interfaces.DataReceiver;
import com.example.ceidflix.models.User;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.example.ceidflix.functions.SceneUtil;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class successfulsignupController {

    public successfulsignupController() {
    }

    private ArrayList<Object> data;
    @FXML
    private Label userNameLabel;
    @FXML
    private Button toProfile;

    @FXML
    public void initialize() {

        toProfile.setOnMouseClicked(this::onSuccessfulLoginButtonClick);

        Platform.runLater(() -> {
            // Retrieve the data from the stage's user data
            User user = (User) SceneUtil.readData();

            // Process the received data
            if (user != null && !user.getUsername().equals("")) {
                userNameLabel.setText(user.getUsername());
            } else {
                userNameLabel.setText("No data received");
            }
        });
    }

    @FXML
    protected void onSuccessfulLoginButtonClick(MouseEvent event){

        SceneUtil.changeScene("signUp.fxml", event);

    }
}

