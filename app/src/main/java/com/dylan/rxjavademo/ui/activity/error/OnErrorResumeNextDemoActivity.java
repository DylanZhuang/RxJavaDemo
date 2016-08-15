package com.dylan.rxjavademo.ui.activity.error;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/28-下午8:40
 */
public class OnErrorResumeNextDemoActivity extends DemoActivity {

    @Override
    protected void createObservable() {
        super.createObservable();
       mObservable = createErrorObservable(false).onErrorResumeNext(Observable.just(5, 6, 7));
    }

    private Observable createErrorObservable(final boolean isException) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    if (i == 3) {
                        if (isException) {
                            subscriber.onError(new Exception("exception error resume next"));
                        } else {
                            subscriber.onError(new Throwable("throwable error resume next"));
                        }
                    } else {
                        subscriber.onNext(i);
                    }
                }
            }
        });
    }
}
