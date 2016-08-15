package com.dylan.rxjavademo.base.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dylan.rxjavademo.base.activity.BaseActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午5:35
 */
public abstract class BaseFragment extends Fragment {
    protected BaseActivity mAttachActivity;

    protected Context mContext;

    protected View mBaseView;
    //第一次onresume
    private boolean isFirstResume = true;
    //第一次展示
    private boolean isFirstVisible = true;
    //第一次隐藏
    private boolean isFirstInvisible = true;

    private boolean isPrepared;

    protected abstract int getLayoutId();

    protected abstract void initViews(Bundle savedInstanceState);

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mAttachActivity = (BaseActivity) activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();

        if (getArguments() != null) {
            handleBundle(getArguments());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layoutId = getLayoutId();
        if (layoutId != 0) {
            mBaseView = inflater.inflate(getLayoutId(), null);
            initViews(savedInstanceState);
            return mBaseView;
        } else {
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initPrepare();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (isFirstResume) {
            isFirstResume = false;
            return;
        }

        if (getUserVisibleHint()) {
            onUserVisible();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            onUserInvisible();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            if (isFirstVisible) {
                isFirstVisible = false;
                initPrepare();
            } else {
                onUserVisible();
            }
        } else {
            if (isFirstInvisible) {
                isFirstInvisible = false;
                onFirstUserInVisible();
            } else {
                onUserInvisible();
            }
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mAttachActivity = null;
    }

    protected void handleBundle(Bundle bundle) {
    }

    protected void onFirstUserVisible() {
    }

    protected void onUserVisible() {
    }

    protected void onUserInVisible() {
    }

    protected void onFirstUserInVisible() {
    }

    protected void onUserInvisible() {
    }

    private synchronized void initPrepare() {
        if (isPrepared) {
            onFirstUserVisible();
        } else {
            isPrepared = true;
        }
    }
}
