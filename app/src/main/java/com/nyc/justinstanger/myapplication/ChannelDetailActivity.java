package com.nyc.justinstanger.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChannelDetailActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    public static final String BASE_URL = "http://api-public.guidebox.com/";
    public static final String ID = "3efcd3b10e31ccf9b4eed278fa969a2e06f6deb7";


    int id = ShowIDHolder.getmShowID();
    TextView showId, showTitle;
    ImageView showDetailImage;

    private RecyclerView mDetailRecyclerView;
    private ArrayList <Result> channelShowList;
    private RecyclerViewAdapter mChannelDetailAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDetailRecyclerView = (RecyclerView) findViewById(R.id.episode_recycler_view);

        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(this, 3);
        mDetailRecyclerView.setLayoutManager(gridLayoutManager);

        //showId = (TextView)findViewById(R.id.showid);

        showDetailImage = (ImageView) findViewById(R.id.show_detail_image);

        //showId.setText(Integer.toString(ShowIDHolder.getmShowID()));
        Picasso.with(com.nyc.justinstanger.myapplication.ChannelDetailActivity.this).load(String.valueOf(ChannelIDHolder.getmChannelImageURL()))
                .resize(608, 342).centerCrop().into(showDetailImage);

        //this is same setup as Main Activity's RecyclerView
        //make sure list contains EPISODE-result not just result.



        channelShowList = new ArrayList<Result>();
        getChannelShowQuery();

        mChannelDetailAdapter = new RecyclerViewAdapter(channelShowList);
        //add a list with stuff in it.
        mDetailRecyclerView.setAdapter(mChannelDetailAdapter);

    }

    protected void getChannelShowQuery() {

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            Log.d(TAG, "getShowQuery: " + BASE_URL);

            final OpenTVService service = retrofit.create(OpenTVService.class);

            Call<ShowObject> channelCall = service.getChannelShows(ID, ChannelIDHolder.getmChannelTitle());

            Log.d(TAG, "getShowQuery: api_key" + ID);

            channelCall.enqueue(new Callback<ShowObject>() {
                @Override
                public void onResponse(Call<ShowObject> call, Response<ShowObject> response) {
                    Log.d(TAG, "getShowQuery: SUP?");

                    ShowObject showObject = response.body();
                    if (showObject == null) {
                        Toast.makeText(com.nyc.justinstanger.myapplication.ChannelDetailActivity.this, "Sorry bruh", Toast.LENGTH_SHORT).show();
                    } else {
                        Log.d(TAG, "onResponse: INHERENOW!!!");
                        mChannelDetailAdapter.swapList(showObject.getResults());
                    }
                }

                @Override
                public void onFailure(Call<ShowObject> call, Throwable t) {
                    Toast.makeText(com.nyc.justinstanger.myapplication.ChannelDetailActivity.this, "Sorry didn't work", Toast.LENGTH_SHORT).show();
                    Log.d(TAG, "onFailure:  HEYYYYY");
                    t.printStackTrace();
                }
            });
        } else {
            Toast.makeText(this, "No network connection", Toast.LENGTH_SHORT).show();
        }
    }
}

