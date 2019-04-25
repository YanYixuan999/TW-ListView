package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter {

    private Context context;
    private ArrayList<FirstActivity> module;
    private TextView tvModuleName;
    private ImageView ivImage;

    public ModuleAdapter(Content context, int resource, ArrayList<FirstActivity> objects){
        super(context, resource, objects);

        module = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvModuleName = rowView.findViewById(R.id.tvModuleName);
        ivImage = rowView.findViewById(R.id.imageView);

        FirstActivity module = module.get(position)
    }



}
