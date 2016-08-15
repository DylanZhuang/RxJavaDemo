package com.dylan.rxjavademo.util.common;

import android.content.Context;
import android.widget.Toast;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午5:11
 */
public class ToastUtil {
    public static void showShortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void showCustomToast(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }

}
