package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//test
public class Home extends AppCompatActivity {
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.userPass);

        Button toMenuBtn = (Button) findViewById(R.id.toMenuBtn);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        Button signUpBtn = (Button) findViewById(R.id.signUpBtn);

        // create onClickListener for the toMenuBtn
        toMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, MainActivity.class));
            }
        });

        // create onClickListener for loginBtn
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login()) {
                    startActivity(new Intent(Home.this, MainActivity.class));
                } // end if
            } // end onClick
        });
        // create OnClickListener for the signUpBtn
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, SignUp.class));
            } // end onClick
        }); // end onClickListener for signUpBtn

    } // end onCreate

    public Boolean login() {
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        // checks whether the username and password match
        if (user.equals("ramen") && pass.equals("ramen"))
        {
            Toast.makeText(this, "username and password matched!", Toast.LENGTH_LONG).show();
            return true;
        } else {
            Toast.makeText(this, "username and password do no matched", Toast.LENGTH_LONG).show();
            return false;
        } // end if else
    } // end login
} // end class