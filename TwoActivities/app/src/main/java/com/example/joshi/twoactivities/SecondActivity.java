package com.example.joshi.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String MESSAGE_EXTRA = "com.example.joshi.twoactivities.extra.REPLY";
    private EditText messagereply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        messagereply = findViewById(R.id.editText_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textview = findViewById(R.id.text_message);
        textview.setText(message);

    }



    public void launchFirstActivity(View view) {
        Intent replyIntent = new Intent(this, MainActivity.class);
        String message = messagereply.getText().toString();
        replyIntent.putExtra(MESSAGE_EXTRA, message);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}
