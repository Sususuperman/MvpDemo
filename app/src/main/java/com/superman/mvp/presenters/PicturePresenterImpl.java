package com.superman.mvp.presenters;

import com.superman.mvp.bean.Picture;
import com.superman.mvp.model.LoadListener;
import com.superman.mvp.model.PictureInteractor;
import com.superman.mvp.model.PictureInteractorImpl;
import com.superman.mvp.view.PictureView;

import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/19 11:15.
 * 文件 MvpTest
 * 描述
 */

public class PicturePresenterImpl implements PicturePresenter{
    private PictureView pictureView;
    private PictureInteractor interactor;
        public PicturePresenterImpl(PictureView pictureView){
            this.pictureView = pictureView;
            interactor = new PictureInteractorImpl();
        }

    @Override
    public void onResume() {
        pictureView.showProgressBar();
        interactor.loadPictures(new LoadListener() {
            @Override
            public void onFinish(List<Picture> list) {
                pictureView.hideProgressBar();
                pictureView.showPictures(list);
            }
        });
    }

    @Override
    public void onDestroy() {
        pictureView =null;
    }

    @Override
    public void onItemClick(int pos) {
    pictureView.showMsg("点击了"+pos);
    }

}
