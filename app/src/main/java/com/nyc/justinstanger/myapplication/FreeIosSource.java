package com.nyc.justinstanger.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FreeIosSource {

    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("embed")
    @Expose
    private Object embed;
    @SerializedName("app_name")
    @Expose
    private String appName;
    @SerializedName("app_link")
    @Expose
    private Integer appLink;
    @SerializedName("app_required")
    @Expose
    private Integer appRequired;
    @SerializedName("app_download_link")
    @Expose
    private String appDownloadLink;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Object getEmbed() {
        return embed;
    }

    public void setEmbed(Object embed) {
        this.embed = embed;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getAppLink() {
        return appLink;
    }

    public void setAppLink(Integer appLink) {
        this.appLink = appLink;
    }

    public Integer getAppRequired() {
        return appRequired;
    }

    public void setAppRequired(Integer appRequired) {
        this.appRequired = appRequired;
    }

    public String getAppDownloadLink() {
        return appDownloadLink;
    }

    public void setAppDownloadLink(String appDownloadLink) {
        this.appDownloadLink = appDownloadLink;
    }

}