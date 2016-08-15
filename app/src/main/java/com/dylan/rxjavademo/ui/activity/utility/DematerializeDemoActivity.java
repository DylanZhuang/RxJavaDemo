package com.dylan.rxjavademo.ui.activity.utility;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import rx.Notification;
import rx.Observable;
import rx.Observer;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/30-下午4:29
 */
public class DematerializeDemoActivity extends DemoActivity {
    @Override
    protected void createObservable() {
        super.createObservable();
        mObservable = Observable.just(Notification.createOnNext(1),
                Notification.createOnNext(2),
                Notification.createOnNext(3),
                Notification.<Integer>createOnCompleted()).dematerialize();
    }
}
