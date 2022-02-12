package com.stasyorl.recipebooks.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.stasyorl.recipebooks.R;
import com.stasyorl.recipebooks.models.Item;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder>{
    private Context mContext;
    private List<Item> itemList;


    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();
    private ArrayList<String> mTimes = new ArrayList<>();
    private ArrayList<Integer> mRatingBars = new ArrayList<>();



//    public MyRecyclerViewAdapter(Context mContext, List<Item>
//            itemList) {
//        this.mContext = mContext;
//        this.itemList = itemList;
//    }

    public MyRecyclerViewAdapter(Context mContext, ArrayList<String> mNames, ArrayList<String> mImageUrls,
                                 ArrayList<String> mDescription, ArrayList<String> mTimes, ArrayList<Integer> mRatingBars) {
        this.mContext = mContext;
        this.mNames = mNames;
        this.mImageUrls = mImageUrls;
        this.mDescription = mDescription;
        this.mTimes = mTimes;
        this.mRatingBars = mRatingBars;
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
                .load(mImageUrls.get(position))
                .into(holder.cardImg);
        holder.cardName.setText(mNames.get(position));
        holder.cardDescription.setText(mDescription.get(position));
        holder.cardTime.setText(mTimes.get(position));
        holder.cardRating.setRating(mRatingBars.get(position));
    }

    @Override
    public int getItemCount() {
        return mNames.size();
    }
}

