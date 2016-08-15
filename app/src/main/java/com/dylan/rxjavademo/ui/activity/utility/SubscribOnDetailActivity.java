package com.dylan.rxjavademo.ui.activity.utility;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/30-下午4:30
 */
public class SubscribOnDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getString(R.string.utility_item_subscrib_on_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.subscribe_on);
    }
}
