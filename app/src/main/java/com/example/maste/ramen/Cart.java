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
    } // end onCreate

    // the number of items in the cart
    int size;
    ArrayList<Item> cart;

    /**
     * Creates an ArrayList to hold all Items in the cart with an initial size of 10 items (see
     * ArrayList documentation). If more than 10 items are added, the ArrayList will resize itself
     * using the ensureCapacity method.
     */
    public Cart() {
        // creates an ArrayList that holds Item objects
        this.cart = new ArrayList<Item>();
    } // end Cart constructor

    /**
     * Adds an item to the cart
     * @param toAdd an Item that will be added to the cart
     */
    public void add(Item toAdd) {
        // check to see if the array is large enough to hold another item, and resizes if not
        this.cart.ensureCapacity(this.size + 1);
        // increment the size of the cart
        this.size++;
    } // end add

    /**
     * Removes a specified item from the cart.
     * @param toRemove the Item that needs to be removed from the cart
     */
    public void remove(Item toRemove) {
        // do stuff
        // decrement the size of the cart
        //this.size--;
    } // end remove

    /**
     * Removes ALL items from the cart.
     */
    public void empty() {
        // do stuff
        // cart is empty now
        this.size = 0;
    } // end clear

} // end class
