package com.example.smartbabies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class mylistadapter extends ArrayAdapter<listview> {
    Context context;
    int resource;
    List<listview>list;
    public mylistadapter(Context context, int resource, List<listview>list){
        super(context, resource, list);
        this.context=context;
        this.resource=resource;
        this.list=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
