package com.superman.mvp.view;


import com.superman.mvp.bean.Picture;

import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/19 10:08.
 * 文件 MvpTest
 * 描述
 */

public interface PictureView {
    void showProgressBar();

    void hideProgressBar();

    void showMsg(String msg);

    void showPictures(List<Picture> pictures);
}
