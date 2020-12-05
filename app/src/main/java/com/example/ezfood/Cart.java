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

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    private String foodName;
    private String foodPrice;
    private Integer picture;
    private TextView foodNameView, foodPriceView;
    private ImageView foodPicture;
    Context context;
    public static ArrayList<ExampleItem> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_list);
        Button btnOrderMore = null;
        Button cancel = null;

        foodNameView = findViewById(R.id.nama);
        foodPriceView = findViewById(R.id.price);
        foodPicture = findViewById(R.id.order1);
        Intent intent = getIntent();
        ExampleItem item = (ExampleItem) intent.getSerializableExtra("item");
        foodName = item.getmText1();
        foodPrice = item.getmText2();
        picture = item.getmImageResource();

        foodNameView.setText(foodName);
        foodPriceView.setText("Rp. "+ foodPrice);
        foodPicture.setImageResource(picture);
    }

    public static void insertCart(ExampleItem cart){
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(cart);
    }

    public void orderMore(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(context,"Item was addded to cart",Toast.LENGTH_SHORT).show();
    }

    public void cancel(View view) {
            finish();
        Toast.makeText(context,"Order Cancelled",Toast.LENGTH_SHORT).show();
    }
}