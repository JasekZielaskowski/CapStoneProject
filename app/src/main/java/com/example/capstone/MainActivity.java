package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitOrder(View view) {
        EditText nameField = (EditText) findViewById(R.id.user_input_name_view);
        String name = nameField.getText().toString();
        Log.v("MainActivity", "Name:" + name);

        CheckBox burgerCheckBox = (CheckBox) findViewById(R.id.burger_checkbox);
        boolean hasBurger = burgerCheckBox.isChecked();
        Log.v("MainActivity", "Cheeseburger: " + hasBurger);

        CheckBox chickenCheckBox = (CheckBox) findViewById(R.id.chicken_wings_checkbox);
        boolean hasChicken = chickenCheckBox.isChecked();
        Log.v("MainActivity", "Chicken wings: " + hasChicken);

        CheckBox tacosCheckBox = (CheckBox) findViewById(R.id.tacos_checkbox);
        boolean hasTacos = tacosCheckBox.isChecked();
        Log.v("MainActivity", "Tacos: " + hasTacos);

        CheckBox fishCheckBox = (CheckBox) findViewById(R.id.fish_checkbox);
        boolean hasFish = fishCheckBox.isChecked();
        Log.v("MainActivity", "Fried Fish: " + hasFish);
    }

    public void Info(View view) {
        Intent i = new Intent(this,Info.class);
        startActivity(i);
    }

    public void Reviews(View view) {
        Intent i = new Intent(this,Reviews.class);
        startActivity(i);
    }


}

