package com.dylan.rxjavademo.ui.activity.utility;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Description 延时发射
 * author   Dylan.zhuang
 * Date:    16/7/30-下午3:23
 */
public class DelayDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3)
                .delay(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread());
    }
}
