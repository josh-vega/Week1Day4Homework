package com.example.josh.week1day4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent passedIntent = getIntent();
        Bundle passedBundle = passedIntent.getExtras();
        String passedValue = passedBundle.getString("Value");

        tvDisplay = findViewById(R.id.tvDisplay);
        if(passedValue != null && !passedValue.isEmpty()){
            tvDisplay.setText(passedValue);
        }
    }
}
