package com.dylan.rxjavademo.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.base.fragment.BaseFragment;
import com.dylan.rxjavademo.base.listener.OnRecyclerItemClickListener;
import com.dylan.rxjavademo.ui.PageType;
import com.dylan.rxjavademo.ui.activity.DetailActivity;
import com.dylan.rxjavademo.ui.adapter.ListRecyclerviewAdapter;
import com.dylan.rxjavademo.ui.bean.ListBean;
import com.dylan.rxjavademo.ui.presenter.ListPresenter;
import com.dylan.rxjavademo.util.common.ToastUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午5:52
 */
public class ListFragment extends BaseFragment {
    private static final String TAG = "ListFragment";

    private static final String TYPE = "type";

    private RecyclerView mRecyclerView;

    private ListRecyclerviewAdapter mAdapter;

    private List<ListBean> mList = new ArrayList<>();

    private int mType;

    private ListPresenter mPresenter;

    public static BaseFragment getInstance(int type) {
        ListFragment fragment = new ListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(TYPE, type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_list;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mPresenter = new ListPresenter(mContext);
        mRecyclerView = (RecyclerView) mBaseView.findViewById(R.id.recycler_view_fragment1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mAdapter = new ListRecyclerviewAdapter(mContext);
        mRecyclerView.setAdapter(mAdapter);
        setListener();
    }

    @Override
    protected void onFirstUserVisible() {
        Log.d(TAG, "onFirstUserVisible type = " + mType);
        super.onFirstUserVisible();
        if (mPresenter != null && mAdapter != null) {
            List<ListBean> list = mPresenter.getPageItemList(mType);
            mList.clear();
            mList.addAll(list);
            mAdapter.addItems(mList);
        }
    }

    @Override
    protected void handleBundle(Bundle bundle) {
        super.handleBundle(bundle);
        mType = bundle.getInt(TYPE);
    }

    private void setListener() {
        mRecyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(mRecyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int position = vh.getPosition();
                if (mList != null && mList.size() > position) {
                    ListBean item = mList.get(position);
                    DetailActivity.gotoActivity(mContext, mType, item.type, item.title);
                }
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }
        });
    }
}
