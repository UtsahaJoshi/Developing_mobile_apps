package com.example.joshi.twoactivities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.joshi.twoactivities.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;
    private EditText mMessageEditText;
    private TextView mReplyHeadText;
    private TextView mReplyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_main);
        mReplyHeadText = findViewById(R.id.text_header_reply);
        mReplyText = findViewById(R.id.text_message_reply);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button Clicked");
        Intent intent = new Intent(this, SecondActivity.class );
        String Message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, Message);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.MESSAGE_EXTRA);
                mReplyHeadText.setVisibility(View.VISIBLE);
                mReplyText.setText(reply);
                mReplyText.setVisibility(View.VISIBLE);
            }
        }
    }
}
