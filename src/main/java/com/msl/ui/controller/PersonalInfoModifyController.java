package com.msl.ui.controller;

import com.msl.StageSingleton;
import com.msl.ui.Alert;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonalInfoModifyController implements Initializable {
    @FXML
    Label nameLabel, idLabel, identifyLabel;

    @FXML
    public void modifyInfo(){
      Alert.info("Modify Info Successfully");
    }

    @FXML
    public void modifyPassword(){
        Alert.info("Modify Password Successfully");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.nameLabel.setText(StageSingleton.userName);
        this.identifyLabel.setText(StageSingleton.userIdentify);
        this.idLabel.setText(StageSingleton.userId);
    }

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
}
