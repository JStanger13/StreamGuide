package com.nyc.justinstanger.myapplication;

/**
 * Created by justinstanger on 5/17/17.
 */

public  class ShowIDHolder {
    public static int mShowID;
    public static String mImageURL;
    public static String mTitle;
    public static String mLink;


    public ShowIDHolder() {
    }

    public static int getmShowID() {
        return mShowID;
    }

    public static void setmShowID(int mShowID) {
        ShowIDHolder.mShowID = mShowID;
    }

    public static String getmImageURL() {
        return mImageURL;
    }

    public static void setmImageURL(String mImageURL) {
        ShowIDHolder.mImageURL = mImageURL;
    }

    public static String getmTitle() {
        return mTitle;
    }

    public static void setmTitle(String mTitle) {
        ShowIDHolder.mTitle = mTitle;
    }

    public static String getmLink() {
        return mLink;
    }

    public static void setmLink(String mLink) {
        ShowIDHolder.mLink = mLink;
    }


}
