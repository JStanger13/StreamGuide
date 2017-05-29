package com.nyc.justinstanger.myapplication;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EpisodeObject {

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("total_returned")
    @Expose
    private Integer totalReturned;
    @SerializedName("results")
    @Expose
    private List<EpisodeResult> episodeResults = null;

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalReturned() {
        return totalReturned;
    }

    public void setTotalReturned(Integer totalReturned) {
        this.totalReturned = totalReturned;
    }

    public List<EpisodeResult> getEpisodeResults() {
        return episodeResults;
    }

    public void setResults(List<EpisodeResult> results) {
        this.episodeResults = results;
    }

}
