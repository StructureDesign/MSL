package com.msl.ui.controller;

import com.msl.StageSingleton;
import com.msl.onlineReader.AbstractOnlineReader;
import com.msl.onlineReader.OnlineReaderFactory;
import com.msl.ui.Alert;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class OnlineReaderController implements Initializable {

    @FXML
    public void logout(){
        StageSingleton.toLoginView();
    }

    @FXML
    public void toOnlineReader(){
        StageSingleton.toOnlineReaderView();
    }

    @FXML
    public void toBookManage(){
        StageSingleton.toBookManageView();
    }
    @FXML
    public void toPermissionManage(){
        StageSingleton.toPermissionManageView();
    }

    @FXML
    public void toPersonalInfoModify(){
        StageSingleton.toPersonalInfoModifyView();
    }

    @FXML
    public void toUSerManage(){
        StageSingleton.toUserManageView();
    }

    @FXML
    public void toSettingBorrowStrategy(){
        StageSingleton.toSettingBorrowStrategyView();
    }

    @FXML
    Label nameLabel, idLabel, identifyLabel;
    @FXML
    TextField textField;
    @FXML
    Label readerShow;

    @FXML
    public void read(){
        if (textField.getText() == null || textField.getText().trim().equals(""))
            return;
        String filename = textField.getText().trim();
        AbstractOnlineReader onlineReader = OnlineReaderFactory.getOnlinReader(filename);
        if (onlineReader == null){
            Alert.warning("No suitable reader");
        }else{
            this.readerShow.setText(onlineReader.toString()+" reader");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.nameLabel.setText(StageSingleton.userName);
        this.identifyLabel.setText(StageSingleton.userIdentify);
        this.idLabel.setText(StageSingleton.userId);
    }
}
