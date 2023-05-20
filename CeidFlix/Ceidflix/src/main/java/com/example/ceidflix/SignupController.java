package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;


public class SignupController {

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
    protected void start(Stage secondstage) throws IOException {
        Stage secondStage = new Stage();

        Button signUpButton(->)
        //onCreateAccountButtonClicked
        //TODO: Make all the necessary actions for account creation

        //TODO: Show the Welcome screen
        FXMLLoader fxmlLoader = new FXMLLoader(SignUp.class.getResource("successful_signup.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        secondstage.setTitle("Successful Sign Up");
        secondstage.setScene(scene);
        secondstage.show();
    }
    {
        signUpText.setText("You have successfully signed up!");

    }




}

