package com.blueroom.coffoeshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CoffeeShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeeshop);

        Button button = findViewById(R.id.button);


        button.setOnClickListener(view -> {

            Intent intent = new Intent(CoffeeShopActivity.this,WelcomeBack.class);
            startActivity(intent);

        });

    }
}