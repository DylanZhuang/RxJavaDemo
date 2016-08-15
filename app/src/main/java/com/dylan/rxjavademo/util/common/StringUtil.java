package com.dylan.rxjavademo.util.common;

import android.content.Context;

import com.dylan.rxjavademo.MainApplication;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午6:00
 */
public class StringUtil {
    public static String getString(Context context, int id) {
        return context.getResources().getString(id);
    }

    public static String getString(int id) {
        return MainApplication.getContext().getResources().getString(id);
    }
}
