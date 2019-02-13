package com.example.a12826007.schedulebook;

import android.app.Application;

import io.realm.Realm;

public class scheduleBookApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
