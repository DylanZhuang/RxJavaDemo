package com.dylan.rxjavademo.base.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * author   Dylan.zhuang
 * Date:    16/1/29-下午12:31
 */
public abstract class BaseRecyclerViewHolder extends RecyclerView.ViewHolder {

    protected abstract void initView(View itemView);

    public BaseRecyclerViewHolder(View itemView) {
        super(itemView);
        initView(itemView);
    }
}
