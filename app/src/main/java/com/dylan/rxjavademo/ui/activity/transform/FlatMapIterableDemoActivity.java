package com.dylan.rxjavademo.ui.activity.transform;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午7:47
 */
public class FlatMapIterableDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(1, 2, 3, 4, 5).flatMapIterable(new Func1<Integer, Iterable<String>>() {
            @Override
            public Iterable call(Integer integer) {
                List<String> list = new ArrayList<String>();
                for (int i = 0; i < integer; i++) {
                    list.add("list" + i);
                }
                return list;
            }
        });
    }
}
