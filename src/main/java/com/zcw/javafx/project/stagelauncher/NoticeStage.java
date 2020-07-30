package com.zcw.javafx.project.stagelauncher;

import com.zcw.javafx.project.controller.NoticeController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * @ClassName : NoticeStage
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-30 12:01
 */
public class NoticeStage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/statics/stages/notice.fxml"));
        Parent root = fxmlLoader.load();

        NoticeController controller = fxmlLoader.getController();
        controller.init(primaryStage, controller);

        StageUtil.diyStage(primaryStage, root, true, controller.rootPane.getPrefWidth(), controller.rootPane.getPrefHeight());

        // 窗口置于任务栏上方左下角
        primaryStage.setX(-(controller.rootPane.getPrefWidth() - controller.noticePane.getPrefWidth()) / 2);
        primaryStage.setY(StageUtil.maximumWindowBounds.getHeight() - controller.rootPane.getPrefHeight() / 2 - 35);
        primaryStage.show();
    }
}
