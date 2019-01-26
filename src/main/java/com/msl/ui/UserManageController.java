package com.msl.ui;

import com.msl.StageSingleton;
import com.msl.entity.user.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class UserManageController implements Initializable {
    @FXML
    Label nameLabel, idLabel, identifyLabel;
    @FXML
    Pane createPane, searchPane;
    @FXML
    ScrollPane recordPane, penaltyPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.nameLabel.setText(StageSingleton.userName);
        this.identifyLabel.setText(StageSingleton.userIdentify);
        this.idLabel.setText(StageSingleton.userId);

        User user = StageSingleton.nowUser;
        if (!user.isAbleToCreateUser()){
            this.createPane.setVisible(false);
        }
        if (!user.isAbleToSearchUser()){
            this.searchPane.setVisible(false);
        }
        if (!user.isAbleToGeneratePenaltyReport()){
            this.penaltyPane.setVisible(false);
        }
        if (!user.isAbleToGenerateBorrowReport()){
            this.recordPane.setVisible(false);
        }
    }

    @FXML
    public void createUser(){
        Alert.info("Create user successfully");
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
