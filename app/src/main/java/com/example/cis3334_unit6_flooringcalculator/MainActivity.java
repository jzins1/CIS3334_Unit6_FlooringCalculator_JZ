package com.example.cis3334_unit6_flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare element variables
    TextView textViewWidth;
    TextView textViewLength;
    EditText editTextWidth;
    EditText editTextLength;
    Button buttonShowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link element variables to actual Android elements
        textViewWidth = findViewById(R.id.textViewWidth);
        textViewLength = findViewById(R.id.textViewLength);
        editTextWidth = findViewById(R.id.editTextWidth);
        editTextLength = findViewById(R.id.editTextLength);
        buttonShowResult = findViewById(R.id.buttonShowResult);

        // The logic for clicking the calculate button
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get our width and height from the edit text boxes
                Double width = Double.parseDouble(editTextWidth.getText().toString());
                Double length = Double.parseDouble(editTextLength.getText().toString());

                // Initialize our second intent and pass through our variables for access there
                Intent secActIntent = new Intent(MainActivity.this, SecondActivity.class);
                secActIntent.putExtra("MainWidth", width);
                secActIntent.putExtra("MainLength", length);
                startActivityForResult(secActIntent, 3334);
            }
        });
    }

}