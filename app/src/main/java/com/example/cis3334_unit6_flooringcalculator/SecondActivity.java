package com.example.cis3334_unit6_flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // Declare element variables
    TextView textViewFlooringNeeded;
    TextView textViewFlooringAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Link element variables to actual Android elements
        textViewFlooringNeeded = findViewById(R.id.textViewFlooringNeeded);
        textViewFlooringAmount = findViewById(R.id.textViewFlooringAmount);

        // Initialize our intent for accessing our passed through variables from MainActivity
        Intent intent = getIntent();

        // Get our width and length from the passed through variables from MainActivity
        Double width = intent.getDoubleExtra("MainWidth", 0.0);
        Double length = intent.getDoubleExtra("MainLength", 0.0);

        // Set the flooring amount visible text to what our variables are, including the area
        textViewFlooringAmount.setText(stringResult(width, length));

    }

    // Formats the visible results to a specific format stating what everything is
    protected String stringResult(Double width, Double length){
        Double flooringNeeded = width * length; // Calculate the amount of flooring needed
        return "Width is " + width + " and Length is " + length + " and flooring needed is " + flooringNeeded;
    }
}