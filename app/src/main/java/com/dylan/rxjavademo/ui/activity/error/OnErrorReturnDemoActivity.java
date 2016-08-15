package com.dylan.rxjavademo.ui.activity.error;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/28-下午8:39
 */
public class OnErrorReturnDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = createErrorObservable(false).onErrorReturn(new Func1() {
            @Override
            public Object call(Object o) {
                displayLogcat("onErrorReturn Object = " + o);
                return "onErrorReturn throwable";
            }
        });
    }

    private Observable createErrorObservable(final boolean isException) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    if (i == 3) {
                        if (isException) {
                            subscriber.onError(new Exception("exception error return"));
                        } else {
                            subscriber.onError(new Throwable("throwable error return"));
                        }
                    } else {
                        subscriber.onNext(i);
                    }
                }
            }
        });
    }
}
