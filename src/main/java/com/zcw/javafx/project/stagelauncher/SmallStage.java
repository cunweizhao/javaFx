package com.zcw.javafx.project.stagelauncher;

import com.zcw.javafx.project.controller.SmallController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @ClassName : SmallStage
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-30 12:03
 */
public class SmallStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/statics/stages/small.fxml"));
        Parent root = fxmlLoader.load();

        SmallController controller = fxmlLoader.getController();
        controller.init(primaryStage, controller);

        StageUtil.diyStage(primaryStage, root, true, controller.rootPane.getPrefWidth(), controller.rootPane.getPrefHeight());

        // 窗口置于任务栏上方右下角
        primaryStage.setX(StageUtil.maximumWindowBounds.getWidth() - controller.rootPane.getPrefWidth() / 2 - controller.lyric.getPrefWidth());
        primaryStage.setY(StageUtil.maximumWindowBounds.getHeight() - controller.rootPane.getPrefHeight() / 2 - 35);
        primaryStage.show();
    }
}
