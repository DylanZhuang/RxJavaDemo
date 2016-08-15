package com.dylan.rxjavademo.ui.activity.combine;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func2;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/27-上午11:59
 */
public class ZipDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.zip(Observable.just(1, 2, 3, 4), Observable.just(5, 6, 7), new Func2() {
            @Override
            public Object call(Object o, Object o2) {
                return o + " - " +  o2;
            }
        });
    }
}
