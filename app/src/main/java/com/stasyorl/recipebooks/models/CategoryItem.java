package com.stasyorl.recipebooks.models;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryItem {
    private String categoryText = null;
    private RecyclerView itemList = null;



    public CategoryItem(String categoryText, RecyclerView itemList) {
        this.categoryText = categoryText;
        this.itemList = itemList;
    }

    public String getCategoryText() {
        return categoryText;
    }

    public void setCategoryText(String categoryText) {
        this.categoryText = categoryText;
    }

    public RecyclerView getItemList() {
        return itemList;
    }

    public void setItemList(RecyclerView itemList) {
        this.itemList = itemList;
    }
}
