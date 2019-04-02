package com.example.joshi.droidcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {
    private TextView ordertxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ordertxt = findViewById(R.id.ordertxt);
        Intent intent = getIntent();
        String order = intent.getStringExtra("order");
        ordertxt.setText(order);

    }
}
