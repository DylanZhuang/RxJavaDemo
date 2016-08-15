package com.dylan.rxjavademo.ui.activity.transform;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午8:00
 */
public class SwitchMapDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5).switchMap(new Func1<Integer, Observable<Integer>>() {
            @Override
            public Observable call(Integer integer) {
                return Observable.just(integer * 2);
            }
        });
    }
}
