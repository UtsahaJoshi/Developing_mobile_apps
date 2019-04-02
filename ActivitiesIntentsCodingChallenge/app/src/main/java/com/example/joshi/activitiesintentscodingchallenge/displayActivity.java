package com.example.joshi.activitiesintentscodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class displayActivity extends AppCompatActivity {
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String text = intent.getStringExtra("textno");
        textView = findViewById(R.id.textView);
        if (text.equals("1")){
            textView.setText(getString(R.string.texta));
        }
        else if (text.equals("2")){
            textView.setText(getString(R.string.textc));
        }
        else if (text.equals("3")){
            textView.setText(getString(R.string.textb));
        }

    }
}
