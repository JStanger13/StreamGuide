package com.nyc.justinstanger.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;


public class ChannelDetailRecyclerViewHolder extends RecyclerView.ViewHolder{

    ImageView mChannelLogo;
    RecyclerView mChannelShowsRecyclerView;

    public ChannelDetailRecyclerViewHolder(View itemView) {
        super(itemView);

        mChannelLogo = (ImageView) itemView.findViewById(R.id.channel_detail_image);
        mChannelShowsRecyclerView = (RecyclerView) itemView.findViewById(R.id.channel_show_recyclerview);
    }
}
