package com.nyc.justinstanger.myapplication;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShowObject {

    @SerializedName("total_results")
    @Expose
    private int totalResults;
    @SerializedName("total_returned")
    @Expose
    private int totalReturned;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ShowObject withTotalResults(int totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    public int getTotalReturned() {
        return totalReturned;
    }

    public void setTotalReturned(int totalReturned) {
        this.totalReturned = totalReturned;
    }

    public ShowObject withTotalReturned(int totalReturned) {
        this.totalReturned = totalReturned;
        return this;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public ShowObject withResults(List<Result> results) {
        this.results = results;
        return this;
    }

}

