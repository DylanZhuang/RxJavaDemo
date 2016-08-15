package com.dylan.rxjavademo.ui.activity.combine;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func3;
import rx.schedulers.Schedulers;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/27-上午11:55
 */
public class CombineLatestDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.combineLatest(createObservable(1), createObservable(2), createObservable(3), new Func3() {
            @Override
            public Object call(Object o, Object o2, Object o3) {
                String message = "o = " + o + " o2 = " + o2 + " o3 = " + o3;
                displayLogcat(message);
                return (Integer)o + (Integer)o2 + (Integer)o3;
            }
        });
    }

    private Observable createObservable(final int index) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (index == 2 || index == 3) {
                    try {
                        Thread.sleep((index - 1) * 333);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 1; i < 5; i++) {
                    subscriber.onNext(i * index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
    }
}
