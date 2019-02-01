package com.blogspot.yashas003.reyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageBitmaps();
    }

    private void imageBitmaps() {
        mImageUrls.add("https://images.pexels.com/photos/313032/pexels-photo-313032.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1677275/pexels-photo-1677275.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1660966/pexels-photo-1660966.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/672630/pexels-photo-672630.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1649735/pexels-photo-1649735.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1661674/pexels-photo-1661674.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1649804/pexels-photo-1649804.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/965157/pexels-photo-965157.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1679011/pexels-photo-1679011.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1122462/pexels-photo-1122462.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1656770/pexels-photo-1656770.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/103651/pexels-photo-103651.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/928475/pexels-photo-928475.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/872795/pexels-photo-872795.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1649091/pexels-photo-1649091.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1262302/pexels-photo-1262302.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        mImageUrls.add("https://images.pexels.com/photos/1282293/pexels-photo-1282293.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        putInRecyclerView();
    }

    private void putInRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter =
                new StaggeredRecyclerViewAdapter(this, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);
    }
}
