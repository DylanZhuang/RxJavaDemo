package com.dylan.rxjavademo.ui.activity.utility;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Action0;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/30-下午4:28
 */
public class DoOnUnsubscribeDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3).doOnUnsubscribe(new Action0() {
            @Override
            public void call() {
                displayLogcat("doOnUnsubscribe");
            }
        });
    }
}
