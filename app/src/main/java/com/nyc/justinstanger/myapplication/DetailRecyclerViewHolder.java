package com.nyc.justinstanger.myapplication;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;



import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailRecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView mEpisodeTitle, mEpisodeContentType, mEpisodeSeason, mEpisodeDuration, mEpisodeNumber;
    ImageView mEpisodeImage;
    ImageButton mDetailButton;

    //ImageButton mFavoriteButton;

    public DetailRecyclerViewHolder(View detailView) {
        super(detailView);
        // mRoot = itemView;
        mEpisodeTitle = (TextView) detailView.findViewById(R.id.episode_title);
        mEpisodeDuration = (TextView) detailView.findViewById(R.id.episode_duration);
        mEpisodeSeason = (TextView) detailView.findViewById(R.id.episode_season);
        mEpisodeImage = (ImageView) detailView.findViewById(R.id.episode_image);
        mEpisodeNumber = (TextView) detailView.findViewById(R.id.episode_number);
        mDetailButton = (ImageButton) detailView.findViewById(R.id.more_info);

        // mFavoriteButton = (ImageButton) detailView.findViewById(R.id.add_favorite);
    }
}
