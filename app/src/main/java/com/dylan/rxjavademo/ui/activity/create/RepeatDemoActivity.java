package com.dylan.rxjavademo.ui.activity.create;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午12:12
 */
public class RepeatDemoActivity extends DemoActivity {

    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(System.currentTimeMillis()).repeat(5);
    }
}
