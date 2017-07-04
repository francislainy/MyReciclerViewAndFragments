package com.example.fcampos.myreciclerviewandfragments;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fcampos on 04/07/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<List_Item> mList_items;
    private Context mContext;

    public MyAdapter(List<List_Item> list_items, Context context) {
        mList_items = list_items;
        mContext = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        List_Item list_item = mList_items.get(position);
        holder.mHead.setText(list_item.getHead());
        holder.mDesc.setText(list_item.getDesc());
    }

    @Override
    public int getItemCount() {
        return mList_items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mHead;
        private TextView mDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            mHead = (TextView) itemView.findViewById(R.id.heading);
            mDesc = (TextView) itemView.findViewById(R.id.description);
        }
    }
}
