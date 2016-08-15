package com.dylan.rxjavademo.ui.activity.aggreate;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func2;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/6-下午3:13
 */
public class ReduceDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5).reduce(new Func2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
    }
}
