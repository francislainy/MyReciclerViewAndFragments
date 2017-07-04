package com.example.fcampos.myreciclerviewandfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fcampos on 04/07/2017.
 */

public class MyFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private List<List_Item> mList_items;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        mList_items = new ArrayList<>();

        for (int i=0; i<=10; i++) {
            List_Item list_item = new List_Item("Heading", "MyDescription");
            mList_items.add(list_item);
        }

        mAdapter = new MyAdapter(mList_items, getActivity().getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
