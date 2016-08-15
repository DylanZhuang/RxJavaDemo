package com.dylan.rxjavademo.ui.activity.connect;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/8-上午11:18
 */
public class RefCountDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .publish()
                .refCount();
    }
}
