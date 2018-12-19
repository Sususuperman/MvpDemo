package com.superman.mvp.model;

import com.superman.mvp.bean.Picture;

import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/19 13:43.
 * 文件 MvpTest
 * 描述
 */

public interface LoadListener {
    void onFinish(List<Picture>list);
}
