package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.maste.ramen.Cart.identifier;

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
        final Button quantityDown = (Button) findViewById(R.id.quandown);
        final Button quantityUp = (Button) findViewById(R.id.quanup);
        TextView textView2 = (TextView) findViewById(R.id.textView);
        final Button quandown = (Button) findViewById(R.id.quandown);
        final Button quanup = (Button) findViewById(R.id.quanup);
        final Button submit = (Button) findViewById(R.id.submit);

        final TextView textView3 = (TextView) findViewById(R.id.background);

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
        Button homeBtn = (Button) findViewById(R.id.purchaseBtn);

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
                textView3.setVisibility(View.VISIBLE);
                quandown.setVisibility(View.VISIBLE);
                quanup.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                cartHolder[6]++;
                Cart.dish5.setQuantity(cartHolder[6]);
            }
        }); // end createYourOwnImgBtn OnClickListener

        dish1ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                textView3.setVisibility(View.VISIBLE);
                quandown.setVisibility(View.VISIBLE);
                quanup.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                cartHolder[1]++;
                Cart.dish1.setQuantity(cartHolder[1]);
            } // end onClick
        }); // end dish1ImgBtn onClickListener

        dish2ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                textView3.setVisibility(View.VISIBLE);
                quandown.setVisibility(View.VISIBLE);
                quanup.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                cartHolder[2]++;
                Cart.dish2.setQuantity(cartHolder[2]);
            } // end onClick
        });

        dish3ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                textView3.setVisibility(View.VISIBLE);
                quandown.setVisibility(View.VISIBLE);
                quanup.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                Cart.dish3.setQuantity(cartHolder[3]);
            }

        });

        dish4ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                textView3.setVisibility(View.VISIBLE);
                quandown.setVisibility(View.VISIBLE);
                quanup.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                cartHolder[4]++;
                Cart.dish4.setQuantity(cartHolder[4]);
            }

        });

        dish5ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                textView3.setVisibility(View.VISIBLE);
                quandown.setVisibility(View.VISIBLE);
                quanup.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                cartHolder[5]++;
                Cart.drink.setQuantity(cartHolder[5]);
            }

        });


        //Create an OnClickListener for quantityDown that will
        //decrement the quantity of the item by 1 every click.
        quantityDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cartHolder[identifier] > 0){
                    cartHolder[identifier]--;
                }
                switch (identifier) {
                    case 1: Cart.dish1.setQuantity(cartHolder[identifier]);
                        break;
                    case 2: Cart.dish2.setQuantity(cartHolder[identifier]);
                        break;
                    case 3: Cart.dish3.setQuantity(cartHolder[identifier]);
                        break;
                    case 4: Cart.dish4.setQuantity(cartHolder[identifier]);
                        break;
                    case 5: Cart.dish5.setQuantity(cartHolder[identifier]);
                        break;
                    case 6: Cart.drink.setQuantity(cartHolder[identifier]);
                }
            }
        }); //End quantityDown OnClickListener

        //Create an OnClickListener for quantityUp that will
        //increment the quantity of the item by 1 every click.
        quantityUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cartHolder[identifier]++;
                switch (identifier) {
                    case 1: Cart.dish1.setQuantity(cartHolder[identifier]);
                        break;
                    case 2: Cart.dish2.setQuantity(cartHolder[identifier]);
                        break;
                    case 3: Cart.dish3.setQuantity(cartHolder[identifier]);
                        break;
                    case 4: Cart.dish4.setQuantity(cartHolder[identifier]);
                        break;
                    case 5: Cart.dish5.setQuantity(cartHolder[identifier]);
                        break;
                    case 6: Cart.drink.setQuantity(cartHolder[identifier]);
                }
            }
        }); //End quantityUp OnClickListener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                final TextView textView2 = (TextView) findViewById(R.id.textView);
                textView2.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.INVISIBLE);
                quandown.setVisibility(View.INVISIBLE);
                quanup.setVisibility(View.INVISIBLE);
                submit.setVisibility(View.INVISIBLE);
                textView2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }

        });


    } // end onCreate
} // end class
