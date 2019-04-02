package com.example.joshi.shoppinglist;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView item1, item2, item3, item4, item5, item6, item7, item8, item9, item10;
    int totalList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1= findViewById(R.id.item1);
        item2= findViewById(R.id.item2);
        item3= findViewById(R.id.item3);
        item4= findViewById(R.id.item4);
        item5= findViewById(R.id.item5);
        item6= findViewById(R.id.item6);
        item7= findViewById(R.id.item7);
        item8= findViewById(R.id.item8);
        item9= findViewById(R.id.item9);
        item10= findViewById(R.id.item10);
        totalList=0;
    }

    public void addItem(View view) {
        Intent intent = new Intent(this,ShopList.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1){
            if (resultCode==RESULT_OK){
                totalList++;
                String ShopItem = data.getStringExtra("ShopItem");
                switch (totalList){
                    case 1:
                        item1.setText(ShopItem);
                        break;
                    case 2:
                        item2.setText(ShopItem);
                        break;
                    case 3:
                        item3.setText(ShopItem);
                        break;
                    case 4:
                        item4.setText(ShopItem);
                        break;
                    case 5:
                        item5.setText(ShopItem);
                        break;
                    case 6:
                        item6.setText(ShopItem);
                        break;
                    case 7:
                        item7.setText(ShopItem);
                        break;
                    case 8:
                        item8.setText(ShopItem);
                        break;
                    case 9:
                        item9.setText(ShopItem);
                        break;
                    case 10:
                        item10.setText(ShopItem);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Cannot Shop more than 10 things", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
