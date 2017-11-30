package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create reference to all of the buttons on the menu
        ImageButton drinkImgBtn = (ImageButton) findViewById(R.id.drinkImgBtn);
        ImageButton dish1ImgBtn = (ImageButton) findViewById(R.id.dish1ImgBtn);
        ImageButton dish2ImgBtn = (ImageButton) findViewById(R.id.dish2ImgBtn);
        ImageButton dish3ImgBtn = (ImageButton) findViewById(R.id.dish3ImgBtn);
        ImageButton dish4ImgBtn = (ImageButton) findViewById(R.id.dish4ImgBtn);
        ImageButton dish5ImgBtn = (ImageButton) findViewById(R.id.dish5ImgBtn);
        TextView textView2 = (TextView) findViewById(R.id.textView);

        final int[] cartHolder = new int[7];
        cartHolder[1] = Cart.dish1.getQuantity();
        cartHolder[2] = Cart.dish2.getQuantity();
        cartHolder[3] = Cart.dish3.getQuantity();
        cartHolder[4] = Cart.dish4.getQuantity();
        cartHolder[5] = Cart.drink.getQuantity();
        cartHolder[6] = Cart.dish5.getQuantity();

        // button that takes the user to the cart
        final Button cartBtn = (Button) findViewById(R.id.cartBtn);

        // button that takes the user to the home screen
        Button homeBtn = (Button) findViewById(R.id.homeBtn);

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CartActivity.class));
            }
        }); // end cartBtn OnClickListener

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Home.class));
            }
        }); // end homeBtn OnClickListener

        drinkImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView2 = (TextView) findViewById(R.id.textView);
                               textView2.setVisibility(View.VISIBLE);
                               textView2.postDelayed(new Runnable() {

                     public void run() {
                                               textView2.setVisibility(View.INVISIBLE);
                                           }
                 }, 1000);
                cartHolder[6]++;
                Cart.dish5.setQuantity(cartHolder[6]);
            }
        }); // end createYourOwnImgBtn OnClickListener

        dish1ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                final TextView textView2 = (TextView) findViewById(R.id.textView);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {

                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1000);
                cartHolder[1]++;
                Cart.dish1.setQuantity(cartHolder[1]);
            } // end onClick
        }); // end dish1ImgBtn onClickListener

        dish2ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                final TextView textView2 = (TextView) findViewById(R.id.textView);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {

                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1000);
                cartHolder[2]++;
                Cart.dish2.setQuantity(cartHolder[2]);
            } // end onClick
        });

        dish3ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                final TextView textView2 = (TextView) findViewById(R.id.textView);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {

                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1000);
                cartHolder[3]++; //casd
                Cart.dish3.setQuantity(cartHolder[3]);
            }

        });

        dish4ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                final TextView textView2 = (TextView) findViewById(R.id.textView);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {

                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1000);
                cartHolder[4]++;
                Cart.dish4.setQuantity(cartHolder[4]);
            }

        });

        dish5ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                final TextView textView2 = (TextView) findViewById(R.id.textView);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {

                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1000);
                cartHolder[5]++;
                Cart.drink.setQuantity(cartHolder[5]);
            }

        });
    } // end onCreate
} // end class
