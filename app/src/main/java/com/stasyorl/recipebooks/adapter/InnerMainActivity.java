package com.stasyorl.recipebooks.adapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stasyorl.recipebooks.R;
import com.stasyorl.recipebooks.models.Item;

import java.util.ArrayList;
import java.util.List;

public class InnerMainActivity extends AppCompatActivity {
    RecyclerView recyclerView; //объявляем RecyclerView
    MyRecyclerViewAdapter adapter; //объявляем adapter
    LinearLayoutManager layoutManager;//объявляем LinearLayoutManager

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_main);

        recyclerView = findViewById(R.id.container);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, true);
        recyclerView.setLayoutManager(layoutManager);

        generateItem();
    }

    private void generateItem() {
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            itemList.add(new Item(
                    "Pizza "+i,
                    "100000$",
                    "https://image.shutterstock.com/z/stock-photo-heart-pizza-with-mozzarella-and-tomatoes-on-a-slate-valentine-s-day-date-food-concept-1569808198.jpg", "1", 2));

        }
        adapter = new MyRecyclerViewAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}
