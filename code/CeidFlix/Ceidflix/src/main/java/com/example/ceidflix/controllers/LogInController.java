package com.example.ceidflix.controllers;

import com.example.ceidflix.functions.SceneUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LogInController {

    @FXML
    private TextField userNameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button logInButton;
    @FXML
    private Hyperlink signUpHyper;
    @FXML
    private Hyperlink needHelpHyper;

    @FXML
    public void initialize() {
        logInButton.setOnMouseClicked(this::onSuccessfulLoginButtonClick);
    }

    private void onSuccessfulLoginButtonClick(MouseEvent event) {

        SceneUtil.changeScene("new.fxml", event);

    }
}
