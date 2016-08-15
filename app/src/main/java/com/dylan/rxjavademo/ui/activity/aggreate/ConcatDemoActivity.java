package com.dylan.rxjavademo.ui.activity.aggreate;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/6-下午3:13
 */
public class ConcatDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.concat(Observable.just(4, 5, 6), Observable.just(1, 2, 3));
    }
}
