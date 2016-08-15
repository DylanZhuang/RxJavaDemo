package com.dylan.rxjavademo.ui.activity.condition;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/5-下午7:06
 */
public class DefaultIfEmptyDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = createObservable(false).defaultIfEmpty(4);
    }

    private Observable createObservable(final boolean isNext) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (isNext) {
                    subscriber.onNext(1);
                } else {
                    subscriber.onCompleted();
                }
            }
        });
    }
}
