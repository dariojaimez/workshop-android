package com.jonurq.workshoptucuman.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jonurq.workshoptucuman.R;
import com.jonurq.workshoptucuman.model.Item;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private ArrayList<Item> items;

    public MyAdapter(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView != null) {
            view = convertView;
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        }

        TextView title = (TextView)view.findViewById(R.id.item_title);
        TextView amount = (TextView)view.findViewById(R.id.item_amount);

        title.setText(items.get(position).getTitle());
        amount.setText(items.get(position).getAmount());


        return view;
    }
}
