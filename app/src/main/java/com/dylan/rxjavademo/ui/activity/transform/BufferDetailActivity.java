package com.dylan.rxjavademo.ui.activity.transform;

import android.os.Bundle;
import android.text.TextUtils;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;
import com.dylan.rxjavademo.util.common.StringUtil;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/25-下午3:10
 */
public class BufferDetailActivity extends DetailActivity {
    protected static final int MAX = 2;
    protected static final int MIN = 1;

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        mRandom = (int) (MIN + Math.random() * (MAX - MIN + 1));

        int resId = -1;
        String introduce = "";
        if (mRandom == MAX) {
            introduce = StringUtil.getString(mContext, R.string.transform_item_buffer_introduce2);
            resId = R.drawable.buffer2;
        } else {
            introduce = StringUtil.getString(mContext, R.string.transform_item_buffer_introduce1);
            resId = R.drawable.buffer1;
        }
        if (!TextUtils.isEmpty(introduce)) {
            mIntroduceView.setText(introduce);
        }
        if (resId != -1) {
            mBgView.setImageResource(resId);
        }
    }
}
