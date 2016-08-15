package com.dylan.rxjavademo.ui.activity.combine;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/27-上午11:56
 */
public class MergeDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getResources().getString(R.string.combine_item_merge_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.merge);
    }
}
