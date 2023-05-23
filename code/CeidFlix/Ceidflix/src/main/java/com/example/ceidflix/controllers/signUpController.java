package com.example.ceidflix.controllers;

import com.example.ceidflix.functions.SceneUtil;
//import com.example.ceidflix.interfaces.DataReceiver;
import com.example.ceidflix.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;


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

//        User user = new User(signUpName.getText(), signUpUsername.getText(), signUpEmail.getText());
//        ArrayList<Object> data = new ArrayList<Object>();
//        data.add(user);

       //TODO: Do the necessary checks and validations for the user input
       //TODO: If validation is correct, add the user data to the database

        SceneUtil.changeScene("successfulSignUp.fxml", signUpButton, null);

    }

}

