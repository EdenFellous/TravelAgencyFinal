package com.travel.mytravelagency;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3_CityPage extends AppCompatActivity {
    public static City currentCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_city_page);



        // Retrieve data that was sent from previous activity
//        Bundle bundle = getIntent().getExtras();
        City city = MainActivity3_CityPage.currentCity ; //(City) bundle.getSerializable("City");
        getSupportActionBar().setTitle(city.getCityName());

        RecyclerView recyclerView = findViewById(R.id.galleryRecyclerView);
        recyclerView.setHasFixedSize(false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new ImageGalleryAdapter(city.getGalleryImages()));

        TextView aboutTitle = findViewById(R.id.aboutTitle);
        aboutTitle.setText("About");
        TextView aboutBody = findViewById(R.id.aboutBody);
        aboutBody.setText(city.getAboutDescription());

        TextView exploreTitle = findViewById(R.id.exploreTitle);
        exploreTitle.setText("Top 5 Things to Explore");
        TextView exploreBody = findViewById(R.id.exploreBody);
        exploreBody.setText(city.getTop5());




    }
}