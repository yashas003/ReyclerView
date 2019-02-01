package com.blogspot.yashas003.reyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        getInfo();
    }

    private void getInfo() {
        String imageName = getIntent().getStringExtra("Image_names");
        String imageUrl = getIntent().getStringExtra("Image_Urls");

        ImageView image = findViewById(R.id.imageView);
        Picasso
                .get()
                .load(imageUrl)
                .into(image);

        TextView text = findViewById(R.id.textView);
        text.setText(imageName);
    }
}
