package com.dylan.rxjavademo.ui.activity.condition;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/5-下午7:06
 */
public class TakeWhileDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5).takeWhile(new Func1<Integer, Boolean>() {
            @Override
            public Boolean call(Integer integer) {
                return integer != 3;
            }
        });
    }
}
