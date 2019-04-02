package com.example.joshi.activitiesintentscodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void textDisplay(View view) {
        Intent intent = new Intent(this, displayActivity.class);
        intent.putExtra("textno", "1");
        startActivity(intent);
    }

    public void textDisplayTwo(View view) {
        Intent intent = new Intent(this, displayActivity.class);
        intent.putExtra("textno", "2");
        startActivity(intent);
    }

    public void textDisplayThree(View view) {
        Intent intent = new Intent(this, displayActivity.class);
        intent.putExtra("textno","3" );
        startActivity(intent);
    }
}
