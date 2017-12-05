package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
//test
public class Home extends AppCompatActivity {
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.userPass);


        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        Button signUpBtn = (Button) findViewById(R.id.signUpBtn);

        TextView toMenuBtn = (TextView) findViewById(R.id.toMenuBtn);
        toMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, MainActivity.class));
            }
        });
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, SignUp.class));
            }
        });

        // create onClickListener for loginBtn

        // create OnClickListener for the signUpBtn

    }
}