package com.dylan.rxjavademo.ui.activity.combine;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/27-下午8:22
 */
public class MergeDelayErrorDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getResources().getString(R.string.combine_item_merge_delay_error_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.merge_delay_error);
    }
}
