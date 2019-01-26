package com.msl.ui.controller;

import com.msl.StageSingleton;
import com.msl.util.Identify;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    Button loginBtn;

    @FXML
    TextField idfield;
    @FXML
    PasswordField passwordField;

    @FXML
    public void login(){
        if (idfield.getText() == null || idfield.getText().trim().equals("")){
            return;
        }

        if (passwordField.getText() == null || passwordField.getText().trim().equals(""))
            return;

        StageSingleton.userId = "001";
        StageSingleton.userName = idfield.getText().trim();
        if (idfield.getText().trim().toLowerCase().equals("admin")) {
            StageSingleton.userIdentify = Identify.Admin.toString();
            StageSingleton.nowUser = StageSingleton.adminUser;
        }
        else{
            StageSingleton.userIdentify = Identify.Teacher.toString();
            StageSingleton.nowUser = StageSingleton.commonUser;
        }
        StageSingleton.toOnlineReaderView();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
