package com.msl.ui.controller;

import com.msl.StageSingleton;
import com.msl.entity.user.Permission;
import com.msl.entity.user.User;
import com.msl.ui.Alert;
import com.msl.ui.PermissionCheckTable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PermissionManageController implements Initializable {
    @FXML
    Label nameLabel, idLabel, identifyLabel;
    @FXML
    TableView<PermissionCheckTable> tableTableView;
    @FXML
    TableColumn<PermissionCheckTable,String> permissionColumn;
    @FXML
    TableColumn<PermissionCheckTable, CheckBox> checkColumn;
    @FXML
    TextField nameField;
    @FXML
    Label userNameLabel, userIdentifyLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.nameLabel.setText(StageSingleton.userName);
        this.identifyLabel.setText(StageSingleton.userIdentify);
        this.idLabel.setText(StageSingleton.userId);

        showTableView();
    }

    public void showTableView(){
        permissionColumn.setCellValueFactory(new PropertyValueFactory<>("Permission"));
        checkColumn.setCellValueFactory(new PropertyValueFactory<>("Check"));
    }
    @FXML
    public void searchUser(){
        if (nameField.getText() == null || nameField.getText().trim().equals(""))
            return;
        User user = new User(nameField.getText().trim(), "000", "...");
        userNameLabel.setText(user.getUsername());
        userIdentifyLabel.setText(user.getIdentify());
        ObservableList<PermissionCheckTable> data = tableTableView.getItems();
        Permission p = new Permission();
        List<String> permissions = p.permissionList();
        List<Boolean> userPermissions = user.permissionList();
        data.clear();
        for (int i=0;i<permissions.size();i++){
            data.add(new PermissionCheckTable(permissions.get(i),userPermissions.get(i)));
        }
    }
    
    @FXML
    public void modifyPermission(){
        Alert.info("Modify Permissions Successfully");
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
