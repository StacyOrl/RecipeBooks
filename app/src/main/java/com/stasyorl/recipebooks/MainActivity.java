package com.stasyorl.recipebooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.stasyorl.recipebooks.adapter.MyRecyclerViewAdapter;
import com.stasyorl.recipebooks.mainAdapter.RecyclerViewAdapter;
import com.stasyorl.recipebooks.models.CategoryItem;
import com.stasyorl.recipebooks.models.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView; //объявляем RecyclerView
    RecyclerView insideList;
    RecyclerViewAdapter adapter; //объявляем adapter
    LinearLayoutManager layoutManager;//объявляем LinearLayoutManager

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_container);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        insideList = findViewById(R.id.container);

        generateItem();
    }

    private void generateItem() {
        List<CategoryItem> itemList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            itemList.add(new CategoryItem("Category"+i, insideList));
        }
        adapter = new RecyclerViewAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}