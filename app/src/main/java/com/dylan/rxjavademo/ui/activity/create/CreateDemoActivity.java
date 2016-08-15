package com.dylan.rxjavademo.ui.activity.create;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/21-下午6:15
 */
public class CreateDemoActivity extends DemoActivity {

    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onNext(1);
                    subscriber.onNext(2);
                    subscriber.onNext(3);
                    subscriber.onError(new Throwable("create error"));
                    subscriber.onCompleted();
                    subscriber.onNext(4);
                }
            }
        });
    }

}
