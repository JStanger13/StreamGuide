package com.nyc.justinstanger.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by justinstanger on 5/16/17.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    //public TextView mChannelName;
    ImageView mImageView;
    ImageButton mImageButton;
    //public RecyclerView mChannelRecyclerView;

    //public View mRoot;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        // mRoot = itemView;
        // mChannelName = (TextView) itemView.findViewById(R.id.channel_name);
        //mChannelRecyclerView = (RecyclerView) itemView.findViewById(R.id.channel_recyclerview);

        mImageView = (ImageView) itemView.findViewById(R.id.show_image);
    }
}



