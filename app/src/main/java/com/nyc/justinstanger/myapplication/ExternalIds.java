package com.nyc.justinstanger.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalIds {

    @SerializedName("imdb")
    @Expose
    private Object imdb;
    @SerializedName("wikipedia_id")
    @Expose
    private Object wikipediaId;

    public Object getImdb() {
        return imdb;
    }

    public void setImdb(Object imdb) {
        this.imdb = imdb;
    }

    public Object getWikipediaId() {
        return wikipediaId;
    }

    public void setWikipediaId(Object wikipediaId) {
        this.wikipediaId = wikipediaId;
    }

}