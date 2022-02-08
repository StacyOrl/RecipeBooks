package com.stasyorl.recipebooks.mainAdapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stasyorl.recipebooks.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView categoryText;
    RecyclerView categoryItem;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        categoryText = itemView.findViewById(R.id.category_text);
        categoryItem = itemView.findViewById(R.id.container);
    }
}
