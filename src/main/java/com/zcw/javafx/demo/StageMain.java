package com.zcw.javafx.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @ClassName : StageMain
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-29 16:33
 */
public class StageMain  extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFx");
        //设置图标
        //primaryStage.getIcons().add(new Image("icon/bg1.jpg"));
        //固定大小
//        primaryStage.setResizable(false);

        //背景图自适应拖拽
        primaryStage.setScene(new Scene(new Group()));
        primaryStage.show();
    }
}
