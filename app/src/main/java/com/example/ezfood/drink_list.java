package com.example.ezfood;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class drink_list extends AppCompatActivity {
    private RecyclerView mRecylerView;
    private RecyclerView.LayoutManager mLayoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drink_list);
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.lime,"Lime Juice","14000"));
        exampleList.add(new ExampleItem(R.drawable.orangejuice,"Orange Juice","14000"));
        exampleList.add(new ExampleItem(R.drawable.sodamint,"Iced Soda Mint","13000"));

        mRecylerView = findViewById(R.id.recyclerView);
        mRecylerView.setHasFixedSize(true);
        ItemAdapter mAdapter = new ItemAdapter(exampleList,this);
        mRecylerView.setAdapter(mAdapter);
        mLayoutManager = new LinearLayoutManager(this);
        mRecylerView.setLayoutManager(mLayoutManager);

    }
}
