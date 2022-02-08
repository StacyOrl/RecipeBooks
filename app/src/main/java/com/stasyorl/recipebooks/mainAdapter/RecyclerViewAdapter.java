package com.stasyorl.recipebooks.mainAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.stasyorl.recipebooks.R;
import com.stasyorl.recipebooks.adapter.MyRecyclerViewHolder;
import com.stasyorl.recipebooks.models.CategoryItem;
import com.stasyorl.recipebooks.models.Item;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{
    Context mContext;
    List<CategoryItem> itemList;

    public RecyclerViewAdapter(Context mContext, List<CategoryItem>
            itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.item_main,parent,false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.categoryText.setText(itemList.get(position).getCategoryText());


    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
