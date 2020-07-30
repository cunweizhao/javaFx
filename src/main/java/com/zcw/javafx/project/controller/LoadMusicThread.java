package com.zcw.javafx.project.controller;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName : LoadMusicThread
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-30 11:49
 */
public class LoadMusicThread extends Thread {
    /**
     * 受 api 影响，一秒最多三次切歌，此处设置一秒一次
     */
    static boolean isFinished = true;

    public static String type;

    public static String indexType;

    LoadMusicThread(String type, String indexType) {
        LoadMusicThread.type = type;
        LoadMusicThread.indexType = indexType;
    }

    /**
     * 异步初始化歌曲信息
     */
    @Override
    public void run() {
        if (isFinished) {
            if (type != null) {
                isFinished = false;
                // 当前正在播放本地音乐
                if ("local".equals(type)) {
                    try {
                        MainController.controller.nextLocal(indexType);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                } else if ("netEase".equals(type)) {
                    MainController.controller.nextNetEase(indexType);
                }
                try {
                    Thread.sleep(3000);
                    isFinished = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MusicUtil.media = null;
                System.gc();
            }
        } else {
            NoticeController.show("请等待三秒的切歌冷却时间！");
        }
    }
}
