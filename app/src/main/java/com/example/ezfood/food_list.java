package com.example.ezfood;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class food_list extends AppCompatActivity {
    private RecyclerView mRecylerView;
    private ItemAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.food1,"Pork Minced Rice with Eggs","38000"));
        exampleList.add(new ExampleItem(R.drawable.food2,"Classic Chicken Wings","35000"));
        exampleList.add(new ExampleItem(R.drawable.food3,"Fresh Greece Salad","28000"));

        mRecylerView = findViewById(R.id.recyclerView);
        mRecylerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ItemAdapter(exampleList,this);
        mRecylerView.setLayoutManager(mLayoutManager);
        mRecylerView.setAdapter(mAdapter);

    }
}
