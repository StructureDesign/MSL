package com.msl.ui;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class PermissionCheckTable {
    private final SimpleStringProperty Permission = new SimpleStringProperty("");
    private CheckBox Check = new CheckBox();

    public PermissionCheckTable(String permission, boolean check){
        setPermission(permission);
        setCheck(check);
    }

    public void setPermission(String p){
        Permission.set(p);
    }

    public String getPermission() {
        return Permission.get();
    }

    public void setCheck(boolean c){
        Check.setSelected(c);
    }

    public CheckBox getCheck() {
        return Check;
    }
}
