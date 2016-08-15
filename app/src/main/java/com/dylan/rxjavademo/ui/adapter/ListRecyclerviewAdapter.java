package com.dylan.rxjavademo.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dylan.rxjavademo.R;
import com.dylan.rxjavademo.base.adapter.BaseRecyclerViewHolder;
import com.dylan.rxjavademo.base.adapter.BaseRecyclerviewAdapter;
import com.dylan.rxjavademo.ui.bean.ListBean;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/7/20-下午6:27
 */
public class ListRecyclerviewAdapter extends BaseRecyclerviewAdapter<ListBean> {
    private static final String TAG = "ListRecyclerviewAdapter";

    public ListRecyclerviewAdapter(Context context) {
        super(context);
    }

    @Override
    protected BaseRecyclerViewHolder getViewHolder(ViewGroup parent) {
        View view = mInflater.inflate(R.layout.list_item, parent, false);
        BaseRecyclerViewHolder viewHolder = new ListRecyclerviewViewHolder(view);
        return viewHolder;
    }

    @Override
    protected void onBindViewHolderItem(BaseRecyclerViewHolder holder, ListBean item) {
        if (item == null) {
            return;
        }
        ListRecyclerviewViewHolder viewHolder = (ListRecyclerviewViewHolder)holder;
        viewHolder.title.setText(item.title);
    }

    private class ListRecyclerviewViewHolder extends BaseRecyclerViewHolder {
        TextView title;

        public ListRecyclerviewViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void initView(View itemView) {
            title = (TextView) itemView.findViewById(R.id.tv_list_item_title);
        }
    }
}
