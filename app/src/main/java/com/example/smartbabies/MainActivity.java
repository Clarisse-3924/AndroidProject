package com.example.smartbabies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<listview>list;
ListView list_item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<>();
        list.add(new listview(R.drawable.baby1,"Dress","5000 RWF", "Add To Cart"));
        list.add(new listview(R.drawable.baby2,"Dress","10000 RWF", "Add To Cart"));
        list.add(new listview(R.drawable.baby3,"Dress","6000 RWF", "Add To Cart"));
        list.add(new listview(R.drawable.baby4,"Trousers","15000 RWF", "Add To Cart"));
        list.add(new listview(R.drawable.baby5,"Trousers","7000 RWF", "Add To Cart"));
        list.add(new listview(R.drawable.baby6,"Shirt","5000 RWF", "Add To Cart"));
        list.add(new listview(R.drawable.baby7,"T-shirt","3000 RWF", "Add To Cart"));

        list_item=findViewById(R.id.list_item);
        mylistadapter adapter= new mylistadapter(this,R.layout.store,list);
        list_item.setAdapter(adapter);
    }
}