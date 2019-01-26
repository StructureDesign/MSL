package com.msl;

import com.msl.ui.OnlineReaderController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class MainApp extends Application{

    private Stage stage;

    public void start(Stage primaryStage) {
        StageSingleton.setStage(primaryStage);
        stage = StageSingleton.getStage();
        // stage = primaryStage;
        stage.setTitle("Management System of Library");
        stage.setHeight(560);
        stage.setWidth(900);
        StageSingleton.toLoginView();
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
