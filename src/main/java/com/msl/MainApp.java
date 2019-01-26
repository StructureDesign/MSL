package com.msl;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class MainApp extends Application{

    private Stage stage;

    @Override
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
