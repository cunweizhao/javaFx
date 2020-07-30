package com.zcw.javafx.project.stagelauncher;

import com.zcw.javafx.project.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @ClassName : MainStage
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-30 12:00
 */
public class MainStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/statics/stages/main.fxml"));
        Parent root = fxmlLoader.load();

        MainController controller = fxmlLoader.getController();
        controller.init(primaryStage, controller);

        StageUtil.diyStage(primaryStage, root, false, controller.rootPane.getPrefWidth(), controller.rootPane.getPrefHeight());
        primaryStage.show();
    }
}
