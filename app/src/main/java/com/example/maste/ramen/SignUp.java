package com.example.maste.ramen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends Activity {
  DatabaseHelper helper = new DatabaseHelper(this);
   @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void SignUp(View v) {
        if (v.getId() == R.id.signup) {

            EditText username = (EditText) findViewById(R.id.UserName);
            EditText password = (EditText) findViewById(R.id.UserPass);
            String UserName = username.getText().toString();
            String UserPass = password.getText().toString();

            if (!UserPass.equals(null)) {
                //message
                Toast.makeText(this, "Should not be Null", Toast.LENGTH_SHORT).show();
            }
            } else{
                //insert the details in the database
                Contact contact = new Contact();
                contact.setUserName();
                contact.setUserPass(UserPass);
                helper.InsertContacts(contact);

                Intent loginIntent = new Intent(this, DisplayData.class);
                //Send Data
                loginIntent.putExtra("UserName",username);
                loginIntent.putExtra("UserPass",Password);
                startActivity(loginIntent);
            }


        }
    }
}

