package com.stasyorl.recipebooks.models;

public class Item {
    private String name = null;
    private String description = null;
    private String image = null;
    private String time = null;
    private float rating = 0;

    public Item(String name, String description, String image, String time, float rating) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.time = time;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
