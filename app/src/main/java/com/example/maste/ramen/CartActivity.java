package com.example.maste.ramen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CartActivity extends AppCompatActivity{

    // total of all items before tax
    double subtotal = 0;
    // the amount of tax being charged on all items combined
    double tax = 0;
    // subtotal plus tax
    double total = 0;

    // decimal format to display money
    DecimalFormat money = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // button that takes user to the menu
        Button menuBtn = (Button) findViewById(R.id.menuBtn);
        // button that completes the purchase of the order
        Button homeBtn = (Button) findViewById(R.id.purchaseBtn);
        // button to remove everything from the cart
        Button removeBtn = (Button) findViewById(R.id.removeAll);
        // displays the items in the cart
        final TextView textItem = (TextView) findViewById(R.id.textItem);
        // shows the prices of each item in the cart
        final TextView textPrice = (TextView) findViewById(R.id.textPrice);
        // shows the quantity of each item in the cart
        final TextView textQuantity = (TextView) findViewById(R.id.textQuantity);
        // shows the total of the order before tax
        final TextView subtotalTextView = (TextView) findViewById(R.id.subtotalTextView);
        // shows the tax of the order
        final TextView taxTextView = (TextView) findViewById(R.id.taxTextView);
        // shows the total cost of the order
        final TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        // tells the user the order has been placed
        final TextView bghtTextView = (TextView) findViewById(R.id.bght);

        // header for the textItem box
        String strName = "Item\n";
        // header for the textPrice box
        String strPrice = "Price\n";
        // header for the textQuantity box
        String strQuantity = "Quantity\n";


        /** Creates the string to display all the information about the items in the cart, and
            updates the subtotal based on the quantity of each item. If the quantity of an item
            is zero, it is not added to the string or subtotal. The item name, price, and quantity
            are concatenated on to the strName, strPrice, and strQuantity strings respectively, so
            that they can be displayed properly.
         **/
        if(Cart.dish1.getQuantity() > 0) {
            strName = strName + Cart.dish1.getName() + "\n";
            strPrice = strPrice  + "\n" + String.valueOf(money.format(Cart.dish1.getPrice())) +
                    "\n";
            strQuantity = strQuantity + "\n" + String.valueOf(Cart.dish1.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish1.getQuantity() * Cart.dish1.getPrice());
        }
        if(Cart.dish2.getQuantity() > 0) {
            strName = strName + Cart.dish2.getName() + "\n";
            strPrice = strPrice + "\n" + String.valueOf(money.format(Cart.dish2.getPrice())) + "\n";
            strQuantity = strQuantity + "\n" + String.valueOf(Cart.dish2.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish2.getQuantity() * Cart.dish2.getPrice());
        }
        if(Cart.dish3.getQuantity() > 0) {
            strName = strName + Cart.dish3.getName() + "\n";
            strPrice = strPrice + "\n" + String.valueOf(money.format(Cart.dish3.getPrice())) + "\n";
            strQuantity = strQuantity + "\n" +  String.valueOf(Cart.dish3.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish3.getQuantity() * Cart.dish3.getPrice());
        }
        if(Cart.dish4.getQuantity() > 0) {
            strName = strName + Cart.dish4.getName() + "\n";
            strPrice = strPrice  + "\n" + String.valueOf(money.format(Cart.dish4.getPrice())) + "\n";
            strQuantity = strQuantity + "\n" + String.valueOf(Cart.dish4.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish4.getQuantity() * Cart.dish4.getPrice());
        }
        if(Cart.dish5.getQuantity() > 0) {
            strName = strName + Cart.dish5.getName() + "\n";
            strPrice = strPrice +  "\n" + String.valueOf(money.format(Cart.dish5.getPrice())) + "\n";
            strQuantity = strQuantity  + "\n" + String.valueOf(Cart.dish5.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.dish5.getQuantity() * Cart.dish5.getPrice());
        }
        if(Cart.drink.getQuantity() > 0) {
            strName = strName + Cart.drink.getName() + "\n";
            strPrice = strPrice + String.valueOf(money.format(Cart.drink.getPrice())) + "\n";
            strQuantity = strQuantity  + String.valueOf(Cart.drink.getQuantity()) + "\n";
            subtotal = subtotal + (Cart.drink.getQuantity() * Cart.drink.getPrice());
        }

        // calculate the tax for the order
        tax = subtotal * .06;
        // calculate the actual total for the order
        total = subtotal + tax;

        // set all of the text boxes to display their corresponding strings
        textItem.setText(strName);
        textPrice.setText(strPrice);
        textQuantity.setText(strQuantity);
        subtotalTextView.setText("Subtotal:\n$" + money.format(subtotal));
        taxTextView.setText("Tax:\n$" + money.format(tax));
        totalTextView.setText("Total:\n$" + money.format(total));

        // returns the user to the menu page
        menuBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CartActivity.this, MainActivity.class));
            }
        });

        // returns the user to the home page
        homeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                bghtTextView.setVisibility(View.VISIBLE);
                bghtTextView.postDelayed(new Runnable() {

                    public void run() {
                        bghtTextView.setVisibility(View.INVISIBLE);

                startActivity(new Intent(CartActivity.this, Home.class));
                        Cart.removeAll();
                        subtotal = 0;
                        tax = 0;
                        total = 0;
                        textItem.setText("Item");
                        textPrice.setText("Price");
                        textQuantity.setText("Quantity");
                        subtotalTextView.setText("Subtotal:\n$" + money.format(subtotal));
                        taxTextView.setText("Tax:\n$" + money.format(tax));
                        totalTextView.setText("Total:\n$" + money.format(total));
                    }
                }, 5000);
            }
        });

        // this button removes all items in the cart
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cart.removeAll();
                subtotal = 0;
                tax = 0;
                total = 0;
                textItem.setText("Item");
                textPrice.setText("Price");
                textQuantity.setText("Quantity");
                subtotalTextView.setText("Subtotal:\n$" + money.format(subtotal));
                taxTextView.setText("Tax:\n$" + money.format(tax));
                totalTextView.setText("Total:\n$" + money.format(total));
            }
        });
    } // end onCreate
} // end class
