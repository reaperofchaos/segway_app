package com.example.segwayrentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rentButton = findViewById(R.id.btnRent);

        rentButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setContentView(R.layout.activity_segway_rental_screen);
            }
        });
    }
}