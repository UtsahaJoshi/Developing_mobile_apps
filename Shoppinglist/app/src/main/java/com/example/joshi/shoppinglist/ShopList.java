package com.example.joshi.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShopList extends AppCompatActivity implements View.OnClickListener {
    private Button ShopButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);
        ShopButton = new Button(this);
        ShopButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Button ShopBtn = (Button) view;
        String ShopText = ShopBtn.getText().toString();
        Intent Shopintent = new Intent(this, MainActivity.class);
        Shopintent.putExtra("ShopItem", ShopText);
        setResult(RESULT_OK,Shopintent);
        finish();
    }
}
