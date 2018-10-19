package com.example.android.cookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView cookingPic;
    private Button cookBotton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cookingPic = findViewById(R.id.cooking_iv);

        final int[] cookingArray= new int[]{
                R.drawable.cooking0,
                R.drawable.cooking1,
                R.drawable.cooking2,
                R.drawable.cooking3,
                R.drawable.cooking4,
                R.drawable.cooking5,
                R.drawable.cooking6
        };

        cookBotton = findViewById(R.id.cook_button);
        cookBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();
                int number= randomNumber.nextInt(7);
                int imageCook = cookingArray[number];
                cookingPic.setImageResource(imageCook);
            }
        });
        
    }
}
