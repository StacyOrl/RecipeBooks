package com.stasyorl.recipebooks.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.stasyorl.recipebooks.R;
import com.stasyorl.recipebooks.RecipeDescription;
import com.stasyorl.recipebooks.models.Item;

import java.util.ArrayList;
import java.util.List;

public class childItemRecyclerAdapter extends RecyclerView.Adapter<childItemRecyclerAdapter.childItemRecyclerViewHolder> {
    private Context mContext;
    private List<Item> itemList;


    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();
    private ArrayList<String> mTimes = new ArrayList<>();
    private ArrayList<Integer> mRatingBars = new ArrayList<>();





    public childItemRecyclerAdapter(Context mContext, ArrayList<String> mNames, ArrayList<String> mImageUrls,
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
    public childItemRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.child_item, parent, false);
        return new childItemRecyclerViewHolder(itemView);


    }



    @Override
    public void onBindViewHolder(@NonNull childItemRecyclerViewHolder
                                         holder, int position) {
        Glide.with(mContext)
                .load(mImageUrls.get(position))
                .into(holder.cardImg);
        holder.cardName.setText(mNames.get(position));
        holder.cardDescription.setText(mDescription.get(position));
        holder.cardTime.setText(mTimes.get(position));
        holder.cardRating.setRating(mRatingBars.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, RecipeDescription.class);
                intent.putExtra("image_url", mImageUrls.get(holder.getAbsoluteAdapterPosition()));
                intent.putExtra("image_name", mImageUrls.get(holder.getAbsoluteAdapterPosition()));
                mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return mNames.size();
    }

    public class childItemRecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView cardName, cardDescription, cardTime;
        RatingBar cardRating;
        ImageView cardImg;
        CardView parentLayout;

        public childItemRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            cardName = itemView.findViewById(R.id.card_item_name);
            cardDescription = itemView.findViewById(R.id.card_item_description);
            cardTime = itemView.findViewById(R.id.card_item_time);
            cardImg = itemView.findViewById(R.id.card_image);
            cardRating = itemView.findViewById(R.id.ratingBar);
            parentLayout = itemView.findViewById(R.id.card_item);
        }


    }



}





