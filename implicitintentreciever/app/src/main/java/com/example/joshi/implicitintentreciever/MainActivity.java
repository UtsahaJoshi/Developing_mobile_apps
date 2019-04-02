package com.example.joshi.implicitintentreciever;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri != null) {
            String uri_string = getString(R.string.uri) + uri.toString();
            TextView textView = findViewById(R.id.text_uri_mssg);
            textView.setText(uri_string);
        }
    }
}
