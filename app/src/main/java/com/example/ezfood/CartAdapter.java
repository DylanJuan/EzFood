package com.example.ezfood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartAdapter  extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    private ArrayList<ExampleItem> orderList;
    private Context context;

    @NonNull
    @Override
    public CartViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cart_list,parent,false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, final int position) {
        final ExampleItem item = orderList.get(position);
        holder.picture.setImageResource(item.getmImageResource());
        holder.name.setText(item.getmText1());
        holder.price.setText("Rp. "+item.getmText2());
        holder.recylcerCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Cart.class);
                intent.putExtra("item",item);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public CartAdapter(ArrayList<ExampleItem>orderList,Context context){
        this.orderList =orderList;
        this.context = context;
    }


    static class CartViewHolder extends RecyclerView.ViewHolder {
        private ImageView picture;
        private TextView name,price;
        private RelativeLayout recylcerCart;
        public CartViewHolder(@NonNull View view) {
            super(view);
            picture=view.findViewById(R.id.imageViewCart);
            name=view.findViewById(R.id.textViewCart1);
            price=view.findViewById(R.id.textViewCart2);
            recylcerCart=view.findViewById(R.id.recyclerCart);

        }
    }
}

