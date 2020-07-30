package com.zcw.javafx.project.entities;

import java.util.ArrayList;
import java.util.Map;

/**
 * @ClassName : Music
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-07-30 11:58
 */
public class Music {
    /**
     * 歌名
     */
    private String name;

    /**
     * 歌手
     */
    private String author;

    /**
     * 图片路径
     */
    private String picUrl;

    /**
     * 歌词与时间轴
     */
    private ArrayList<Map<String, String>> lyric;

    public Music(String name, String author, String picUrl, ArrayList<Map<String, String>> lyric) {
        this.name = name;
        this.author = author;
        this.picUrl = picUrl;
        this.lyric = lyric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public ArrayList<Map<String, String>> getLyric() {
        return lyric;
    }

    public void setLyric(ArrayList<Map<String, String>> lyric) {
        this.lyric = lyric;
    }
}
