package com.dylan.rxjavademo.base;

import android.app.Application;
import android.content.Context;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午6:02
 */
public abstract class BaseApplication extends Application {
    private static volatile Application sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static Context getContext() {
        return sInstance.getApplicationContext();
    }

}
