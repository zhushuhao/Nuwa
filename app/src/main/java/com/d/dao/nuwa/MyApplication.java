package com.d.dao.nuwa;

import android.app.Application;
import android.content.Context;

import cn.jiajixin.nuwa.Nuwa;

/**
 * Created by dao on 7/30/16.
 */
public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Nuwa.init(this);
        Nuwa.loadPatch(this,"/sdcard/patch.jar");
    }
}
