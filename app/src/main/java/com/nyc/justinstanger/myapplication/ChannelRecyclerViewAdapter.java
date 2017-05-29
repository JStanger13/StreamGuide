package com.nyc.justinstanger.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by justinstanger on 5/19/17.
 */

public class ChannelRecyclerViewAdapter extends RecyclerView.Adapter<ChannelRecyclerViewHolder> {

    private List<ChannelResult> mChannelList;

    public ChannelRecyclerViewAdapter(ArrayList<ChannelResult> channelList) {
        mChannelList = channelList;
    }

    @Override
    public ChannelRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_show,
                parent, false);
        ChannelRecyclerViewHolder viewHolder = new ChannelRecyclerViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ChannelRecyclerViewHolder holder, final int position) {
        Picasso.with(holder.mImageView.getContext()).load(mChannelList.get(position)
                .getArtwork448x252()).into(holder.mImageView);
        mChannelList.get(position).getId();


        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(v.getContext(), "Clicked it, bruh!", Toast.LENGTH_SHORT).show();

                Intent channelDetailIntent = new Intent(v.getContext(), ChannelDetailActivity.class);

                ChannelIDHolder.setmChannelID(mChannelList.get(position).getId());
                //Log.d(TAG, "SHOW ID IS: " + mShowsList.get(position).getId());
                ChannelIDHolder.setmChannelImageURL(mChannelList.get(position).getArtwork608x342());
                //ShowIDHolder.setmLink(mShowsList.get(position).getTvrage().getLink());
                ChannelIDHolder.setmChannelTitle(mChannelList.get(position).getName());


                v.getContext().startActivity(channelDetailIntent);


            }
        });
    }




    @Override
    public int getItemCount() {
        return mChannelList.size();
    }

    public void swapList(List<ChannelResult> swapList){
        mChannelList = swapList;
        notifyDataSetChanged();
    }
}


