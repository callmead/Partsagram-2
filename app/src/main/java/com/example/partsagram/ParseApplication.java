package com.example.partsagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cDYRZEdQCA7ZZDM09HkDdOegvw1IkwuGfDZWohUb")
                .clientKey("nAnkfSyCAt1KTdPXKV1qheKMCJTaY2MVzVQUB6yW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}