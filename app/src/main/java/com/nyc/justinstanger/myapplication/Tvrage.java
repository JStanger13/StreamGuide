package com.nyc.justinstanger.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tvrage {

    @SerializedName("tvrage_id")
    @Expose
    private int tvrageId;
    @SerializedName("link")
    @Expose
    private String link;

    public int getTvrageId() {
        return tvrageId;
    }

    public void setTvrageId(int tvrageId) {
        this.tvrageId = tvrageId;
    }

    public Tvrage withTvrageId(int tvrageId) {
        this.tvrageId = tvrageId;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Tvrage withLink(String link) {
        this.link = link;
        return this;
    }

}
