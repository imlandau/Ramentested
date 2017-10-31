package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;

public class CreateYourOwn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_your_own);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        Button menuBtn = (Button) findViewById(R.id.menuBtn);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Noodles));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Flavoring));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Protien));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner4 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Veggie));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner5 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter5 = new ArrayAdapter<String>(CreateYourOwn.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Extra));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateYourOwn.this, MainActivity.class));
            }
        });
    }
}
