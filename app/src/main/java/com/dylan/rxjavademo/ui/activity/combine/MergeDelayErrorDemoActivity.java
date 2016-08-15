package com.dylan.rxjavademo.ui.activity.combine;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/27-下午8:22
 */
public class MergeDelayErrorDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.mergeDelayError(Observable.just(0, 2, 4, 5, 8), Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 1; i < 10; i+=2) {
                    if (i == 7) {
                        subscriber.onError(new Throwable("7"));
                    } else {
                        subscriber.onNext(i);
                    }
                    subscriber.onCompleted();
                }
            }
        }));
    }
}
