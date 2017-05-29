package com.nyc.justinstanger.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by justinstanger on 5/18/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by justinstanger on 5/18/17.
 */

public class DetailRecyclerViewAdapter extends RecyclerView.Adapter<DetailRecyclerViewHolder>{

    private List<EpisodeResult> mEpisodesList;


    public DetailRecyclerViewAdapter(List<EpisodeResult> mEpisodesList) {
        this.mEpisodesList = mEpisodesList;
    }

    @Override
    public DetailRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_episode, parent, false);
        DetailRecyclerViewHolder detailViewHolder = new DetailRecyclerViewHolder(parentView);
        return detailViewHolder;
    }

    @Override
    public void onBindViewHolder(final DetailRecyclerViewHolder holder, final int position) {
        Picasso.with(holder.mEpisodeImage.getContext()).load(mEpisodesList.get(position).getThumbnail400x225()).into(holder.mEpisodeImage);
        mEpisodesList.get(position).getId();

        holder.mEpisodeTitle.setText(mEpisodesList.get(position).getTitle());


        if (mEpisodesList.get(position).getSpecial() == 0) {


            holder.mEpisodeSeason.setText("S: " + Integer.toString(mEpisodesList.get(position).getSeasonNumber()) + " Ep: " + mEpisodesList.get(position).getEpisodeNumber().toString());
            holder.mEpisodeNumber.setText(mEpisodesList.get(position).getFirstAired());

            Log.d(TAG, "onBindViewHolder: " + mEpisodesList.get(position).getTitle());

            try {
                holder.mEpisodeDuration.setText(Integer.toString(mEpisodesList.get(position).getDuration() / 60) + "min");
            } catch (NullPointerException e) {
                e.printStackTrace();
                holder.mEpisodeDuration.setText("Not found");
            }

            //holder.mEpisodeSeason.setText("Season: " + mEpisodesList.get(position).getSeasonNumber().toString());


        } else {
            holder.mEpisodeSeason.setText("TV Special");
            holder.mEpisodeNumber.setText(" ");
            holder.mEpisodeDuration.setText(" ");


        }


        holder.mDetailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertbox = new AlertDialog.Builder(v.getRootView().getContext());
                alertbox.setMessage(mEpisodesList.get(position).getOverview());
                alertbox.setTitle(mEpisodesList.get(position).getTitle());
                alertbox.setNeutralButton("Back",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0,
                                                int arg1) {
                            }
                        });
                alertbox.show();

            }
        });

        holder.mEpisodeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(!mEpisodesList.get(position).getTvEverywhereAndroidSources().equals(null) &&
                        !mEpisodesList.get(position).getTvEverywhereAndroidSources().toString().equals("[]") ) {



                    String index = mEpisodesList.get(position).getTvEverywhereAndroidSources().get(0).toString();

                    Log.d(TAG, "Episode Object List: " + index);


                    index.split(",");

                    String s[] = index.split(",");
                    String link[] = s[4].split("=");

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(link[1]));

                    PackageManager packageManager = v.getContext().getPackageManager();
                    List activities = packageManager.queryIntentActivities(intent,
                            PackageManager.MATCH_DEFAULT_ONLY);
                    boolean isIntentSafe = activities.size() > 0;

                    if(isIntentSafe) {
                        v.getContext().startActivity(intent);
                    }else{
                        String appName[] = s[5].split("=");

                        Snackbar.make(v, appName[1] + " app needed.", Toast.LENGTH_SHORT).show();

                    }


                }else if(!mEpisodesList.get(position).getSubscriptionAndroidSources().equals(null) &&
                        !mEpisodesList.get(position).getSubscriptionAndroidSources().toString().equals("[]")) {

                    String index = mEpisodesList.get(position).getSubscriptionAndroidSources().get(0).toString();


                    index.split(",");

                    String s[] = index.split(",");
                    String link[] = s[3].split("=");

                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse(link[1]));

                    PackageManager packageManager = v.getContext().getPackageManager();
                    List activities = packageManager.queryIntentActivities(intent,
                            PackageManager.MATCH_DEFAULT_ONLY);
                    boolean isIntentSafe = activities.size() > 0;

                    if(isIntentSafe) {
                        v.getContext().startActivity(intent);
                    }else{

                        Snackbar.make(v, s[5] + " app needed.", Toast.LENGTH_SHORT).show();

                    }


                }else if(!mEpisodesList.get(position).getSubscriptionWebSources().equals(null) &&
                        !mEpisodesList.get(position).getSubscriptionWebSources().toString().equals("[]")) {

                    String index = mEpisodesList.get(position).getSubscriptionWebSources().get(0).toString();

                    index.split(",");

                    String s[] = index.split(",");
                    String link[] = s[3].split("=");


                    //url link
                    Snackbar.make(v, link[1].substring(0, link[1].length() - 1), Toast.LENGTH_SHORT).show();

                }else{
                    Snackbar.make(v, "No Link Available", Snackbar.LENGTH_LONG).show();
                }

            }
        });
    }

            @Override
    public int getItemCount(){

            return mEpisodesList.size();
    }

    public void swapList(List<EpisodeResult> swapList){
        mEpisodesList = swapList;
        notifyDataSetChanged();
    }
}



