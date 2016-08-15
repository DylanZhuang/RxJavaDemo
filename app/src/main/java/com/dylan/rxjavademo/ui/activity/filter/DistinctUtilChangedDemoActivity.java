package com.dylan.rxjavademo.ui.activity.filter;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午7:44
 */
public class DistinctUtilChangedDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 2, 3, 2, 2, 3, 4, 5, 6)
                .distinctUntilChanged();
    }
}
