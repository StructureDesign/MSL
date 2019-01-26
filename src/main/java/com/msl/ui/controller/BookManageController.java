package com.msl.ui.controller;

import com.msl.StageSingleton;
import com.msl.entity.book.Book;
import com.msl.ui.Alert;
import com.sun.org.apache.bcel.internal.generic.ALOAD;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

import java.net.URL;
import java.util.ResourceBundle;

public class BookManageController implements Initializable {

    @FXML
    Label nameLabel, idLabel, identifyLabel;
    @FXML
    ComboBox<String> comboBox;
    @FXML
    ScrollPane modifyPane, createPane;

    @FXML
    public void comBoBoxAction(){
        System.out.println("get");
        System.out.println(comboBox.getValue());
        if (comboBox.getValue().toLowerCase().equals("create")){
            if (!StageSingleton.nowUser.isAbleToCreateBook()){
                Alert.warning("No permission to create book");
                return;
            }
            this.createPane.setVisible(true);
            this.modifyPane.setVisible(false);
        }else if (comboBox.getValue().toLowerCase().equals("modify")){
            if (!StageSingleton.nowUser.isAbleToEditBookInfo()){
                Alert.warning("No permission to edit book info");
                return;
            }
            this.createPane.setVisible(false);
            this.modifyPane.setVisible(true);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.nameLabel.setText(StageSingleton.userName);
        this.identifyLabel.setText(StageSingleton.userIdentify);
        this.idLabel.setText(StageSingleton.userId);

        if (!StageSingleton.nowUser.isAbleToCreateBook()){
            this.createPane.setVisible(false);
        }
        if (!StageSingleton.nowUser.isAbleToEditBookInfo()){
            this.modifyPane.setVisible(false);
        }
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
