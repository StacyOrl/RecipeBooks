package com.stasyorl.recipebooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RecipeDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_description);
//        ActionBar actionBar = getSupportActionBar();
//
//        // showing the back button in action bar
//        actionBar.setDisplayHomeAsUpEnabled(true);
        getIncomingIntent();



    }

    // this event will enable the back
    // function to the button on press
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                this.finish();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    private void getIncomingIntent(){

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageUrl, imageName);
        }
    }

    private void setImage(String imageUrl, String imageName){

        TextView name = findViewById(R.id.name_example);
        name.setText(imageName);

        ImageView image = findViewById(R.id.image_example);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}