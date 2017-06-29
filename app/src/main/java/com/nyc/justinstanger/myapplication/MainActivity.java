package com.nyc.justinstanger.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.Snackbar;
import android.support.transition.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Query;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    public static final String BASE_URL = "http://api-public.guidebox.com/";
    public static final String ID = "3efcd3b10e31ccf9b4eed278fa969a2e06f6deb7";
    public static final String SOURCE = "tv_everywhere";
    public static final String TV_EVERYWHERE = "tv_everywhere";

    public static final String PLATFORM = "andoird";
    public static final String LINKS = "true";
    public static final String ORDER = "true";
    public static final String COMEDY = "comedy";
    public static final String FOOD = "children";
    //music related



    private TextView mShowText;
    private RecyclerView mRecyclerView;
    private RecyclerView mChannelRecyclerView;

    private ArrayList <Result> tvshowList;
    private ArrayList <ChannelResult> tvChannelList;
    private RecyclerViewAdapter mAdapter;
    private ChannelRecyclerViewAdapter mChannelAdapter;
    private ImageButton mSearch;
    private TextView mChannelsTitle;
    private TextView mAllShowsTitle;
    private ImageView mNetworkFailureImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) this.findViewById(R.id.recyclerview);
        mSearch = (ImageButton) findViewById(R.id.search);
        mChannelsTitle = (TextView) findViewById(R.id.string_channels_main);
        mAllShowsTitle = (TextView) findViewById(R.id.string_all_shows_main);
        mNetworkFailureImage = (ImageView) findViewById(R.id.network_down);


        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(this, 3);

        mRecyclerView.setLayoutManager(gridLayoutManager);
        tvshowList = new ArrayList<Result>();

        mAdapter = new RecyclerViewAdapter(tvshowList);
        mRecyclerView.setAdapter(mAdapter);

        getShowQuery();


        //Second Recycler View
        mChannelRecyclerView = (RecyclerView) this.findViewById(R.id.channel_recyclerview);

        LinearLayoutManager channelLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        mChannelRecyclerView.setLayoutManager(channelLayoutManager);
        tvChannelList = new ArrayList<ChannelResult>();

        mChannelAdapter = new ChannelRecyclerViewAdapter(tvChannelList);
        mChannelRecyclerView.setAdapter(mChannelAdapter);

        getChannel();

        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(v.getContext(), SearchActivity.class);
                v.getContext().startActivity(searchIntent);

            }
        });

    }
    protected void getShowQuery() {

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            Log.d(TAG, "getShowQuery: " + BASE_URL);

            final OpenTVService service = retrofit.create(OpenTVService.class);

            Call<ShowObject> showCall = service.getShow(ID, SOURCE, "true", "102");

            Log.d(TAG, "getShowQuery: api_key" + ID);

            showCall.enqueue(new Callback<ShowObject>() {
                @Override
                public void onResponse(Call<ShowObject> call, Response<ShowObject> response) {
                    Log.d(TAG, "getShowQuery: SUP?");

                    ShowObject showObject = response.body();
                    if (showObject == null) {
                        //do nothing
                    } else {
                        Log.d(TAG, "onResponse: INHERENOW!!!" );
                        mChannelsTitle.setText(R.string.channels);
                        mAdapter.swapList(showObject.getResults());
                    }
                }

                @Override
                public void onFailure(Call<ShowObject> call, Throwable t) {
                    mChannelsTitle.setText(R.string.all_shows);
                    Log.d(TAG, "onFailure:  HEYYYYY");
                    t.printStackTrace();
                }
            });
        } else {
            mChannelsTitle.setText(R.string.network_down);

            Toast.makeText(this, "No network connection", Toast.LENGTH_SHORT).show();
        }
    }

    protected void getChannel() {

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            Log.d(TAG, "getShowQuery: " + BASE_URL);

            final OpenTVService service = retrofit.create(OpenTVService.class);

            Call<ChannelObject> channelCall = service.getChannel(ID, SOURCE, PLATFORM, LINKS);

            Log.d(TAG, "getShowQuery: api_key" + ID);

            channelCall.enqueue(new Callback<ChannelObject>() {
                @Override
                public void onResponse(Call<ChannelObject> call, Response<ChannelObject> response) {
                    Log.d(TAG, "getShowQuery: SUP?");

                    ChannelObject channelObject = response.body();
                    if (channelObject == null) {
                        //do nothing

                    } else {
                        mAllShowsTitle.setText(R.string.all_shows);
                        mChannelAdapter.swapList(channelObject.getResults());                    }
                }

                @Override
                public void onFailure(Call<ChannelObject> call, Throwable t) {
                    mAllShowsTitle.setText(" ");
                    t.printStackTrace();
                }
            });
        } else {
            Toast.makeText(this, "No network connection", Toast.LENGTH_SHORT).show();
        }
    }

}


