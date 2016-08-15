package com.dylan.rxjavademo.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.base.activity.BaseActivity;
import com.dylan.rxjavademo.ui.util.DetailUtil;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/21-上午11:59
 */
public abstract class DetailActivity extends BaseActivity {
    protected static final String PAGE_TYPE = "page_type";
    protected static final String ITEM_TYPE = "item_type";
    protected static final String TITLE = "title";

    protected int mPageType;

    protected int mItemType;

    private String mTitle;

    protected int mRandom = -1;

    private CollapsingToolbarLayout mCollapsingToolbarLayout;

    private FloatingActionButton mFloatingActionButton;

    protected TextView mIntroduceView;

    protected ImageView mBgView;

    public static void gotoActivity(Context context, int pageType, int itemType, String title) {
        Class<?> detailClass = DetailUtil.getClass(pageType, itemType, false);
        if (detailClass == null) {
            return;
        }
        Intent intent = new Intent(context, detailClass);
        Bundle bundle = new Bundle();
        bundle.putInt(PAGE_TYPE, pageType);
        bundle.putInt(ITEM_TYPE, itemType);
        bundle.putString(TITLE, title);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_detail;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mToolbar = (Toolbar) findViewById(R.id.tool_bar_list_item);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout_list_item);
        if (!TextUtils.isEmpty(mTitle)) {
            mCollapsingToolbarLayout.setTitle(mTitle);
        }
        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fabtn_demo);
        mIntroduceView = (TextView) findViewById(R.id.tv_introduce);
        mBgView = (ImageView) findViewById(R.id.iv_detail);
        setListener();
    }

    @Override
    protected void handleIntent(Intent intent) {
        super.handleIntent(intent);
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            mPageType = bundle.getInt(PAGE_TYPE);
            mItemType = bundle.getInt(ITEM_TYPE);
            mTitle = bundle.getString(TITLE);
        }
    }

    private void setListener() {
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoActivity.gotoActivity(mContext, mPageType, mItemType, mTitle, mRandom);

            }
        });
    }
}
