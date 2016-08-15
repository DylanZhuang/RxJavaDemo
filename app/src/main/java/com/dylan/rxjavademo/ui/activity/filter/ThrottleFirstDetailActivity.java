package com.dylan.rxjavademo.ui.activity.filter;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午4:40
 */
public class ThrottleFirstDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getResources().getString(R.string.filter_item_throttle_first_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.throttle_first);
    }
}
