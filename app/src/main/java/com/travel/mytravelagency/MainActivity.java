package com.travel.mytravelagency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.welcomeTextView);
        textView.setText(R.string.welcomeStr);

        Button welcomeButton = findViewById(R.id.welcomeButton);
        welcomeButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, MainActivity2_CityList.class);
                        startActivity(intent);
                    }
                }
        );
    }
}