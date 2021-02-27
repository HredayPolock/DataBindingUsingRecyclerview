package com.example;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class UserList {

    private String name;
    private int age;
    private boolean active;
    private String imageurl;

    public UserList(String name, int age, boolean active, String imageurl) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

@BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView, String imageurl) {

        Glide.with(imageView).load(imageurl).into(imageView);


    }


}
