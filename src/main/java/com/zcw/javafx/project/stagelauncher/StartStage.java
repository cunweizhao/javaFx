package com.zcw.javafx.project.stagelauncher;

import com.zcw.javafx.project.controller.StartController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @ClassName : StartStage
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-30 12:03
 */
public class StartStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/statics/stages/start.fxml"));
        Parent root = fxmlLoader.load();

        StartController controller = fxmlLoader.getController();
        controller.init(primaryStage);

        StageUtil.diyStage(primaryStage, root, true, controller.rootPane.getPrefWidth(), controller.rootPane.getPrefHeight());
        primaryStage.show();
    }
}
