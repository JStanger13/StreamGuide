package com.nyc.justinstanger.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import static com.nyc.justinstanger.myapplication.MainActivity.TAG;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

    private List<Result> mShowsList;

    public RecyclerViewAdapter(List<Result> showsList) {
        mShowsList = showsList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_show, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(parentView);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        Picasso.with(holder.mImageView.getContext()).load(mShowsList.get(position).getArtwork304x171()).into(holder.mImageView);
        //Picasso.with(holder..getContext()).load(mShowsList.get(position).getArtwork304x171()).into(holder.mImageView);


        mShowsList.get(position).getId();
        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), "Clicked it, bruh!", Toast.LENGTH_SHORT).show();

                Intent detailIntent = new Intent(v.getContext(), DetailActivity.class);

                ShowIDHolder.setmShowID(mShowsList.get(position).getId());
                //Log.d(TAG, "SHOW ID IS: " + mShowsList.get(position).getId());
                ShowIDHolder.setmImageURL(mShowsList.get(position).getArtwork608x342());

                //ShowIDHolder.setmLink(mShowsList.get(position).getTvrage().getLink());

                v.getContext().startActivity(detailIntent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return mShowsList.size();
    }

    public void swapList(List<Result> swapList){
        mShowsList = swapList;
        notifyDataSetChanged();
    }
}

