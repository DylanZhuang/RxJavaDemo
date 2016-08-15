package com.dylan.rxjavademo.ui.activity.create;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/24-下午2:33
 */
public class JustDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(System.currentTimeMillis());
    }
}
