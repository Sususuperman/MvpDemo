package com.superman.mvp.bean;

/**
 * 作者 Superman
 * 日期 2018/12/19 10:12.
 * 文件 MvpTest
 * 描述
 */

public class Picture {
    private String name;
    private int imgSrc;
    public Picture(String name,int imgSrc){
        this.name = name;
        this.imgSrc = imgSrc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }
}
