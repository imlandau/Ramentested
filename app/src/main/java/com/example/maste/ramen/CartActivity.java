package com.example.maste.ramen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CartActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button menuBtn = (Button) findViewById(R.id.menuBtn);
        Button homeBtn = (Button) findViewById(R.id.homeBtn);
        final TextView CartDisplay = (TextView) findViewById(R.id.textItem);
        final TextView CartPrice = (TextView) findViewById(R.id.textPrice);
        final TextView CartQuantity = (TextView) findViewById(R.id.textQuantity);
        final TextView subtotalTextView = (TextView) findViewById(R.id.subtotalTextView);
        final TextView taxTextView = (TextView) findViewById(R.id.taxTextView);
        final TextView totalTextView = (TextView) findViewById(R.id.totalTextView);

        String strName = "Item\n";
        String strPrice = "Price\n";
        String strQuantity = "Quantity\n";
        // total of all items before tax
        double subtotal = 0;
        // the amount of tax being charged on all items combined
        double tax = 0;
        // subtotal plus tax
        double total = 0;


        DecimalFormat money = new DecimalFormat("#.00");

        //Creates the string to display all the information about the items in the cart
        if(Cart.dish1.getQuantity() > 0) {
            strName = strName + Cart.dish1.getName() + "\n";
            strPrice = strPrice + String.valueOf(money.format(Cart.dish1.getPrice())) + "\n";
            strQuantity = strQuantity + String.valueOf(Cart.dish1.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish1.getQuantity() * Cart.dish1.getPrice());
        }
        if(Cart.dish2.getQuantity() > 0) {
            strName = strName + Cart.dish2.getName() + "\n";
            strPrice = strPrice + String.valueOf(money.format(Cart.dish2.getPrice())) + "\n";
            strQuantity = strQuantity + String.valueOf(Cart.dish2.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish2.getQuantity() * Cart.dish2.getPrice());
        }
        if(Cart.dish3.getQuantity() > 0) {
            strName = strName + Cart.dish3.getName() + "\n";
            strPrice = strPrice + String.valueOf(money.format(Cart.dish3.getPrice())) + "\n";
            strQuantity = strQuantity + String.valueOf(Cart.dish3.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish3.getQuantity() * Cart.dish3.getPrice());
        }
        if(Cart.dish4.getQuantity() > 0) {
            strName = strName + Cart.dish4.getName() + "\n";
            strPrice = strPrice + String.valueOf(money.format(Cart.dish4.getPrice())) + "\n";
            strQuantity = strQuantity + String.valueOf(Cart.dish4.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish4.getQuantity() * Cart.dish4.getPrice());
        }
        if(Cart.dish5.getQuantity() > 0) {
            strName = strName + Cart.dish5.getName() + "\n";
            strPrice = strPrice + String.valueOf(money.format(Cart.dish5.getPrice())) + "\n";
            strQuantity = strQuantity + String.valueOf(Cart.dish5.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish5.getQuantity() * Cart.dish5.getPrice());
        }
        if(Cart.drink.getQuantity() > 0) {
            strName = strName + Cart.drink.getName() + "\n";
            strPrice = strPrice + String.valueOf(money.format(Cart.drink.getPrice())) + "\n";
            strQuantity = strQuantity + String.valueOf(Cart.drink.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.drink.getQuantity() * Cart.drink.getPrice());
        }

        // calculate the tax for the order
        tax = subtotal * .06;
        // calculate the actual total for the order
        total = subtotal + tax;

        // set the text of all of the textboxes pertaining to updating the cart
        CartDisplay.setText(strName);
        CartPrice.setText(strPrice);
        CartQuantity.setText(strQuantity);
        subtotalTextView.setText("Subtotal:   $" + money.format(subtotal));
        taxTextView.setText("Tax:                 $" + money.format(tax));
        totalTextView.setText("Total:       $" + money.format(total));
        //Moves the use to the menu page
        menuBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CartActivity.this, MainActivity.class));
            }
        });

        //Moves the user to the home page
        homeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CartActivity.this, Home.class));
            }
        });
    } // end onCreate
} // end class
