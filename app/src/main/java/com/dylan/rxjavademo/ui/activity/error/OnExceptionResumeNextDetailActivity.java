package com.dylan.rxjavademo.ui.activity.error;

import android.os.Bundle;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.ui.activity.DetailActivity;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/28-下午8:42
 */
public class OnExceptionResumeNextDetailActivity extends DetailActivity {
    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        String introduce = mContext.getResources().getString(R.string.error_item_on_exception_resume_next_introduce);
        mIntroduceView.setText(introduce);
        mBgView.setImageResource(R.drawable.on_exception_resume_next);
    }
}
