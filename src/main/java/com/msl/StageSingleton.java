package com.msl;

import com.msl.entity.user.Admin;
import com.msl.entity.user.Permission;
import com.msl.entity.user.User;
import com.msl.ui.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.jws.soap.SOAPBinding;
import java.io.InputStream;

public class StageSingleton {
    private static Stage stage;
    public static String userName = "", userId = "", userIdentify = "";

    public static User nowUser = new User(userName,"000","...");
    public static User adminUser = new Admin("Admin", "000","...");
    public static User commonUser = new User(userName,"000","...");
    static {
        commonUser.setPermission(new Permission());
    }

    public static synchronized Stage getStage() {
        return stage;
    }

    public static synchronized void setStage(Stage s) {
        stage = s;
    }

    public static void toLoginView(){
        try {
            LoginController controller = (LoginController) StageSingleton.replaceSceneContent("/fxml/LoginView.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void toOnlineReaderView(){
        try {
            OnlineReaderController controller = (OnlineReaderController) StageSingleton.replaceSceneContent("/fxml/OnlineReadingView.fxml");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void toBookManageView() {
        try {
            BookManageController controller = (BookManageController) StageSingleton.replaceSceneContent("/fxml/BookManageView.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void toPersonalInfoModifyView() {
        try {
            PersonalInfoModifyController controller = (PersonalInfoModifyController) StageSingleton.replaceSceneContent("/fxml/PersonalInfoModifyView.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void toSettingBorrowStrategyView(){
        try {
            SettingBorrowStrategyController controller = (SettingBorrowStrategyController) StageSingleton.replaceSceneContent("/fxml/SettingBorrowStrategyView.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void toUserManageView(){
        try {
            UserManageController controller = (UserManageController) StageSingleton.replaceSceneContent("/fxml/UserManageView.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void toPermissionManageView(){
        try {
            PermissionManageController controller = (PermissionManageController) StageSingleton.replaceSceneContent("/fxml/PermissionManageView.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        // InputStream in =
        // Thread.currentThread().getContextClassLoader().getResourceAsStream(fxml);
        InputStream in = MainApp.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(MainApp.class.getResource(fxml));
        Pane page;
        try {
            page = (Pane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page, 900, 560);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setResizable(false);
        return (Initializable) loader.getController();
    }

}
