package com.example.maste.ramen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView loginPage = (TextView) findViewById(R.id.loginPage);
        loginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, MainActivity.class));
            }
        });

        EditText name = (EditText) findViewById(R.id.signName);
        EditText pass = (EditText) findViewById(R.id.signPass);
        EditText pass1 = (EditText) findViewById(R.id.signConPass);

        String namestr = name.getText().toString();
        String pass1str = pass.getText().toString();
        String pass2str = pass.getText().toString();
        Button signUpBtn2 = (Button) findViewById(R.id.signUpBtn2);



        if(!pass1str.equals(pass2str)){
            Toast.makeText(SignUp.this, "Passwords don't match", Toast.LENGTH_SHORT).show();
        }
            else {
            //insert the details to database
            Contact c = new Contact();
            c.setName(namestr);
            c.setPass(pass1str);


            helper.insertContact(c);
        }
    }



}
