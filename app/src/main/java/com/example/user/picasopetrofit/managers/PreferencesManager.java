package com.example.user.picasopetrofit.managers;

import android.content.SharedPreferences;
import android.net.Uri;

import com.example.user.picasopetrofit.App;

class PreferencesManager {
    private SharedPreferences mSharedPreferences;

    public PreferencesManager() {
        mSharedPreferences= App.getSharedPreferences();
    }
    public void savePhoto(Uri uri) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString("PHOTO_KEY", uri.toString());
        editor.apply();
    }
    public Uri loadUserPhoto() {
        return Uri.parse(mSharedPreferences.getString("PHOTO_KEY",
                "android.resource://com.example.user.picasopetrofit/drawable/photo"));
    }

}
