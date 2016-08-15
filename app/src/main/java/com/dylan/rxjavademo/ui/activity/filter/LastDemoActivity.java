package com.dylan.rxjavademo.ui.activity.filter;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午4:36
 */
public class LastDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3).last();
    }
}
