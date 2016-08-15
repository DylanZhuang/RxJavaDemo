package com.dylan.rxjavademo.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.base.activity.BaseActivity;
import com.dylan.rxjavademo.ui.adapter.CustomFragmentPagerAdapter;
import com.dylan.rxjavademo.ui.fragment.ListFragment;
import com.dylan.rxjavademo.ui.presenter.MainPresenter;
import com.dylan.rxjavademo.ui.view.CustomViewPager;
import com.dylan.rxjavademo.util.common.ToastUtil;

import java.util.List;

public class MainActivity extends BaseActivity {
//    private NavigationView mNavigationView;

    private DrawerLayout mDrawerLayout;

    private TabLayout mTabLayout;

    private CustomViewPager mViewPager;

    private MainPresenter mPresenter;

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_main);
//        mNavigationView = (NavigationView) findViewById(R.id.nv_main);
        mToolbar = (Toolbar) findViewById(R.id.tool_bar_main);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout_main);
        mViewPager = (CustomViewPager) findViewById(R.id.custom_vp_main);

        mPresenter = new MainPresenter(mContext);
        setListener();
        setViewPager();
    }

    private void setViewPager() {
        if (mPresenter == null) {
            return;
        }
        CustomFragmentPagerAdapter adapter = new CustomFragmentPagerAdapter(getSupportFragmentManager());
        List<String> titleList = mPresenter.getViewPagerTitles();
        int size = titleList.size();
        for (int i = 0; i < size; i++) {
            String title = titleList.get(i);
            adapter.addFragment(ListFragment.getInstance(i), title);
        }
        mViewPager.setOffscreenPageLimit(adapter.getCount());
        mViewPager.setAdapter(adapter);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void setListener() {
//        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(MenuItem item) {
//                handleMainMenu(item);
//                return true;
//            }
//        });
    }

    private void handleMainMenu(MenuItem item) {
        if (item == null) {
            return;
        }
        String message = "";
        switch (item.getItemId()) {
            case R.id.menu_main_item1:
                message = "menu_main_item1";
                break;
            case R.id.menu_main_item2:
                message = "menu_main_item2";
                break;
            case R.id.menu_main_item3:
                message = "menu_main_item3";
                break;
        }
        item.setChecked(true);
        mDrawerLayout.closeDrawers();
        ToastUtil.showShortToast(mContext, message);
    }

}
