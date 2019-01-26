package com.msl;

import com.msl.ui.OnlineReaderController;
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
        onlineReader();
        stage.show();
    }

    public void onlineReader(){
        try {
            OnlineReaderController controller = (OnlineReaderController) StageSingleton.replaceSceneContent("/fxml/OnlineReadingView.fxml");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
