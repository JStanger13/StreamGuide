package com.nyc.justinstanger.myapplication;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import io.realm.RealmObject;

public class Result  {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("alternate_titles")
    @Expose
    private List<String> alternateTitles = null;
    @SerializedName("container_show")
    @Expose
    private int containerShow;
    @SerializedName("first_aired")
    @Expose
    private String firstAired;
    @SerializedName("imdb_id")
    @Expose
    private String imdbId;
    @SerializedName("tvdb")
    @Expose
    private int tvdb;
    @SerializedName("themoviedb")
    @Expose
    private int themoviedb;
    @SerializedName("freebase")
    @Expose
    private Object freebase;
    @SerializedName("wikipedia_id")
    @Expose
    private int wikipediaId;
    @SerializedName("tvrage")
    @Expose
    private Tvrage tvrage;
    @SerializedName("artwork_208x117")
    @Expose
    private String artwork208x117;
    @SerializedName("artwork_304x171")
    @Expose
    private String artwork304x171;
    @SerializedName("artwork_448x252")
    @Expose
    private String artwork448x252;
    @SerializedName("artwork_608x342")
    @Expose
    private String artwork608x342;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Result withId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Result withTitle(String title) {
        this.title = title;
        return this;
    }

    public List<String> getAlternateTitles() {
        return alternateTitles;
    }

    public void setAlternateTitles(List<String> alternateTitles) {
        this.alternateTitles = alternateTitles;
    }

    public Result withAlternateTitles(List<String> alternateTitles) {
        this.alternateTitles = alternateTitles;
        return this;
    }

    public int getContainerShow() {
        return containerShow;
    }

    public void setContainerShow(int containerShow) {
        this.containerShow = containerShow;
    }

    public Result withContainerShow(int containerShow) {
        this.containerShow = containerShow;
        return this;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public Result withFirstAired(String firstAired) {
        this.firstAired = firstAired;
        return this;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Result withImdbId(String imdbId) {
        this.imdbId = imdbId;
        return this;
    }

    public int getTvdb() {
        return tvdb;
    }

    public void setTvdb(int tvdb) {
        this.tvdb = tvdb;
    }

    public Result withTvdb(int tvdb) {
        this.tvdb = tvdb;
        return this;
    }

    public int getThemoviedb() {
        return themoviedb;
    }

    public void setThemoviedb(int themoviedb) {
        this.themoviedb = themoviedb;
    }

    public Result withThemoviedb(int themoviedb) {
        this.themoviedb = themoviedb;
        return this;
    }

    public Object getFreebase() {
        return freebase;
    }

    public void setFreebase(Object freebase) {
        this.freebase = freebase;
    }

    public Result withFreebase(Object freebase) {
        this.freebase = freebase;
        return this;
    }

    public int getWikipediaId() {
        return wikipediaId;
    }

    public void setWikipediaId(int wikipediaId) {
        this.wikipediaId = wikipediaId;
    }

    public Result withWikipediaId(int wikipediaId) {
        this.wikipediaId = wikipediaId;
        return this;
    }

    public Tvrage getTvrage() {
        return tvrage;
    }

    public void setTvrage(Tvrage tvrage) {
        this.tvrage = tvrage;
    }

    public Result withTvrage(Tvrage tvrage) {
        this.tvrage = tvrage;
        return this;
    }

    public String getArtwork208x117() {
        return artwork208x117;
    }

    public void setArtwork208x117(String artwork208x117) {
        this.artwork208x117 = artwork208x117;
    }

    public Result withArtwork208x117(String artwork208x117) {
        this.artwork208x117 = artwork208x117;
        return this;
    }

    public String getArtwork304x171() {
        return artwork304x171;
    }

    public void setArtwork304x171(String artwork304x171) {
        this.artwork304x171 = artwork304x171;
    }

    public Result withArtwork304x171(String artwork304x171) {
        this.artwork304x171 = artwork304x171;
        return this;
    }

    public String getArtwork448x252() {
        return artwork448x252;
    }

    public void setArtwork448x252(String artwork448x252) {
        this.artwork448x252 = artwork448x252;
    }

    public Result withArtwork448x252(String artwork448x252) {
        this.artwork448x252 = artwork448x252;
        return this;
    }

    public String getArtwork608x342() {
        return artwork608x342;
    }

    public void setArtwork608x342(String artwork608x342) {
        this.artwork608x342 = artwork608x342;
    }

    public Result withArtwork608x342(String artwork608x342) {
        this.artwork608x342 = artwork608x342;
        return this;
    }

}
