package com.stasyorl.recipebooks.mainAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stasyorl.recipebooks.R;
import com.stasyorl.recipebooks.adapter.childItemRecyclerAdapter;
import com.stasyorl.recipebooks.models.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{
    Context mContext;
    List<CategoryItem> itemList;

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mCategoryTitles = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();
    private ArrayList<String> mTimes = new ArrayList<>();
    private ArrayList<Integer> mRatingBars = new ArrayList<>();

    public RecyclerViewAdapter(Context mContext, ArrayList<String> mNames,
                               ArrayList<String> mImageUrls, ArrayList<String> mCategoryTitles, ArrayList<String> mDescription, ArrayList<String> mTimes, ArrayList<Integer> mRatingBars) {
        this.mContext = mContext;
        this.mNames = mNames;
        this.mImageUrls = mImageUrls;
        this.mCategoryTitles = mCategoryTitles;
        this.mDescription = mDescription;
        this.mTimes = mTimes;
        this.mRatingBars = mRatingBars;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.parent_item,parent,false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.categoryText.setText(mCategoryTitles.get(position));
        setCatItemRecycler(holder.categoryItemRecycler, mNames.get(position));
    }


    @Override
    public int getItemCount() {
        return mCategoryTitles.size();
    }

    private void  setCatItemRecycler(RecyclerView recyclerView, String categoryChildren ){
        childItemRecyclerAdapter childItemRecyclerAdapter = new childItemRecyclerAdapter(mContext, mNames, mImageUrls, mDescription, mTimes, mRatingBars );
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(childItemRecyclerAdapter);
    }}
