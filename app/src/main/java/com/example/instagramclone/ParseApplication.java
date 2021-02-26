package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                //.applicationId("7uvp7TfkqMwXrbFyQqGjiOV0Hks1k62iiS9XYz61")
                .applicationId("Z2Oiml7wGi6RnU2FLCqE1ZRhhopT47grfzKORsOF")
                //.clientKey("NAGsLf84rbNpL8rAwuAs9YChSnfMybGmdJCxcilq")
                .clientKey("yD7y4CzoBM0YBqfS74GRE2D4mE1dSJQsPTmERfHi")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
