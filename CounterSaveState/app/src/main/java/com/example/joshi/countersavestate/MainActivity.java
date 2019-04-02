package com.example.joshi.countersavestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView count_txt;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count=0;
        if (savedInstanceState!=null){
            count= savedInstanceState.getInt("count");
        }

        count_txt = findViewById(R.id.txtCount);
        count_txt.setText(Integer.toString(count));
    }

    public void counterAdd(View view) {
        count++;
        count_txt.setText(Integer.toString(count));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }
}
