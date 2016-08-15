package com.dylan.rxjavademo.base.mvp;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/22-下午5:12
 */
public class BasePresenter<T extends MvpView> implements Presenter<T> {
    private MvpView mvpView;

    @Override
    public void attachView(T mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void detachView() {
        this.mvpView = null;
    }

    protected MvpView getMvpView() {
        return mvpView;
    }
}
