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
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        Button cartBtn = (Button) findViewById(R.id.cartBtn);

        Button homeTest = (Button) findViewById(R.id.homeTest);

        createYourOwnImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CreateYourOwn.class));

            }
        }); // end createYourOwnImgBtn OnClickListener

        dish1ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1500);

            }
        }); // end dish1ImgBtn OnClickListener

        dish2ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1500);

            }
        }); // end dish2ImgBtn OnClickListener

        dish3ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1500);

            }
        }); // end dish3ImgBtn OnClickListener

        dish4ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1500);

            }
        }); // end dish4ImgBtn OnClickListener

        dish5ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.setVisibility(View.VISIBLE);
                textView2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 1501);

            }
        }); // end dish5ImgBtn OnClickListener


        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cart.class));
            }
        }); // end cartBtn OnClickListener

        homeTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Home.class));
            }
        }); // end homeTest OnClickListener
    }
}
