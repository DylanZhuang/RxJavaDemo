package com.dylan.rxjavademo.ui.activity.aggreate;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/6-下午3:15
 */
public class CountDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getString(R.string.aggreate_item_count_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.count);
    }
}
