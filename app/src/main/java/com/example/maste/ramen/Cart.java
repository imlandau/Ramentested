package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        //Create reference to the Menu button in the cart
        Button menuBtn = (Button) findViewById(R.id.menuBtn);
        Button homeBtn = (Button) findViewById(R.id.homeBtn);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cart.this, MainActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cart.this, Home.class));
            }
        });

        Item[] cartArray = new Item[6];
        cartArray[0] = new Item(6.9, 0, "Sweet and Spicy Pork");
        cartArray[1] = new Item(6.9, 0, "Mongolian Beef");
        cartArray[2] = new Item(6.9, 0, "Ramen Vegetable Stir Fry");
        cartArray[3] = new Item(6.9, 0, "Crunchy Asian Ramen Noodle Salad");
        cartArray[4] = new Item(6.9, 0, "Chicken Veggie Ramen Bowl");
        cartArray[5] = new Item(6.9, 0, "Drank");
    } // end onCreate

    /**
     * Adds an item to the cart
     * @param toAdd an Item that will be added to the cart
     */
    public void add(Item toAdd) {
    } // end add

} // end class
