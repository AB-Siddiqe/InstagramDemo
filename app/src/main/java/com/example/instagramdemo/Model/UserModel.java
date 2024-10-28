package com.example.instagramdemo.Model;

import android.graphics.drawable.Drawable;

public class UserModel {
    String name;
     String drawable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrawable() {
        return drawable;
    }

    public void setDrawable(String drawable) {
        this.drawable = drawable;
    }

    public UserModel(String name, String drawable) {
        this.name = name;
        this.drawable = drawable;

    }

    public Drawable getImage() {
        return null;
    }
}
