package com.nyc.justinstanger.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class DetailActivity extends AppCompatActivity {
    public static final String TAG = "ChannelDetailActivity";

    public static final String BASE_URL = "http://api-public.guidebox.com/";
    public static final String ID = "3efcd3b10e31ccf9b4eed278fa969a2e06f6deb7";


    int id = ShowIDHolder.getmShowID();
    TextView showId, showTitle;
    ImageView showDetailImage;

    private RecyclerView mDetailRecyclerView;
    private ArrayList <EpisodeResult> tvEpisodeList;
    private DetailRecyclerViewAdapter mDetailAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDetailRecyclerView = (RecyclerView) findViewById(R.id.episode_recycler_view);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mDetailRecyclerView.setLayoutManager(linearLayoutManager);

        //showId = (TextView)findViewById(R.id.showid);

        showDetailImage = (ImageView) findViewById(R.id.show_detail_image);

        //showId.setText(Integer.toString(ShowIDHolder.getmShowID()));
        Picasso.with(DetailActivity.this).load(String.valueOf(ShowIDHolder.getmImageURL()))
                .resize(608, 342).centerCrop().into(showDetailImage);





        //this is same setup as Main Activity's RecyclerView
        //make sure list contains EPISODE-result not just result.



        tvEpisodeList = new ArrayList<EpisodeResult>();
        getEpisodeQuery();

        mDetailAdapter = new DetailRecyclerViewAdapter(tvEpisodeList);
        //add a list with stuff in it.
        mDetailRecyclerView.setAdapter(mDetailAdapter);

    }

    //similar query as Main
    //result = episodeResult
    //ShowObject = EpisodeObject
    protected void getEpisodeQuery() {

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            Log.d(TAG, "getShowQuery: " + BASE_URL);

            final OpenTVService service = retrofit.create(OpenTVService.class);

            Call<EpisodeObject> episodeCall = service.getEpisodes(Integer.toString(ShowIDHolder.getmShowID()),
                    ID,"true");
            Log.d(TAG, "getShowQuery: api_key" + ID);

            episodeCall.enqueue(new Callback<EpisodeObject>() {
                @Override
                public void onResponse(Call<EpisodeObject> call, Response<EpisodeObject> response) {

                    EpisodeObject episodeObject = response.body();
                    if (episodeObject == null) {
                        Toast.makeText(DetailActivity.this, "Sorry bruh", Toast.LENGTH_SHORT).show();
                    } else {
                        updateViews(episodeObject.getEpisodeResults());
                    }
                }

                private void updateViews(List<EpisodeResult> episodeResult) {
                    mDetailAdapter.swapList(episodeResult);
                }

                @Override
                public void onFailure(Call<EpisodeObject> call, Throwable t) {
                    t.printStackTrace();
                }
            });
        } else {
            Toast.makeText(this, "No network connection", Toast.LENGTH_SHORT).show();
        }

    }
}



