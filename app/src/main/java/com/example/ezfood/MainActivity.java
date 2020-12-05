package com.example.ezfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public RelativeLayout food_col;
    public RelativeLayout drink_col;
    public RelativeLayout snack_col;
    public RelativeLayout topup_col;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food_col = findViewById(R.id.food_col);
        drink_col = findViewById(R.id.drink_col);
        snack_col = findViewById(R.id.snack_col);
        topup_col = findViewById(R.id.topup_col);

        food_col.setOnClickListener(this);
        drink_col.setOnClickListener(this);
        snack_col.setOnClickListener(this);
        topup_col.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.food_col :
                i = new Intent(this,food_list.class);
                startActivity(i);
                break;
            case R.id.drink_col :
                i = new Intent(this,drink_list.class);
                startActivity(i);
                break;

            case R.id.snack_col :
                i = new Intent(this,snack_list.class);
                startActivity(i);
                break;
            case R.id.topup_col:
                i = new Intent(this,TopupActivity.class);
                startActivity(i);
                break;

        }
    }
}