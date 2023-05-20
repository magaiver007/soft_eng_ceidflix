package com.example.ceidflix.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import com.example.ceidflix.functions.SceneUtil;

public class successfulsignupController {
    @FXML
    private Button toProfile;

    @FXML
    protected void onSuccessfulLoginButtonClick(){
        SceneUtil.changeScene("signUp.fxml", toProfile);
    }
}
