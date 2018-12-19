package com.superman.mvp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.superman.mvp.R;
import com.superman.mvp.bean.Picture;

import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/19 10:29.
 * 文件 MvpTest
 * 描述
 */

public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.PictureHolder> {
    private List<Picture> list;

    public PictureAdapter(List<Picture> list) {
        this.list = list;
    }

    @Override
    public PictureHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_picture, null);
        return new PictureHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureHolder holder, int position) {
        Picture picture = list.get(position);
        holder.ivPicture.setImageResource(picture.getImgSrc());
        holder.tvName.setText(picture.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PictureHolder extends RecyclerView.ViewHolder {
        ImageView ivPicture;
        TextView tvName;

        public PictureHolder(View itemView) {
            super(itemView);
            ivPicture = (ImageView) itemView.findViewById(R.id.img_pic);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    if (mListener != null) {
//                        mListener.onItemClick(getAdapterPosition());
//                    }
                }
            });
        }
    }
}
