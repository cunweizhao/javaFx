package com.zcw.javafx.demo;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @ClassName : FxMain
 * @Description : hello world
 * @Author : Zhaocunwei
 * @Date: 2020-07-29 15:56
 */
public class FxMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("hello world");

        primaryStage.setTitle("这是第一个javafx程序");
        primaryStage.show();
    }
}
