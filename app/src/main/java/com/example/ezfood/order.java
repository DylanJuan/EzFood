package com.example.ezfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class order extends AppCompatActivity {

    private String foodName;
    private String foodPrice;
    private Integer picture;
    private TextView foodNameView, foodPriceView;
    private ImageView foodPicture;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Button btnOrderMore = null;
        Button cancel = null;

        foodPicture = findViewById(R.id.order1);
        foodNameView = findViewById(R.id.nama);
        foodPriceView = findViewById(R.id.price);
        Intent intent = getIntent();
        ExampleItem item = (ExampleItem) intent.getSerializableExtra("item");
        foodName = item.getmText1();
        foodPrice = item.getmText2();
        picture = item.getmImageResource();

        foodNameView.setText(foodName);
        foodPriceView.setText("Rp. "+ foodPrice);
        foodPicture.setImageResource(picture);
    }

    public void orderMore(View view){
        finish();
        Toast.makeText(context, "Item was Added", Toast.LENGTH_SHORT).show();
    }
    public void cancel(View view) {
        finish();
        Toast.makeText(context,"Order Cancelled",Toast.LENGTH_SHORT).show();
    }
}