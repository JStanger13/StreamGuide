package com.nyc.justinstanger.myapplication;

/**
 * Created by justinstanger on 5/24/17.
 */

public class ChannelIDHolder {
    public static int mChannelID;
    public static String mChannelImageURL;
    public static String mChannelTitle;
    public static String mChannelLink;

    public static int getmChannelID() {
        return mChannelID;
    }

    public static void setmChannelID(int mChannelID) {
        ChannelIDHolder.mChannelID = mChannelID;
    }

    public static String getmChannelImageURL() {
        return mChannelImageURL;
    }

    public static void setmChannelImageURL(String mChannelImageURL) {
        ChannelIDHolder.mChannelImageURL = mChannelImageURL;
    }

    public static String getmChannelTitle() {
        return mChannelTitle;
    }

    public static void setmChannelTitle(String mChannelTitle) {
        ChannelIDHolder.mChannelTitle = mChannelTitle;
    }

    public static String getmChannelLink() {
        return mChannelLink;
    }

    public static void setmChannelLink(String mChannelLink) {
        ChannelIDHolder.mChannelLink = mChannelLink;
    }
}
