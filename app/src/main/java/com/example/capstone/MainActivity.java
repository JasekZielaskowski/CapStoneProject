package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    int quantity = 0;
    private int basePrice;


    private int calculatePrice(boolean chicken_wings_checkbox, boolean burger_checkbox, boolean tacos_checkbox, boolean fish_checkbox) {
        int basePrice = 0;
        if (chicken_wings_checkbox) {
            basePrice = basePrice + 10;
        }
        if (burger_checkbox) {
            basePrice = basePrice + 7;
        }
        if (tacos_checkbox) {
            basePrice = basePrice + 9;
        }
        if (fish_checkbox) {
            basePrice = basePrice + 12;
        }
        return quantity * basePrice;
    }





}