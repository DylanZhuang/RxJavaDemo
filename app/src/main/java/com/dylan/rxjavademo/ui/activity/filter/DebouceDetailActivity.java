package com.dylan.rxjavademo.ui.activity.filter;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;
import com.dylan.rxjavademo.util.common.StringUtil;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午4:29
 */
public class DebouceDetailActivity extends DetailActivity{
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = StringUtil.getString(mContext, R.string.fliter_item_debouce_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.debounce);
    }
}
