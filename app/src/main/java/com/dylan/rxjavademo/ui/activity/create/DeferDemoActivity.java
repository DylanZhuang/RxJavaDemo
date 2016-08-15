package com.dylan.rxjavademo.ui.activity.create;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func0;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/24-下午12:25
 */
public class DeferDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.defer(new Func0<Observable<Long>>() {
            @Override
            public Observable call() {
                return Observable.just(System.currentTimeMillis());
            }
        });
    }
}
