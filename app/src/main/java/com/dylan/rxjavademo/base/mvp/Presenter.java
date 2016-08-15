package com.dylan.rxjavademo.base.mvp;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/22-下午5:10
 */
public interface Presenter<T extends MvpView> {
    void attachView(T mvpView);
    void detachView();
}
