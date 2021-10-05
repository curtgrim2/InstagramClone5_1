package com.codepath.apps.restclienttemplate;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("yGpT8w8TadEKUNjCHJCxLeJ64cTTTd6debmNDyO4")
                .clientKey("LEerKNI1VFjprFcrVmczJwyGsj01mtdMGwIbxZoy")
                .server("https://parseapi.back4app.com/").build()
        );
    }
}
