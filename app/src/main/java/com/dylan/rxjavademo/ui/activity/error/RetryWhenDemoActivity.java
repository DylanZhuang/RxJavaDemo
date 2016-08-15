package com.dylan.rxjavademo.ui.activity.error;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/28-下午8:44
 */
public class RetryWhenDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = createErrorObservable(false).retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
            @Override
            public Observable<?> call(Observable<? extends Throwable> observable) {
                displayLogcat("retryWhen call");
                return observable.create(new Observable.OnSubscribe<Integer>() {
                    @Override
                    public void call(Subscriber<? super Integer> subscriber) {
                        subscriber.onNext(1);
//                        subscriber.onError(new Throwable("123"));
                    }
                });
            }
        });
    }

    private Observable createErrorObservable(final boolean isException) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                displayLogcat("subscriber");
                for (int i = 0; i < 5; i++) {
                    if (i == 3) {
                        if (isException) {
                            subscriber.onError(new Exception("exception retry when"));
                        } else {
                            subscriber.onError(new Throwable("throwable retry when"));
                        }
                    } else {
                        subscriber.onNext(i);
                    }
                }
            }
        });
    }
}
