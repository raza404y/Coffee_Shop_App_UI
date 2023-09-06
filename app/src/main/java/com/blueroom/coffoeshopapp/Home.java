package com.blueroom.coffoeshopapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    boolean isVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        ImageView imageView = findViewById(R.id.imageView12);
        ConstraintLayout view22 = findViewById(R.id.view222);

        imageView.setOnClickListener(view -> {

            isVisible = !isVisible;

            if (isVisible) {
                view22.setVisibility(View.VISIBLE);
            }else {
                view22.setVisibility(View.GONE);
            }
        });


    }
}