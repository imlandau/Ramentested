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

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        Button signUpBtn = (Button) findViewById(R.id.signUpBtn);


        TextView toMenuBtn = (TextView) findViewById(R.id.toMenuBtn);
        toMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        username=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.userPass);
        String namestr = username.getText().toString();
        String str = password.getText().toString();
        String passWord = helper.searchPass(str);

        if (passWord.equals(password)){
            Intent i = new Intent(Home.this,MainActivity.class);
            i.putExtra("Name",str);
            startActivity(i);
            return true;
        }else {
            Toast.makeText(this, "username and password do not match", Toast.LENGTH_LONG).show();
            return false;
        }
    } // end login
} // end class