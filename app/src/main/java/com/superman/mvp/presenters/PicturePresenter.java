package com.superman.mvp.presenters;

import com.superman.mvp.bean.Picture;

import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/19 10:54.
 * 文件 MvpTest
 * 描述 业务逻辑操作类，要处理获得到的picture列表
 */

public interface PicturePresenter {
    void onResume();
    void onDestroy();
    void onItemClick(int pos);
}
