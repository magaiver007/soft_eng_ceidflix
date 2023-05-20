package com.example.ceidflix.controllers;

import com.example.ceidflix.functions.SceneUtil;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class signUpController {

    @FXML
    private TextField signUpUsername;
    @FXML
    private TextField signUpName;
    @FXML
    private Label signUpText;
    @FXML
    private DatePicker signUpDOB;
    @FXML
    private TextField signUpEmail;
    @FXML
    private PasswordField signUpPass;
    @FXML
    private PasswordField signUpRepeatPass;

    @FXML
    private Button signUpButton;

    @FXML
    protected void onCreateAccountButtonClicked() {
       //TODO: Do the necessary checks and validations for the user input
       //TODO: If validation is correct, add the user data to the database

        SceneUtil.changeScene("successfulSignUp.fxml", signUpButton);

    }

}

