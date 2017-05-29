package com.nyc.justinstanger.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by justinstanger on 5/19/17.
 */

public class ChannelRecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    public ChannelRecyclerViewHolder(View itemView) {
        super(itemView);
        mImageView = (ImageView) itemView.findViewById(R.id.show_image);

    }
}
