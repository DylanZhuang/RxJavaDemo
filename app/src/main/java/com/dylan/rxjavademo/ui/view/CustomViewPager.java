package com.dylan.rxjavademo.ui.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午4:46
 */
public class CustomViewPager extends ViewPager {
    private boolean isEnableScroll = true;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean isEnableScroll() {
        return isEnableScroll;
    }

    public void setEnableScroll(boolean enableScroll) {
        isEnableScroll = enableScroll;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (!isEnableScroll) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (!isEnableScroll) {
            return false;
        }
        return super.onTouchEvent(ev);
    }
}
