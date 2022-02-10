package com.stasyorl.recipebooks.models;

import java.util.ArrayList;

public class AllCategories {

    ArrayList<String> categoryTitle;
    String Url;

    public AllCategories(ArrayList<String> categoryTitle, String Url) {
        this.categoryTitle = categoryTitle;
        this.Url = Url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public ArrayList<String> getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(ArrayList<String> categoryTitle) {
        this.categoryTitle = categoryTitle;
    }
}
