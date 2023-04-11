package com.example.hospitalproject.UI;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hospitalproject.R;

import java.util.List;

/** Класс - адаптер для ListView. */
public class AdapterListView extends ArrayAdapter<String> {
    private LayoutInflater inflater;
    /** Макет элемента списка */
    private int layout;
    /** Список содержимых данны ListView */
    private List<String> items;
    /** Конструктор. */
    public AdapterListView(Context context, int resource, List<String> items) {
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    /** Получение и изменение компонетов
     * @param position позиция элемента
     * @param convertView представление элемента списка
     * @param parent родительский контейнер
     * @return view
     * */
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        String text = items.get(position);

        TextView textView = view.findViewById(R.id.TextViewList);
        textView.setText(text);

        return view;
    }
}
