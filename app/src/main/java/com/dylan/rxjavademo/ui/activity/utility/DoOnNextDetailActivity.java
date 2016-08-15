package com.dylan.rxjavademo.ui.activity.utility;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/30-下午4:28
 */
public class DoOnNextDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getString(R.string.utility_item_do_on_next_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.do_on_next);
    }
}
