package com.dylan.rxjavademo.ui.activity.transform;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Observable;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午3:12
 */
public class GroupByDemoActivity extends DemoActivity{
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5, 6).groupBy(new Func1<Integer, Integer>(){
            @Override
            public Integer call(Integer integer) {
                return integer % 2;
            }
        });
    }
}
