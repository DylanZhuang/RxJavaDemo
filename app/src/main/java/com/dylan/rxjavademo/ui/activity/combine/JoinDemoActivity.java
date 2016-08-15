package com.dylan.rxjavademo.ui.activity.combine;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/27-上午11:55
 */
public class JoinDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1).join(createObservable(2), new Func1<Integer, Observable<Long>>() {
            @Override
            public Observable<Long> call(Integer integer) {
                displayLogcat("first fun1 integer = " + integer);
                /**
                 * 返回的数据为当Observable.just(1)发射完毕后,在规定的3s内，
                 * createObservable(2)所发射出去的数据
                 */
                return Observable.timer(3, TimeUnit.SECONDS);
            }
        }, new Func1<Integer, Observable<Long>>() {
            @Override
            public Observable<Long> call(Integer integer) {
                displayLogcat("second fun1 integer = " + integer);
                return Observable.timer(1, TimeUnit.SECONDS);
            }
        }, new Func2() {
            @Override
            public Object call(Object o, Object o2) {
                displayLogcat("o = " + o + " o2 = " + o2);
                return (Integer) o + (Integer) o2;
            }
        });
    }

    private Observable createObservable(final int index) {
        return Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (index == 2) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < index; i++) {
                    subscriber.onNext(i + index);
                    if (index == 2) {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
    }
}
