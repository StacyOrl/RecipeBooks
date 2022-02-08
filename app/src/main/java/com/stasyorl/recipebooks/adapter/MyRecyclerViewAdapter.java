package com.stasyorl.recipebooks.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.stasyorl.recipebooks.R;
import com.stasyorl.recipebooks.models.Item;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder>{
    private Context mContext;
    private List<Item> itemList;

    public MyRecyclerViewAdapter(Context mContext, List<Item>
            itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.item,parent,false);
        return new MyRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder
                                         holder, int position) {
        Glide.with(mContext)
                .load(itemList.get(position).getImage())
                .into(holder.cardImg);
        holder.cardName.setText(itemList.get(position).getName());
        holder.cardDescription.setText(itemList.get(position).getDescription());
        holder.cardTime.setText(itemList.get(position).getTime());
        holder.cardRating.setRating(itemList.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

