package com.dylan.rxjavademo.ui.activity.error;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/28-下午8:42
 */
public class OnExceptionResumeNextDemoActivity extends DemoActivity {

    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = createErrorObservable(false).onExceptionResumeNext(Observable.just(5, 6, 7));
    }

    private Observable createErrorObservable(final boolean isException) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    if (i == 3) {
                        if (isException) {
                            subscriber.onError(new Exception("exception on exception resume next"));
                        } else {
                            subscriber.onError(new Throwable("throwable on exception resume next"));
                        }
                    } else {
                        subscriber.onNext(i);
                    }
                }
            }
        });
    }
}
