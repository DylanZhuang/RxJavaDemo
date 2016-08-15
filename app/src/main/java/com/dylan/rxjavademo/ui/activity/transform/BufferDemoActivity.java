package com.dylan.rxjavademo.ui.activity.transform;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func0;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午3:10
 */
public class BufferDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        Observable observable = Observable.just(1, 2, 3, 4, 5, 6, 7, 8);
        if (mRandom == BufferDetailActivity.MAX) {
            mObservable = observable.buffer(2, 3);
        } else if (mRandom == BufferDetailActivity.MIN) {
            mObservable = observable.buffer(3);
        }
    }
}
