package com.dylan.rxjavademo.ui.presenter;

import android.content.Context;
import android.util.SparseArray;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.util.common.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午9:10
 */
public class MainPresenter {
    private Context mContext;

    public MainPresenter(Context context) {
        mContext = context;
    }

    public List<String> getViewPagerTitles() {
        String[] array = mContext.getResources().getStringArray(R.array.main_tab_array);
        List<String> list = Arrays.asList(array);
        return list;
    }

}
