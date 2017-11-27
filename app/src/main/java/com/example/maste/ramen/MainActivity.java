package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create reference to all of the buttons on the menu
        ImageButton createYourOwnImgBtn = (ImageButton) findViewById(R.id.createYourOwnImgBtn);
        ImageButton dish1ImgBtn = (ImageButton) findViewById(R.id.dish1ImgBtn);
        ImageButton dish2ImgBtn = (ImageButton) findViewById(R.id.dish2ImgBtn);
        ImageButton dish3ImgBtn = (ImageButton) findViewById(R.id.dish3ImgBtn);
        ImageButton dish4ImgBtn = (ImageButton) findViewById(R.id.dish4ImgBtn);
        ImageButton dish5ImgBtn = (ImageButton) findViewById(R.id.dish5ImgBtn);

        final int[] cartHolder = new int[7];
        cartHolder[1] = Cart.cart1.getQuantity();
        cartHolder[2] = Cart.cart2.getQuantity();
        cartHolder[3] = Cart.cart3.getQuantity();
        cartHolder[4] = Cart.cart4.getQuantity();
        cartHolder[5] = Cart.cart5.getQuantity();
        cartHolder[6] = Cart.cart6.getQuantity();

        final Button cartBtn = (Button) findViewById(R.id.cartBtn);

        Button homeTest = (Button) findViewById(R.id.homeTest);

        createYourOwnImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CreateYourOwn.class));

            }
        }); // end createYourOwnImgBtn OnClickListener


        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CartActivity.class));
            }
        }); // end cartBtn OnClickListener

        homeTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Home.class));
            }
        }); // end homeTest OnClickListener

        dish1ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cartHolder[1]++;
                Cart.cart1.setQuantity(cartHolder[1]);
            }

        });

        dish2ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cartHolder[2]++;
                Cart.cart2.setQuantity(cartHolder[2]);
            }

        });

        dish3ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cartHolder[3]++;
                Cart.cart3.setQuantity(cartHolder[3]);
            }

        });

        dish4ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cartHolder[4]++;
                Cart.cart4.setQuantity(cartHolder[4]);
            }

        });

        dish5ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cartHolder[5]++;
                Cart.cart5.setQuantity(cartHolder[5]);
            }

        });
    }
}
