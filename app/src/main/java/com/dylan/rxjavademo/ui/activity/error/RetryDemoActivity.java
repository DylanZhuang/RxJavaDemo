package com.dylan.rxjavademo.ui.activity.error;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/28-下午8:43
 */
public class RetryDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = createErrorObservable(false).retry(1);
    }

    private Observable createErrorObservable(final boolean isException) {
        displayLogcat("subscriber");
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    if (i == 3) {
                        if (isException) {
                            subscriber.onError(new Exception("exception retry"));
                        } else {
                            subscriber.onError(new Throwable("throwable retry"));
                        }
                    } else {
                        subscriber.onNext(i);
                    }
                }
            }
        });
    }
}
