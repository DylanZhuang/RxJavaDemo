package com.dylan.rxjavademo.ui.activity.condition;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/5-下午7:06
 */
public class IsEmptyDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = createObservable(false).isEmpty();
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
