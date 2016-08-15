package com.dylan.rxjavademo.ui.activity.transform;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;
import com.dylan.rxjavademo.util.common.StringUtil;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午7:52
 */
public class ConcatMapDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = StringUtil.getString(mContext, R.string.transform_item_concat_map_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.concat_map);
    }
}
