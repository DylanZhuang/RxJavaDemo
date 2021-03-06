package com.dylan.rxjavademo.ui.activity.create;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;
import com.dylan.rxjavademo.util.common.StringUtil;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/21-下午6:21
 */
public class CreateDetailActivity extends DetailActivity {

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = StringUtil.getString(mContext, R.string.create_item_create_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.create);
    }
}
