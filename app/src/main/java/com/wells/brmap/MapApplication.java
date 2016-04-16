package com.wells.brmap;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by Wells on 2016/4/16.
 */
public class MapApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
