package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;

public class CreateYourOwn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_your_own);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        Button menuBtn = (Button) findViewById(R.id.menuBtn);
        Button createbtn = (Button) findViewById(R.id.createbtn);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Noodles)){};
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Flavoring));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);

        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Protien));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner3.setAdapter(myAdapter3);

        Spinner mySpinner4 = (Spinner) findViewById(R.id.spinner4);

        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Veggie));
        myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner4.setAdapter(myAdapter4);

        Spinner mySpinner5 = (Spinner) findViewById(R.id.spinner5);

        ArrayAdapter<String> myAdapter5 = new ArrayAdapter<>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Extra));
        myAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner5.setAdapter(myAdapter5);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateYourOwn.this, MainActivity.class));
            }
        });

        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView = (TextView) findViewById(R.id.textView);
                textView.setVisibility(View.VISIBLE);
                textView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView.setVisibility(View.INVISIBLE);
                        startActivity(new Intent(CreateYourOwn.this, MainActivity.class));
                    }
                }, 1500);
            }
        }); // end createbtn OnClickListener
    }
}