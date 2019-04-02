package com.example.joshi.counterweek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterTxt;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTxt = findViewById(R.id.txt_counter);
    }

    public void counter(View view) {
        count++;
        counterTxt.setText(Integer.toString(count));
    }

    public void helloscreen(View view) {
        Intent intent = new Intent(this,HelloActivity.class);
        intent.putExtra("count",Integer.toString(count));
        startActivity(intent);
    }
}
