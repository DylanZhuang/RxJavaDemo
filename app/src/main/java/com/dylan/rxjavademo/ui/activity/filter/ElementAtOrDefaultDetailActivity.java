package com.dylan.rxjavademo.ui.activity.filter;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午7:59
 */
public class ElementAtOrDefaultDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getResources().getString(R.string.filter_item_element_at_or_default_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.element_at_or_default);
    }
}
