package com.dylan.rxjavademo.ui.activity.condition;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/5-下午7:06
 */
public class TakeUntilDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.interval(1, TimeUnit.SECONDS)
                .takeUntil(Observable.timer(5, TimeUnit.SECONDS))
                .observeOn(AndroidSchedulers.mainThread());
    }
}
