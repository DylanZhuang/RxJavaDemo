package com.dylan.rxjavademo.base.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午4:22
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;

    protected Toolbar mToolbar;

    protected ActionBar mActionBar;

    protected abstract int getContentViewId();

    protected abstract void initView(Bundle savedInstanceState);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int contentViewId = getContentViewId();
        if (contentViewId == 0) {
            throw new IllegalArgumentException("contentViewId is null");
        }
        setContentView(contentViewId);

        mContext = this;

        if (getIntent() != null) {
            handleIntent(getIntent());
        }
        initView(savedInstanceState);
        setActionBar();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finishActivity();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    protected void handleIntent(Intent intent) {
    }

    protected int getFragmentContentId() {
        return -1;
    }

    private void setActionBar() {
        if (mToolbar == null) {
            return;
        }
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void finishActivity() {
        if (!isFinishing()) {
            finish();
        }
    }

}
