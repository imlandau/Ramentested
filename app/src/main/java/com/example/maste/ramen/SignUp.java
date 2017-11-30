package com.example.maste.ramen;

import android.app.Activity;
import android.os.Bundle;

public class SignUp extends Activity {

  DatabaseHelper helper = new DatabaseHelper(this);
   @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    //public void onSignUpClick(View v) {
      //  if (v.getId() == R.id.signup) {
          //  EditText username = (EditText) findViewById(R.id.UserName);
           // EditText password = (EditText) findViewById(R.id.UserPass);
            //String UserName = username.getText().toString();
            //String UserPass = password.getText().toString();

            //if (!UserPass.equals(password)) {
                //message
              //  Toast pass = Toast.makeText(SignUp.this, "Password does not match", Toast.LENGTH_SHORT);
            //} else {
                //insert the details in the databse
              //  Contact c = new Contact();
                //c.setUserName(UserName);
                //c.setUserPass(UserPass);
                //helper.InsertContact(c);
           // }
        //}
   // }


}

