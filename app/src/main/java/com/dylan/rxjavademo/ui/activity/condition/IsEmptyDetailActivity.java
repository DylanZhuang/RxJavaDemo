package com.dylan.rxjavademo.ui.activity.condition;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/5-下午7:06
 */
public class IsEmptyDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getString(R.string.condition_item_is_empty_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.is_empty);
    }
}
