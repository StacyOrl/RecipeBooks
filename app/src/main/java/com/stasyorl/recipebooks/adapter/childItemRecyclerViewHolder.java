package com.stasyorl.recipebooks.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stasyorl.recipebooks.R;

public class childItemRecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView cardName, cardDescription, cardTime;
    RatingBar cardRating;
    ImageView cardImg;

    public childItemRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        cardName = itemView.findViewById(R.id.card_item_name);
        cardDescription = itemView.findViewById(R.id.card_item_description);
        cardTime = itemView.findViewById(R.id.card_item_time);
        cardImg = itemView.findViewById(R.id.card_image);
        cardRating = itemView.findViewById(R.id.ratingBar);
    }
}

