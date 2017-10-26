package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create reference to all of the buttons on the menu
        ImageButton createYourOwnImgBtn = (ImageButton) findViewById(R.id.createYourOwnImgBtn);
        ImageButton dish1ImgBtn = (ImageButton) findViewById(R.id.dish1ImgBtn);
        ImageButton dish2ImgBtn = (ImageButton) findViewById(R.id.dish2ImgBtn);
        ImageButton dish3ImgBtn = (ImageButton) findViewById(R.id.dish3IngBtn);
        ImageButton dish4ImgBtn = (ImageButton) findViewById(R.id.dish4ImgBtn);
        ImageButton dish5ImgBtn = (ImageButton) findViewById(R.id.dish5ImgBtn);
        ImageButton dish6ImgBtn = (ImageButton) findViewById(R.id.dish6ImgBtn);
        ImageButton dish7ImgBtn = (ImageButton) findViewById(R.id.dish7ImgBtn);
        ImageButton dish8ImgBtn = (ImageButton) findViewById(R.id.dish8ImgBtn);

        // create OnClickListeners for each of the buttons, then assign them behavior
        createYourOwnImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createYourOwnIntent = new Intent(getApplicationContext(), CreateYourOwn.class);
                startActivity(createYourOwnIntent);
            }
        }); // end createYourOwnImgBtn OnClickListener

        dish1ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish1ImgBtn OnClickListener

        dish2ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish2ImgBtn OnClickListener

        dish3ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish3ImgBtn OnClickListener

        dish4ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish4ImgBtn OnClickListener

        dish5ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish5ImgBtn OnClickListener

        dish6ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish6ImgBtn OnClickListener

        dish7ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish7ImgBtn OnClickListener

        dish8ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }); // end dish8ImgBtn OnClickListener

    }
}
