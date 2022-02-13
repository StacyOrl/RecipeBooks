package com.stasyorl.recipebooks.adapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stasyorl.recipebooks.R;
import com.stasyorl.recipebooks.mainAdapter.RecyclerViewAdapter;
import com.stasyorl.recipebooks.models.AllCategories;
import com.stasyorl.recipebooks.models.Item;

import java.util.ArrayList;
import java.util.List;

public class InnerMainActivity extends AppCompatActivity {
    RecyclerView recyclerView; //объявляем RecyclerView
    RecyclerViewAdapter adapter; //объявляем adapter

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mCategoryTitles = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();
    private ArrayList<String> mTimes = new ArrayList<>();
    private final ArrayList<Integer> mRatingBars = new ArrayList<>();



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<AllCategories> allCategories = new ArrayList<>();
        getImages();
        setCategoryRecycler();
        setContentView(R.layout.activity_main);
//
//        recyclerView = findViewById(R.id.container);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, true);
//        recyclerView.setLayoutManager(layoutManager);
//
//        generateItem();
    }

//    private void generateItem() {
//        List<Item> itemList = new ArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            itemList.add(new Item(
//                    "Pizza "+i,
//                    "100000$",
//                    "https://image.shutterstock.com/z/stock-photo-heart-pizza-with-mozzarella-and-tomatoes-on-a-slate-valentine-s-day-date-food-concept-1569808198.jpg", "1", 2));
//
//        }
//        adapter = new MyRecyclerViewAdapter(this, itemList);
//        recyclerView.setAdapter(adapter);
//    }

    private void getImages(){
        mCategoryTitles.add("Category 1");
        mCategoryTitles.add("Category 2");
        mCategoryTitles.add("Category 3");


        mDescription.add("Lorem Ipsum");
        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Havasu Falls");
        mTimes.add("3 hours");
        mRatingBars.add(3);


        mDescription.add("Lorem Ipsum2");
        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");
        mTimes.add("1 hours");
        mRatingBars.add(5);

        mDescription.add("Lorem Ipsum3");
        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");
        mTimes.add("2 hours");
        mRatingBars.add(2);

        mDescription.add("Lorem Ipsum4");
        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");
        mTimes.add("6 hours");

        mDescription.add("Lorem Ipsum5");
        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");
        mTimes.add("3 hours");

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
        recyclerView = findViewById(R.id.main_container);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mCategoryTitles, mDescription, mTimes, mRatingBars);
        recyclerView.setAdapter(adapter);
    }

}
