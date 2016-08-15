package com.dylan.rxjavademo.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.base.activity.BaseActivity;
import com.dylan.rxjavademo.ui.util.DetailUtil;

import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.observables.GroupedObservable;
import rx.schedulers.TimeInterval;
import rx.schedulers.Timestamped;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/22-下午6:07
 */
public abstract class DemoActivity<T> extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "DemoActivity";

    private static final String TITLE = "title";

    private static final String RANDOM = "random";

    private String mTitle;

    protected int mRandom;

    protected Observable<T> mObservable;

    protected Subscriber<T> mSubscriber;

    protected TextView mLogcatView;

    protected Subscription mSubscription;

    protected boolean isConnect;

    public static void gotoActivity(Context context, int pageType, int itemType, String title, int random) {
        Class<?> demoClass = DetailUtil.getClass(pageType, itemType, true);
        if (demoClass == null) {
            return;
        }
        Intent intent = new Intent(context, demoClass);
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, title);
        bundle.putInt(RANDOM, random);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }


    @Override
    protected int getContentViewId() {
        return R.layout.activity_demo;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mToolbar = (Toolbar) findViewById(R.id.tool_bar_demo);
        mToolbar.setTitle(mTitle);
        mLogcatView = (TextView) findViewById(R.id.tv_logcat_demo);

        findViewById(R.id.tv_demo_run).setOnClickListener(this);
        findViewById(R.id.tv_demo_cancel).setOnClickListener(this);
        createObservable();
        createSubscribe();
    }

    @Override
    protected void handleIntent(Intent intent) {
        super.handleIntent(intent);
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            mTitle = bundle.getString(TITLE);
            mRandom = bundle.getInt(RANDOM, -1);
        }
    }

    @Override
    public void onClick(View v) {
        if (mObservable == null || mSubscriber == null) {
            return;
        }
        switch (v.getId()) {
            case R.id.tv_demo_run:
                if (isConnect && mObservable instanceof ConnectableObservable) {
                    ConnectableObservable connectableObservable = (ConnectableObservable)mObservable;
                    mSubscription = connectableObservable.connect();
                } else {
                    mObservable.subscribe(mSubscriber);
                }
                break;
            case R.id.tv_demo_cancel:
                unsubscribe();
                break;
        }
    }

    protected void createObservable() {
    }

    protected void unsubscribe() {
        if (mSubscription != null) {
            mSubscription.unsubscribe();
        }
        mSubscriber.unsubscribe();
        displayLogcat("unsubscribe");
    }

    protected void createSubscribe() {
        displayLogcat("createSubscribe");
        mSubscriber = new Subscriber<T>() {
            @Override
            public void onCompleted() {
                displayLogcat("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                displayLogcat("onError e is " + e);
            }

            @Override
            public void onNext(T integer) {
                if (integer instanceof GroupedObservable) {
                    GroupedObservable groupedObservable = (GroupedObservable) integer;
                    final Object key = groupedObservable.getKey();
                    groupedObservable.count().subscribe(new Action1() {
                        @Override
                        public void call(Object o) {
                            displayLogcat("groupedObservable key is " + key +
                                    " contains " + o + "numbers");
                        }
                    });
                } else if (integer instanceof Observable) {
                    Observable observable = (Observable) integer;
                    observable.subscribe(new Action1() {
                        @Override
                        public void call(Object o) {
                            displayLogcat("Observable call object is " + o);
                        }
                    });
                } else if (integer instanceof Notification) {
                    displayLogcat("value = " + ((Notification) integer).getValue() + " kind = " +
                        ((Notification) integer).getKind());
                } else if (integer instanceof Timestamped) {
                    displayLogcat("value = " + ((Timestamped) integer).getValue() + " = timestamp = " +
                        ((Timestamped) integer).getTimestampMillis());
                } else if (integer instanceof TimeInterval) {
                    displayLogcat("value = " + ((TimeInterval) integer).getValue() + " = timestamp = " +
                            ((TimeInterval) integer).getIntervalInMilliseconds());
                } else {
                    displayLogcat("onNext integer is " + integer);
                }
            }
        };
    }

    protected void displayLogcat(String message) {
        if (mLogcatView != null) {
            String text = mLogcatView.getText().toString();
            mLogcatView.setText(text + "\n" + message);
        }
    }
}
