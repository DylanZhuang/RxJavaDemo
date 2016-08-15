package com.dylan.rxjavademo.ui.activity.utility;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/30-下午4:31
 */
public class ObserverOnDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.timer(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread());
    }
}
