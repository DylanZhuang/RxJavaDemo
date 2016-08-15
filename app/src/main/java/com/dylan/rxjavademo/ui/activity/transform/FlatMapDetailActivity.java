package com.dylan.rxjavademo.ui.activity.transform;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;
import com.dylan.rxjavademo.util.common.StringUtil;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午3:10
 */
public class FlatMapDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = StringUtil.getString(mContext, R.string.transform_item_flap_map_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.flat_map);
    }
}
