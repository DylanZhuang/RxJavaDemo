package com.dylan.rxjavademo.ui.activity.filter;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午4:40
 */
public class ThrottleFirstDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.interval(1, TimeUnit.SECONDS)
                .throttleFirst(5, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread());
    }
}
