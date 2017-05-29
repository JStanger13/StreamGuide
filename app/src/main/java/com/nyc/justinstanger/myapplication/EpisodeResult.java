package com.nyc.justinstanger.myapplication;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EpisodeResult {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("tvdb")
    @Expose
    private Integer tvdb;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("is_shadow")
    @Expose
    private Integer isShadow;
    @SerializedName("alternate_tvdb")
    @Expose
    private List<Object> alternateTvdb = null;
    @SerializedName("imdb_id")
    @Expose
    private String imdbId;
    @SerializedName("themoviedb")
    @Expose
    private Integer themoviedb;
    @SerializedName("show_id")
    @Expose
    private Integer showId;
    @SerializedName("season_number")
    @Expose
    private Integer seasonNumber;
    @SerializedName("episode_number")
    @Expose
    private Integer episodeNumber;
    @SerializedName("special")
    @Expose
    private Integer special;
    @SerializedName("first_aired")
    @Expose
    private String firstAired;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("original_title")
    @Expose
    private String originalTitle;
    @SerializedName("alternate_titles")
    @Expose
    private List<Object> alternateTitles = null;
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("production_code")
    @Expose
    private String productionCode;
    @SerializedName("thumbnail_208x117")
    @Expose
    private String thumbnail208x117;
    @SerializedName("thumbnail_304x171")
    @Expose
    private String thumbnail304x171;
    @SerializedName("thumbnail_400x225")
    @Expose
    private String thumbnail400x225;
    @SerializedName("thumbnail_608x342")
    @Expose
    private String thumbnail608x342;
    @SerializedName("free_web_sources")
    @Expose
    private List<FreeWebSource> freeWebSources = null;
    @SerializedName("free_ios_sources")
    @Expose
    private List<FreeIosSource> freeIosSources = null;
    @SerializedName("free_android_sources")
    @Expose
    private List<FreeAndroidSource> freeAndroidSources = null;
    @SerializedName("tv_everywhere_web_sources")
    @Expose
    private List<Object> tvEverywhereWebSources = null;
    @SerializedName("tv_everywhere_ios_sources")
    @Expose
    private List<Object> tvEverywhereIosSources = null;
    @SerializedName("tv_everywhere_android_sources")
    @Expose
    private List<Object> tvEverywhereAndroidSources = null;
    @SerializedName("subscription_web_sources")
    @Expose
    private List<Object> subscriptionWebSources = null;
    @SerializedName("subscription_ios_sources")
    @Expose
    private List<Object> subscriptionIosSources = null;
    @SerializedName("subscription_android_sources")
    @Expose
    private List<Object> subscriptionAndroidSources = null;
    @SerializedName("purchase_web_sources")
    @Expose
    private List<Object> purchaseWebSources = null;
    @SerializedName("purchase_ios_sources")
    @Expose
    private List<Object> purchaseIosSources = null;
    @SerializedName("purchase_android_sources")
    @Expose
    private List<Object> purchaseAndroidSources = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTvdb() {
        return tvdb;
    }

    public void setTvdb(Integer tvdb) {
        this.tvdb = tvdb;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getIsShadow() {
        return isShadow;
    }

    public void setIsShadow(Integer isShadow) {
        this.isShadow = isShadow;
    }

    public List<Object> getAlternateTvdb() {
        return alternateTvdb;
    }

    public void setAlternateTvdb(List<Object> alternateTvdb) {
        this.alternateTvdb = alternateTvdb;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Integer getThemoviedb() {
        return themoviedb;
    }

    public void setThemoviedb(Integer themoviedb) {
        this.themoviedb = themoviedb;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Integer getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Integer episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public List<Object> getAlternateTitles() {
        return alternateTitles;
    }

    public void setAlternateTitles(List<Object> alternateTitles) {
        this.alternateTitles = alternateTitles;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public String getThumbnail208x117() {
        return thumbnail208x117;
    }

    public void setThumbnail208x117(String thumbnail208x117) {
        this.thumbnail208x117 = thumbnail208x117;
    }

    public String getThumbnail304x171() {
        return thumbnail304x171;
    }

    public void setThumbnail304x171(String thumbnail304x171) {
        this.thumbnail304x171 = thumbnail304x171;
    }

    public String getThumbnail400x225() {
        return thumbnail400x225;
    }

    public void setThumbnail400x225(String thumbnail400x225) {
        this.thumbnail400x225 = thumbnail400x225;
    }

    public String getThumbnail608x342() {
        return thumbnail608x342;
    }

    public void setThumbnail608x342(String thumbnail608x342) {
        this.thumbnail608x342 = thumbnail608x342;
    }

    public List<FreeWebSource> getFreeWebSources() {
        return freeWebSources;
    }

    public void setFreeWebSources(List<FreeWebSource> freeWebSources) {
        this.freeWebSources = freeWebSources;
    }

    public List<FreeIosSource> getFreeIosSources() {
        return freeIosSources;
    }

    public void setFreeIosSources(List<FreeIosSource> freeIosSources) {
        this.freeIosSources = freeIosSources;
    }

    public List<FreeAndroidSource> getFreeAndroidSources() {
        return freeAndroidSources;
    }

    public void setFreeAndroidSources(List<FreeAndroidSource> freeAndroidSources) {
        this.freeAndroidSources = freeAndroidSources;
    }

    public List<Object> getTvEverywhereWebSources() {
        return tvEverywhereWebSources;
    }

    public void setTvEverywhereWebSources(List<Object> tvEverywhereWebSources) {
        this.tvEverywhereWebSources = tvEverywhereWebSources;
    }

    public List<Object> getTvEverywhereIosSources() {
        return tvEverywhereIosSources;
    }

    public void setTvEverywhereIosSources(List<Object> tvEverywhereIosSources) {
        this.tvEverywhereIosSources = tvEverywhereIosSources;
    }

    public List<Object> getTvEverywhereAndroidSources() {
        return tvEverywhereAndroidSources;
    }

    public void setTvEverywhereAndroidSources(List<Object> tvEverywhereAndroidSources) {
        this.tvEverywhereAndroidSources = tvEverywhereAndroidSources;
    }

    public List<Object> getSubscriptionWebSources() {
        return subscriptionWebSources;
    }

    public void setSubscriptionWebSources(List<Object> subscriptionWebSources) {
        this.subscriptionWebSources = subscriptionWebSources;
    }

    public List<Object> getSubscriptionIosSources() {
        return subscriptionIosSources;
    }

    public void setSubscriptionIosSources(List<Object> subscriptionIosSources) {
        this.subscriptionIosSources = subscriptionIosSources;
    }

    public List<Object> getSubscriptionAndroidSources() {
        return subscriptionAndroidSources;
    }

    public void setSubscriptionAndroidSources(List<Object> subscriptionAndroidSources) {
        this.subscriptionAndroidSources = subscriptionAndroidSources;
    }

    public List<Object> getPurchaseWebSources() {
        return purchaseWebSources;
    }

    public void setPurchaseWebSources(List<Object> purchaseWebSources) {
        this.purchaseWebSources = purchaseWebSources;
    }

    public List<Object> getPurchaseIosSources() {
        return purchaseIosSources;
    }

    public void setPurchaseIosSources(List<Object> purchaseIosSources) {
        this.purchaseIosSources = purchaseIosSources;
    }

    public List<Object> getPurchaseAndroidSources() {
        return purchaseAndroidSources;
    }

    public void setPurchaseAndroidSources(List<Object> purchaseAndroidSources) {
        this.purchaseAndroidSources = purchaseAndroidSources;
    }

}
