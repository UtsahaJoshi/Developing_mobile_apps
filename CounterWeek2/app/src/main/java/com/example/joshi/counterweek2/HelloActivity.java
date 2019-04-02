package com.example.joshi.counterweek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    private TextView counterDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Intent intent = getIntent();
        String count=intent.getStringExtra("count");
        counterDisplay = findViewById(R.id.CountTxt);
        counterDisplay.setText(count);
    }
}
