package com.stasyorl.recipebooks;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stasyorl.recipebooks.mainAdapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    RecyclerView recyclerView; //объявляем RecyclerView
//    RecyclerViewAdapter adapter; //объявляем adapter

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


    @Override
    protected void onResume() {
        super.onResume();

        setCategoryRecycler();
    }

    private void getImages(){
        newCategoryTitles.add("Category 1");
        newCategoryTitles.add("Category 2");
        newCategoryTitles.add("Category 3");


        newDescription.add("Recipe1");
        newImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        newNames.add("pamparam");
        newTimes.add("3 hours");
        newRatingBars.add(3);


        newDescription.add("Recipe2");
        newImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        newNames.add("pamparam");
        newTimes.add("1 hours");
        newRatingBars.add(5);

        newDescription.add("Recipe3");
        newImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        newNames.add("tinderin");
        newTimes.add("2 hours");
        newRatingBars.add(2);

        newDescription.add("Recipe4");
        newImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        newNames.add("lalala");
        newTimes.add("6 hours");
        newRatingBars.add(2);

        newDescription.add("Recipe5");
        newImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
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

//    RecyclerView recyclerView; //объявляем RecyclerView
//    RecyclerView insideList;
//    RecyclerViewAdapter adapter; //объявляем adapter
//    LinearLayoutManager layoutManager;//объявляем LinearLayoutManager
//
//    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        recyclerView = findViewById(R.id.main_container);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
//        recyclerView.setLayoutManager(layoutManager);
//        insideList = findViewById(R.id.container);
//
//        generateItem();
//    }
//
//    private void generateItem() {
//        List<CategoryItem> itemList = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            itemList.add(new CategoryItem("Category"+i, insideList));
//        }
//        adapter = new RecyclerViewAdapter(this, itemList);
//        recyclerView.setAdapter(adapter);
//}
}