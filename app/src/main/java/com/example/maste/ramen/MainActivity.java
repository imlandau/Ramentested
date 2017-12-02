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

        //Create reference to all of the buttons  and TextViewon the menu
        ImageButton dish1ImgBtn = (ImageButton) findViewById(R.id.drinkImgBtn);
        ImageButton dish2ImgBtn = (ImageButton) findViewById(R.id.dish1ImgBtn);
        ImageButton dish3ImgBtn = (ImageButton) findViewById(R.id.dish2ImgBtn);
        ImageButton dish4ImgBtn = (ImageButton) findViewById(R.id.dish3ImgBtn);
        ImageButton dish5ImgBtn = (ImageButton) findViewById(R.id.dish4ImgBtn);
        ImageButton drinkImgBtn = (ImageButton) findViewById(R.id.dish5ImgBtn);
        final TextView Message = (TextView) findViewById(R.id.CartAddedTo);
        final Button quantityDown = (Button) findViewById(R.id.quandown);
        final Button quantityUp = (Button) findViewById(R.id.quanup);
        final Button submit = (Button) findViewById(R.id.submit);
        final TextView background = (TextView) findViewById(R.id.background);
        //Declaration button that takes the user to the cart
        final Button cartBtn = (Button) findViewById(R.id.cartBtn);
        //Declaration for button that takes the user to the home screen
        Button homeBtn = (Button) findViewById(R.id.purchaseBtn);

        //Declaration for the cartHolder which will redundancy within
        final int[] cartHolder = new int[7];
        cartHolder[1] = Cart.dish1.getQuantity();
        cartHolder[2] = Cart.dish2.getQuantity();
        cartHolder[3] = Cart.dish3.getQuantity();
        cartHolder[4] = Cart.dish4.getQuantity();
        cartHolder[5] = Cart.dish5.getQuantity();
        cartHolder[6] = Cart.drink.getQuantity();

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        drinkImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                identifier = 6;
                if(cartHolder[6] == 0){
                    cartHolder[6] = 1;
                }
                background.setVisibility(View.VISIBLE);
                Message.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            }
        }); // end createYourOwnImgBtn OnClickListener

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish1ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 1;
                if(cartHolder[1] == 0){
                    cartHolder[1] = 1;
                }
                background.setVisibility(View.VISIBLE);
                Message.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            } // end onClick
        }); // end dish1ImgBtn onClickListener

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish2ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 2;
                if(cartHolder[2] == 0){
                    cartHolder[2] = 1;
                }
                background.setVisibility(View.VISIBLE);
                Message.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            } // end onClick
        });

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish3ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 3;
                if(cartHolder[3] == 0){
                    cartHolder[3] = 1;
                }
                background.setVisibility(View.VISIBLE);
                Message.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            }
        });

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish4ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 4;
                if(cartHolder[4] == 0){
                    cartHolder[4] = 1;
                }
                background.setVisibility(View.VISIBLE);
                Message.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            }
        });

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish5ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 5;
                if(cartHolder[5] == 0){
                    cartHolder[5] = 1;
                }
                background.setVisibility(View.VISIBLE);
                Message.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
            }
        });

        //Create an OnClickListener for cartBtn that will move the user to the cart page of the app.
        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CartActivity.class));
            }
        }); // end cartBtn OnClickListener

        //Create an OnClickListener for homeBtn that will move the user to the home page of the app.
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Home.class));
            }
        }); // end homeBtn OnClickListener

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

        //Create an OnClickListener for submit that will
        //make the popup menu for the quantity invisible.
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                quantityDown.setVisibility(View.INVISIBLE);
                quantityUp.setVisibility(View.INVISIBLE);
                background.setVisibility(View.INVISIBLE);
                submit.setVisibility(View.INVISIBLE);
            }
        }); //End submit OnClickListener
    } // end onCreate
} // end class
