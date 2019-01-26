package com.msl.ui;

public class Alert {
    private static javafx.scene.control.Alert alert = null;

    public static void info(String info){
        alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle("INFO");
        alert.setHeaderText(null);
        alert.setContentText(info);
        alert.showAndWait();
    }

    public static void warning(String warning){
        alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.WARNING);
        alert.setTitle("WARNING");
        alert.setHeaderText(null);
        alert.setContentText(warning);
        alert.showAndWait();
    }

    public static void error(String error){
        alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText(error);
        alert.showAndWait();
    }
}
