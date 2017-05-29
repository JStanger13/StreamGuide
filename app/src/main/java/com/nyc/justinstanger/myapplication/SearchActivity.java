package com.nyc.justinstanger.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity {
    EditText mEditText;
    RecyclerView mSearchRecyclerView;
    RecyclerViewAdapter mSearchAdapter;
    ImageButton mSubmitButton;

    public static final String BASE_URL = "http://api-public.guidebox.com/";
    public static final String ID = "3efcd3b10e31ccf9b4eed278fa969a2e06f6deb7";
    public static final String SOURCE = "tv_everywhere";
    public static final String PLATFORM = "andoird";
    public static final String LINKS = "true";
    public static final String ORDER = "true";

    private ArrayList<Result> tvSearchList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mSearchRecyclerView = (RecyclerView) this.findViewById(R.id.search_recycler_view);
        mEditText = (EditText) findViewById(R.id.search_edit_text);
        mSubmitButton = (ImageButton) findViewById(R.id.search_submit);
        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(this, 3);
        mSearchRecyclerView.setLayoutManager(gridLayoutManager);
        tvSearchList = new ArrayList<Result>();

        mSearchAdapter = new RecyclerViewAdapter(tvSearchList);
        mSearchRecyclerView.setAdapter(mSearchAdapter);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = mEditText.getText().toString();
                if (x.length() == 0) {

                    Toast.makeText(SearchActivity.this, "Please enter text!", Toast.LENGTH_SHORT).show();

                }else {
                    getSearchQuery();
                    Toast.makeText(SearchActivity.this, x, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    protected void getSearchQuery() {

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            final OpenTVService service = retrofit.create(OpenTVService.class);

            //Call<ShowObject> showCall = service.getShow(ID, SOURCE);
            Call<ShowObject> showCall = service.getSearchQuery(ID, "show", "title", mEditText.getText().toString());


            showCall.enqueue(new Callback<ShowObject>() {
                @Override
                public void onResponse(Call<ShowObject> call, Response<ShowObject> response) {

                    ShowObject showObject = response.body();
                    if (showObject == null) {
                        Toast.makeText(SearchActivity.this, "Sorry SEARCH bruh", Toast.LENGTH_SHORT).show();
                    } else {
                        mSearchAdapter.swapList(showObject.getResults());                    }
                }



                @Override
                public void onFailure(Call<ShowObject> call, Throwable t) {
                    Toast.makeText(SearchActivity.this, "Sorry didn't work", Toast.LENGTH_SHORT).show();
                    t.printStackTrace();
                }
            });
        } else {
            Toast.makeText(this, "No network connection", Toast.LENGTH_SHORT).show();
        }
    }


}
