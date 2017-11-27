package com.example.maste.ramen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button menuBtn = (Button) findViewById(R.id.menuBtn);
        Button homeBtn = (Button) findViewById(R.id.homeBtn);
        Button update = (Button) findViewById(R.id.update);
        final TextView CartDisplay = (TextView) findViewById(R.id.editText);
        final TextView CartPrice = (TextView) findViewById(R.id.textPrice);
        final TextView CartQuantity = (TextView) findViewById(R.id.textQuantity);

        menuBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CartActivity.this, MainActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CartActivity.this, Home.class));
            }
        });

        update.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String strName = "Item\n";
                String strPrice = "Price\n";
                String strQuantity = "Quantity\n";

                if(Cart.cart1.getQuantity() > 0) {
                    strName = strName + Cart.cart1.getName() + "\n";
                    strPrice = strPrice + String.valueOf(Cart.cart1.getPrice()) + "\n";
                    strQuantity = strQuantity + String.valueOf(Cart.cart1.getQuantity()) + "\n";
                }
                if(Cart.cart2.getQuantity() > 0) {
                    strName = strName + Cart.cart2.getName() + "\n";
                    strPrice = strPrice + String.valueOf(Cart.cart2.getPrice()) + "\n";
                    strQuantity = strQuantity + String.valueOf(Cart.cart2.getQuantity()) + "\n";
                }
                if(Cart.cart3.getQuantity() > 0) {
                    strName = strName + Cart.cart3.getName() + "\n";
                    strPrice = strPrice + String.valueOf(Cart.cart3.getPrice()) + "\n";
                    strQuantity = strQuantity + String.valueOf(Cart.cart3.getQuantity()) + "\n";
                }
                if(Cart.cart4.getQuantity() > 0) {
                    strName = strName + Cart.cart4.getName() + "\n";
                    strPrice = strPrice + String.valueOf(Cart.cart4.getPrice()) + "\n";
                    strQuantity = strQuantity + String.valueOf(Cart.cart4.getQuantity()) + "\n";
                }
                if(Cart.cart5.getQuantity() > 0) {
                    strName = strName + Cart.cart5.getName() + "\n";
                    strPrice = strPrice + String.valueOf(Cart.cart5.getPrice()) + "\n";
                    strQuantity = strQuantity + String.valueOf(Cart.cart5.getQuantity()) + "\n";
                }
                if(Cart.cart6.getQuantity() > 0) {
                    strName = strName + Cart.cart6.getName() + "\n";
                    strPrice = strPrice + String.valueOf(Cart.cart6.getPrice()) + "\n";
                    strQuantity = strQuantity + String.valueOf(Cart.cart6.getQuantity()) + "\n";
                }

                CartDisplay.setText(strName);
                CartPrice.setText(strPrice);
                CartQuantity.setText(strQuantity);

            }
        });

    }
}
