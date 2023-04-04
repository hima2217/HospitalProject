package com.example.hospitalproject;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterListView extends ArrayAdapter<String> {
    private LayoutInflater inflater;
    private int layout;
    private List<String> items;

    public AdapterListView(Context context, int resource, List<String> items) {
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        String text = items.get(position);

        TextView textView = view.findViewById(R.id.TextViewList);
        textView.setText(text);

        return view;
    }
}
