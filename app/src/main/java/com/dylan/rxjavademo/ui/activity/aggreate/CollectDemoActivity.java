package com.dylan.rxjavademo.ui.activity.aggreate;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.ArrayList;

import rx.Observable;
import rx.functions.Action2;
import rx.functions.Func0;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/6-下午3:13
 */
public class CollectDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.concat(Observable.just(11, 12, 13, 14, 15), Observable.just(1, 2, 3, 4, 5))
                .collect(new Func0() {
            @Override
            public ArrayList<Integer> call() {
                return new ArrayList<Integer>();
            }
        }, new Action2<ArrayList<Integer>, Integer>() {
            @Override
            public void call(ArrayList<Integer> o, Integer o2) {
                o.add(o2);
            }
        });
    }
}
