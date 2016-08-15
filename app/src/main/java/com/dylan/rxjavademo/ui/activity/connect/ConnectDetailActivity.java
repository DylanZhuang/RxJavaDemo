package com.dylan.rxjavademo.ui.activity.connect;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/8/8-上午11:19
 */
public class ConnectDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getString(R.string.connect_item_connect_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.publish_connect);
    }
}
