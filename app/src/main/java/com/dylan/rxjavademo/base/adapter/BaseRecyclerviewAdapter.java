package com.dylan.rxjavademo.base.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * author   Dylan.zhuang
 * Date:    16/1/29-下午12:28
 */
public abstract class BaseRecyclerviewAdapter<T> extends RecyclerView.Adapter<BaseRecyclerViewHolder> {
    protected List<T> mList;

    protected Context mContext;

    protected LayoutInflater mInflater;

    protected abstract BaseRecyclerViewHolder getViewHolder(ViewGroup parent);

    protected abstract void onBindViewHolderItem(BaseRecyclerViewHolder holder, T item);

    public BaseRecyclerviewAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mList = new ArrayList<T>();
    }

    public void addItems(List<T> list) {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    public void addItem(T item) {
        if (mList != null) {
            mList.add(item);
            notifyItemInserted(mList.size() - 1);
        }
    }

    public void removeItem(int position) {
        if (mList != null && mList.size() > position) {
            mList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public List<T> getList() {
        return mList;
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseRecyclerViewHolder viewHolder = getViewHolder(parent);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {
        T item = mList.get(position);
        onBindViewHolderItem(holder, item);
    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }
}
