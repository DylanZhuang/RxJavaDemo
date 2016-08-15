package com.dylan.rxjavademo.ui.activity.connect;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/8-上午11:18
 */
public class ReplayDemoActivity extends DemoActivity {
    private Action1<Long> mAction1;
    private Action1<Long> mAction2;

    @Override
    protected void createObservable() {
        super.createObservable();
        isConnect = true;
        createAction1();
        createAction2();
        mObservable = Observable.interval(1, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .replay(3);
//                .replay(3, TimeUnit.SECONDS);
        mObservable.subscribe(mAction1);
    }

    private void createAction1() {
        mAction1 = new Action1<Long>() {
            @Override
            public void call(Long integer) {
                displayLogcat("createAction1 call integer = " + integer);
                if (integer == 3) {
                    mObservable.subscribe(mAction2);
                }
            }
        };
    }

    private void createAction2() {
        mAction2 = new Action1<Long>() {
            @Override
            public void call(Long integer) {
                displayLogcat("createAction2 call integer = " + integer);
            }
        };
    }
}
