package com.nyc.justinstanger.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChannelResult {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("channel_type")
    @Expose
    private String channelType;
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
    @SerializedName("external_ids")
    @Expose
    private ExternalIds externalIds;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getArtwork208x117() {
        return artwork208x117;
    }

    public void setArtwork208x117(String artwork208x117) {
        this.artwork208x117 = artwork208x117;
    }

    public String getArtwork304x171() {
        return artwork304x171;
    }

    public void setArtwork304x171(String artwork304x171) {
        this.artwork304x171 = artwork304x171;
    }

    public String getArtwork448x252() {
        return artwork448x252;
    }

    public void setArtwork448x252(String artwork448x252) {
        this.artwork448x252 = artwork448x252;
    }

    public String getArtwork608x342() {
        return artwork608x342;
    }

    public void setArtwork608x342(String artwork608x342) {
        this.artwork608x342 = artwork608x342;
    }

    public ExternalIds getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }
}
