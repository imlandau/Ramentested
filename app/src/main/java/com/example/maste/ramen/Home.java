package com.example.maste.ramen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    Button login;
    EditText username, password;



    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        login=(Button)findViewById(R.id.login);
        username=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.userPass);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();

            }
        });


        Button toMenuBtn = (Button) findViewById(R.id.toMenuBtn);

        toMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, MainActivity.class));
            }
        });
    }
    public void login() {
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();
        if (user.equals("ramen") && pass.equals("ramen"))
        {
            Toast.makeText(this, "username and password matched!", Toast.LENGTH_LONG).show();
            String password = helper.searchPass(toString());
        }
        else {
            Toast.makeText(this, "username and password do no matched", Toast.LENGTH_LONG).show();
            String password = helper.searchPass((pass));
            //insert the details in the database
            Contact c = new Contact();
            //c.setName(namestr);
            //c.setEmail(emailstr);
            //c.setUserName(UserName);
            //c.setUserPass(password);
            //helper.InsertContact(Contact);
        }


    }
}