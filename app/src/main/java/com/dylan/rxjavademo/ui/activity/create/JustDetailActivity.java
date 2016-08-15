package com.dylan.rxjavademo.ui.activity.create;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;
import com.dylan.rxjavademo.util.common.StringUtil;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/24-下午2:32
 */
public class JustDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = StringUtil.getString(mContext, R.string.create_item_just_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.just);
    }
}
