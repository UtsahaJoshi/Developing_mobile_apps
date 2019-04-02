package com.example.joshi.hellotoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount=0;
    private TextView mshowcount;
    private Button btncount;
    private Button btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowcount = (TextView) findViewById(R.id.show_count);
        btncount = (Button) findViewById(R.id.btn_count);
        btnreset = (Button) findViewById(R.id.btn_reset);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {

        mcount++;
        mshowcount.setText(Integer.toString(mcount));
        if ((mcount%2)==0){
            btncount.setBackgroundColor(Color.parseColor("#FF0099cc"));
        }
        else {
            btncount.setBackgroundColor(Color.RED);
        }
        btnreset.setBackgroundColor(Color.BLACK);
    }

    public void reset(View view) {
        btnreset.setBackgroundColor(Color.GRAY);
        mcount=0;
        mshowcount.setText(Integer.toString((mcount)));
        btncount.setBackgroundColor(Color.parseColor("#FF0099cc"));

    }
}
