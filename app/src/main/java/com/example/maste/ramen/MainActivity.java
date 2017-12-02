package com.example.maste.ramen;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.maste.ramen.Cart.identifier;

public class MainActivity extends AppCompatActivity {
    static int dif;
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
        final TextView Message = (TextView) findViewById(R.id.cartAddedTo);
        final TextView description = (TextView) findViewById(R.id.description);
        final TextView curQuan = (TextView) findViewById(R.id.curQuan);
        final Button quantityDown = (Button) findViewById(R.id.quandown);
        final Button quantityUp = (Button) findViewById(R.id.quanup);
        final Button submit = (Button) findViewById(R.id.submit);
        final TextView background = (TextView) findViewById(R.id.background);
        final TextView curQan = (TextView) findViewById(R.id.curQuan);
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
                dif = 0;
                if(cartHolder[6] == 0){
                    cartHolder[6] = 1;
                    dif = 1;
                }
                curQan.setText(String.valueOf(cartHolder[6]));
                curQan.setVisibility(View.VISIBLE);
                background.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                curQuan.setVisibility(View.VISIBLE);
                description.setVisibility(View.VISIBLE);
                description.setText(getResources().getStringArray(R.array.Descriptions)[1]);
            }
        }); // end createYourOwnImgBtn OnClickListener

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish1ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 1;
                dif = 0;
                if(cartHolder[1] == 0){
                    cartHolder[1] = 1;
                    dif = 1;
                }
                curQan.setText(String.valueOf(cartHolder[1]));
                curQan.setVisibility(View.VISIBLE);
                background.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                curQuan.setVisibility(View.VISIBLE);
                description.setVisibility(View.VISIBLE);
                description.setText(getResources().getStringArray(R.array.Descriptions)[1]);
            } // end onClick
        }); // end dish1ImgBtn onClickListener

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish2ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 2;
                dif = 0;
                if(cartHolder[2] == 0){
                    cartHolder[2] = 1;
                    dif = 1;
                }
                curQan.setText(String.valueOf(cartHolder[2]));
                curQan.setVisibility(View.VISIBLE);
                background.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                curQuan.setVisibility(View.VISIBLE);
                description.setVisibility(View.VISIBLE);
                description.setText(getResources().getStringArray(R.array.Descriptions)[3]);
            } // end onClick
        });

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish3ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 3;
                dif = 0;
                if(cartHolder[3] == 0){
                    cartHolder[3] = 1;
                    dif = 1;
                }
                curQan.setText(String.valueOf(cartHolder[3]));
                curQan.setVisibility(View.VISIBLE);
                background.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                curQuan.setVisibility(View.VISIBLE);
                description.setVisibility(View.VISIBLE);
                description.setText(getResources().getStringArray(R.array.Descriptions)[4]);
            }
        });

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish4ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 4;
                dif = 0;
                if(cartHolder[4] == 0){
                    cartHolder[4] = 1;
                    dif = 1;
                }
                curQan.setText(String.valueOf(cartHolder[4]));
                curQan.setVisibility(View.VISIBLE);
                background.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                curQuan.setVisibility(View.VISIBLE);
                description.setVisibility(View.VISIBLE);
                description.setText(getResources().getStringArray(R.array.Descriptions)[5]);
            }
        });

        //Create an OnClickListener for dish5ImgBtn that will identify which item will be receiving
        //a quantity change through the popup menu that will be made visible as well.
        dish5ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                identifier = 5;
                dif = 0;
                if(cartHolder[5] == 0){
                    cartHolder[5] = 1;
                    dif = 1;
                }
                curQan.setText(String.valueOf(cartHolder[5]));
                curQan.setVisibility(View.VISIBLE);
                background.setVisibility(View.VISIBLE);
                quantityDown.setVisibility(View.VISIBLE);
                quantityUp.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                curQuan.setVisibility(View.VISIBLE);
                description.setVisibility(View.VISIBLE);
                description.setText(getResources().getStringArray(R.array.Descriptions)[6]);

        }});

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
                    dif--;
                }
                curQan.setText(String.valueOf(cartHolder[identifier]));
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
                dif++;
                curQan.setText(String.valueOf(cartHolder[identifier]));
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

                if(dif > 0){
                    Message.setVisibility(View.VISIBLE);
                    Message.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Message.setVisibility(View.INVISIBLE);
                        }
                    },1500);
                }
                quantityDown.setVisibility(View.INVISIBLE);
                quantityUp.setVisibility(View.INVISIBLE);
                background.setVisibility(View.INVISIBLE);
                submit.setVisibility(View.INVISIBLE);
                curQuan.setVisibility(View.INVISIBLE);
                description.setVisibility(View.INVISIBLE);
            }
        }); //End submit OnClickListener
    } // end onCreate
} // end class
