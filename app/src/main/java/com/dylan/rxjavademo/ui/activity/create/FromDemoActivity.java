package com.dylan.rxjavademo.ui.activity.create;

import com.dylan.rxjavademo.ui.activity.DemoActivity;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-上午10:58
 */
public class FromDemoActivity extends DemoActivity {
    private String[] array = new String[5];
    private List<String> list = new ArrayList<>();
    @Override
    protected void createObservable() {
        super.createObservable();
        initData();
//        mObservable = Observable.from(array);
        mObservable = Observable.from(list);
    }

    private void initData() {
        for (int i = 0; i < 5; i++) {
            String string = "item" + i;
            array[i] = string;
            list.add(string);
        }
    }
}
