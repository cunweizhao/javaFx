package com.zcw.javafx.project.stagelauncher;

import com.zcw.javafx.project.controller.LyricController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @ClassName : LyricStage
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-30 12:00
 */
public class LyricStage  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/statics/stages/lyric.fxml"));
        Parent root = fxmlLoader.load();

        LyricController controller = fxmlLoader.getController();
        controller.init(primaryStage, controller);

        StageUtil.diyStage(primaryStage, root, true, controller.rootPane.getPrefWidth(), controller.rootPane.getPrefHeight());

        primaryStage.setY(5);
        primaryStage.show();
    }
}
