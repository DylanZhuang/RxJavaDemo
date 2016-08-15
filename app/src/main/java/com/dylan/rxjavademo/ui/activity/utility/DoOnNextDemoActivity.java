package com.dylan.rxjavademo.ui.activity.utility;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/30-下午4:28
 */
public class DoOnNextDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = createObservable(5).doOnNext(new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                displayLogcat("integer = " + integer);
            }
        });
    }

    private Observable createObservable(final int index) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < index; i++) {
                    subscriber.onNext(i);
                    if (i == index - 1) {
                        subscriber.onError(new Throwable("error"));
                    }
                }
            }
        });
    }
}
