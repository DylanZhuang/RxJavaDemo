package com.dylan.rxjavademo.ui.activity.combine;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/27-上午11:59
 */
public class ZipDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getResources().getString(R.string.combine_item_zip_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.zip);
    }
}
