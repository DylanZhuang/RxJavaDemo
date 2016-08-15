package com.dylan.rxjavademo.ui.activity.condition;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/5-下午7:06
 */
public class AmbDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.amb(createDelayObservable(4),
                createDelayObservable(3),
                createDelayObservable(2),
                createDelayObservable(1))
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }

    private Observable createDelayObservable(int index) {
        return Observable.just(1 * index, 2 * index, 3 * index).delay(index, TimeUnit.SECONDS);
    }
}
