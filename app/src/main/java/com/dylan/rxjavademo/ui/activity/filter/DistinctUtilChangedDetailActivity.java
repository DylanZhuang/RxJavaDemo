package com.dylan.rxjavademo.ui.activity.filter;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/26-下午7:44
 */
public class DistinctUtilChangedDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getResources().getString(R.string.filter_item_distinct_util_changed_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.distinct_until_changed);
    }
}
