package com.example.maste.ramen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
  DatabaseHelper helper = new DatabaseHelper(this);
   @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button registerBtn = (Button) findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUp(v);
            }
        });

    }



    public void SignUp(View v) {
       String userName;
       String userPass;

        EditText userNameEditText = (EditText) findViewById(R.id.userNameEditText);
        EditText password = (EditText) findViewById(R.id.userPassEditText);
        userName = userNameEditText.getText().toString();
        userPass = password.getText().toString();

        if (v.getId() == R.id.signUpBtn) {

            if (!userPass.equals(null)) {
                //message
                Toast.makeText(this, "Should not be Null", Toast.LENGTH_SHORT).show();
            }
            } else{
                //insert the details in the database
                Contact contact = new Contact();
            Toast.makeText(this, "Entered to Registry", Toast.LENGTH_SHORT).show();
                contact.setUserName(userName);
                contact.setUserPass(userPass);
                helper.InsertContacts(contact);
                Intent loginIntent = new Intent(this, DisplayData.class);
                // Send Data
                loginIntent.putExtra("UserName", userName);
                loginIntent.putExtra("UserPass", userPass);
                startActivity(loginIntent);
            } // end else


        } // end SignUp
    } // end class


