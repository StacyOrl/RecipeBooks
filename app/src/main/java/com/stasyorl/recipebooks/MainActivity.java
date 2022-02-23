package com.stasyorl.recipebooks;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stasyorl.recipebooks.adapter.childItemRecyclerAdapter;
import com.stasyorl.recipebooks.mainAdapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> newNames = new ArrayList<>();
    private ArrayList<String> newImageUrls = new ArrayList<>();
    private ArrayList<String> newCategoryTitles = new ArrayList<>();
    private ArrayList<String> newDescription = new ArrayList<>();
    private ArrayList<String> newTimes = new ArrayList<>();
    private final ArrayList<Integer> newRatingBars = new ArrayList<>();




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List<AllCategories> allCategories = new ArrayList<>();
        getImages();
        setCategoryRecycler();


    }



    @Override
    protected void onResume() {
        super.onResume();

        setCategoryRecycler();
    }

    private void getImages(){
        newCategoryTitles.add("Category 1");
        newCategoryTitles.add("Category 2");
        newCategoryTitles.add("Category 3");
        newCategoryTitles.add("Category 4");



        newDescription.add("Recipe1");
        newImageUrls.add("https://images.immediate.co.uk/production/volatile/sites/30/2021/08/Sausage-and-mushroom-ragu-203c7d4.jpg");
        newNames.add("pamparam");
        newTimes.add("3 hours");
        newRatingBars.add(3);


        newDescription.add("Recipe2");
        newImageUrls.add("https://www.simplyrecipes.com/thmb/JWjdE8YwikAae0KZuyy6ZJW7Utw=/3000x2001/filters:no_upscale():max_bytes(150000):strip_icc()/Simply-Recipes-Homemade-Pizza-Dough-Lead-Shot-1c-c2b1885d27d4481c9cfe6f6286a64342.jpg");
        newNames.add("pamparam");
        newTimes.add("1 hours");
        newRatingBars.add(5);

        newDescription.add("Recipe3");
        newImageUrls.add("https://www.saveur.com/uploads/2020/11/20/Y7RZPFZEERAZVHJ2VHC2RXMEEY.jpg?quality=85&width=540");
        newNames.add("tinderin");
        newTimes.add("2 hours");
        newRatingBars.add(2);

        newDescription.add("Recipe4");
        newImageUrls.add("https://www.indianhealthyrecipes.com/wp-content/uploads/2019/11/samosa-recipe-480x270.jpg");
        newNames.add("lalala");
        newTimes.add("6 hours");
        newRatingBars.add(2);

        newDescription.add("Recipe5");
        newImageUrls.add("https://ichef.bbci.co.uk/food/ic/food_16x9_832/recipes/courgette_pakoras_83738_16x9.jpg");
        newNames.add("bambambam");
        newTimes.add("3 hours");
        newRatingBars.add(2);

//        mDescription.add("Lorem Ipsum6");
//        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
//        mNames.add("Frozen Lake");
//
//        mDescription.add("Lorem Ipsum7");
//        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
//        mNames.add("White Sands Desert");
//
//        mDescription.add("Lorem Ipsum8");
//        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
//        mNames.add("Austrailia");
//
//        mDescription.add("Lorem Ipsum9");
//        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
//        mNames.add("Washington");

    }
    private void setCategoryRecycler(){
        RecyclerView recyclerView = findViewById(R.id.main_container);
        recyclerView.setHasFixedSize(true);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(MainActivity.this, newNames, newImageUrls, newCategoryTitles, newDescription, newTimes, newRatingBars);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}