package com.superman.mvp.model;


import android.os.Handler;

import com.superman.mvp.R;
import com.superman.mvp.bean.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/19 11:27.
 * 文件 MvpTest
 * 描述
 */

public class PictureInteractorImpl implements PictureInteractor{
   Handler handler = new Handler();
    @Override
    public void loadPictures(final LoadListener listener) {
       new Thread(new Runnable() {
           @Override

           public void run() {
                   final List<Picture>list = createPictures();
                   handler.postDelayed(new Runnable() {
                       @Override
                       public void run() {
                           listener.onFinish(list);
                       }
                   },2000);
           }
       }).start();
    }

    private final static int  pictureImages[] = {
            R.drawable.cohete_flat,
            R.drawable.london_flat,
            R.drawable.material_flat,
            R.drawable.moon_flat,
            R.drawable.mountain_flat,
            R.drawable.mountain_mo_flat,
            R.drawable.moutain_go_flat,
            R.drawable.pine_flat,
            R.drawable.towers_flat,
            R.drawable.vulcan_flat
    };

    private final static String[] pictureNames = {
            "Rocket in the universe",
            "A scene in London",
            "Moon over mountains",
            "A simple moon",
            "Sun and volcano",
            "A collection of mountains",
            "River between mountains",
            "Some pine trees",
            "On Small Town",
            "Volcanos reflection"
    };


    private List<Picture> createPictures() {
        ArrayList<Picture> pictures = new ArrayList<>();
        for (int i = 0; i < pictureNames.length; i++) {
            pictures.add(new Picture(pictureNames[i], pictureImages[i]));
        }
        return pictures;
    }

}
