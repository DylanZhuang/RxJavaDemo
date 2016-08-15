package com.dylan.rxjavademo.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.TextUtils;

import com.dylan.rxjavademo.base.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午5:33
 */
public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {
    private final List<BaseFragment> mFragmentList = new ArrayList<>();
    private final List<String> mTitleList = new ArrayList<>();

    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(BaseFragment fragment, String title) {
        mFragmentList.add(fragment);
        mTitleList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position < mTitleList.size()) {
            String title = mTitleList.get(position);
            if (!TextUtils.isEmpty(title)) {
                return title;
            }
        }
        return super.getPageTitle(position);
    }
}
