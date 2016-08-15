package com.dylan.rxjavademo.ui.activity.filter;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午4:35
 */
public class FilterDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5).filter(new Func1<Integer, Boolean>() {
            @Override
            public Boolean call(Integer integer) {
                if (integer % 2 == 0) {
                    return true;
                }
                return false;
            }
        });
    }
}
