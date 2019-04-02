package com.example.joshi.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText webTxt;
    private EditText locTxt;
    private EditText shareTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webTxt = findViewById(R.id.webEditText);
        locTxt = findViewById(R.id.locEditText);
        shareTxt = findViewById(R.id.shareEditText);
    }

    public void openWebsite(View view) {
        String url = webTxt.getText().toString();
        Uri web = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }

    public void openLocation(View view) {
        String loc = locTxt.getText().toString();
        Uri addressuri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW,addressuri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void shareText(View view) {
        String shareit = shareTxt.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.sharetxtwith)
                .setText(shareit)
                .startChooser();
    }

    public void snapClick(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, 1);
        }
    }
}
