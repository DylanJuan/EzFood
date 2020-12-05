package com.example.ezfood;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.FoodViewHolder>  {

    private ArrayList<ExampleItem> itemList;
    private Context context;

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.example_item, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, final int position) {
        final ExampleItem item = itemList.get(position);
        holder.picture.setImageResource(item.getmImageResource());
        holder.name.setText(item.getmText1());
        holder.price.setText("Rp. " + item.getmText2());
        holder.recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,order.class);
                intent.putExtra("item",item);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public ItemAdapter(ArrayList<ExampleItem> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    static class FoodViewHolder extends RecyclerView.ViewHolder {
        private ImageView picture;
        private TextView name, price;
        private RelativeLayout recycler;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView1);
            price = itemView.findViewById(R.id.textView2);
            recycler = itemView.findViewById(R.id.recycler1);
        }
    }


}
