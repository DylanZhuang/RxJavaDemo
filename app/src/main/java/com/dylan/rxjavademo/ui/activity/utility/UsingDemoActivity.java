package com.dylan.rxjavademo.ui.activity.utility;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/30-下午4:36
 */
public class UsingDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.using(new Func0<Integer>() {
            @Override
            public Integer call() {
                return 1;
            }
        }, new Func1<Integer, Observable<Integer>>() {
            @Override
            public Observable call(Integer o) {
                displayLogcat("Func1 call o = " + o);
                return Observable.just(o);
            }
        }, new Action1<Integer>() {
            @Override
            public void call(Integer o) {
                displayLogcat("Action1 call o = " + o);
                unsubscribe();
            }
        });
    }
}
