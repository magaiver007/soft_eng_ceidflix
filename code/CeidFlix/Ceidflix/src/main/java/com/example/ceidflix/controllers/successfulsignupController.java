package com.example.ceidflix.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import com.example.ceidflix.functions.SceneUtil;

public class successfulsignupController {
    @FXML
    private Button toProfile;



//    @Override
//    public void setData(ArrayList<Object> data) {
//        this.data = data;
//    }
//
//    public ArrayList<Object> getData() {
//        return data;
//    }
//
//    public void initialize(){
//        userName.setText((String) getData().get(0));
//    }

    @FXML
    protected void onSuccessfulLoginButtonClick(){
        SceneUtil.changeScene("signUp.fxml", toProfile, null);
    }
}

