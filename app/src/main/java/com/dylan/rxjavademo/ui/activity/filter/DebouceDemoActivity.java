package com.dylan.rxjavademo.ui.activity.filter;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午4:31
 */
public class DebouceDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5, 6).debounce(new Func1<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> call(final Integer integer) {
                return Observable.create(new Observable.OnSubscribe<Integer>() {
                    @Override
                    public void call(Subscriber<? super Integer> subscriber) {
                        if (integer % 2 == 0 && !subscriber.isUnsubscribed()) {
                            subscriber.onNext(integer);
                            subscriber.onCompleted();
                        }
                    }
                });
            }
        });
    }

//    mObservable = Observable.create(new Observable.OnSubscribe<Integer>() {
//        @Override
//        public void call(Subscriber<? super Integer> subscriber) {
//            for (int i = 0; i < 5; i++) {
//                if (i % 2 == 0) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                if (!subscriber.isUnsubscribed()) {
//                    subscriber.onNext(i);
//                }
//            }
//            subscriber.onCompleted();
//        }
//    }).subscribeOn(Schedulers.computation())
//            .debounce(1, TimeUnit.SECONDS)
//    .observeOn(AndroidSchedulers.mainThread());
}
