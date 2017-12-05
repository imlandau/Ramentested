package com.example.maste.ramen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);

    //Button login = (Button) findViewById(R.id.login);
    //Button signup = (Button) findViewById(R.id.signup);
    //EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    // login = (Button) findViewById(R.id.login);
    //signup = (Button) findViewById(R.id.signup);
    //username = (EditText) findViewById(R.id.UserName);
    //password = (EditText) findViewById(R.id.UserPass);}

    public void onBtnLoginInClick(View v) {
        if (v.getId() == R.id.login) {
            //Passing userName
            EditText UserNameET = (EditText) findViewById(R.id.UserName);
            String UserNameStr = UserNameET.getText().toString();
            //Passing Password
            EditText PasswordET = (EditText) findViewById(R.id.UserPass);
            String PasswordStr = PasswordET.getText().toString();


            String dbUserPass = helper.LoginIn(UserNameStr);
            //Send UserName to Database to find it, and return Password
            //To compare it with Current Password from user input
            if (dbUserPass.equals(PasswordStr)) {
                Intent loginIntent = new Intent(this, DisplayData.class);
                //Send Data
                loginIntent.putExtra("UserName", UserNameStr);
                loginIntent.putExtra("Password", PasswordStr);

                startActivity(loginIntent);
            } else {
                Toast.makeText(this, "UserName and Password do not match", Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void onBtnSignUpClick(View v) {
        if (v.getId() == R.id.signup) {
            Intent SignUpIntent = new Intent(this, SignUp.class);
            startActivity(SignUpIntent);
        }
    }
}


    //login.setOnClickListener(new View.OnClickListener() {
    // @Override
    //public void onClick(View view) {
    //  login();

    // }

    // });
    //Button toMenuBtn = (Button) findViewById(R.id.toMenuBtn);

    //toMenuBtn.setOnClickListener(new View.OnClickListener() {
    //  @Override
    //public void onClick(View view) {
    //  startActivity(new Intent(Home.this, MainActivity.class));
    //}
    //});
    // }

    //public void login() {
    //  String user = username.getText().toString().trim();
    //String pass = password.getText().toString().trim();
    //if (user.equals(username) && pass.equals(password)) {
    //  Toast.makeText(this, "username and password matched!", Toast.LENGTH_LONG).show();
    //String password = helper.searchPass(toString());
    //} else {
    //  Toast.makeText(this, "username and password do no matched", Toast.LENGTH_LONG).show();
    //String password = helper.searchPass((pass));
    //String username = helper.searchUser((user));
    //insert the details in the database
    //Contact c = new Contact();
    //c.setUserName(username);
    //c.setUserPass(password);
    //helper.InsertContact(c);
    //}
    //}

    //public void signup() {
    // EditText username = (EditText) findViewById(R.id.UserName);
    //  EditText password = (EditText) findViewById(R.id.UserPass);
    //   String UserName = username.getText().toString();
    //   String UserPass = password.getText().toString();
    //   if (!UserName.equals(username) && !UserPass.equals(password)) {
    //    //message
    //  Contact c = new Contact();
    //   c.setUserName(UserName);
    //   c.setUserPass(UserPass);
    // helper.InsertContact(c);
    // } else {
    //    Toast.makeText(this, "Enter your information to get started", Toast.LENGTH_LONG);
    // }
    // }

    //public void onButtonClick (View v) {
    //     if (v.getId() == R.id.login) {
    //      EditText a = (EditText) findViewById(R.id.UserName);
    //    String str = a.getText().toString();
    //  EditText b = (EditText) findViewById(R.id.UserPass);
    //String pass = b.getText().toString();
    //String password = helper.searchPass(str);

    //if (pass.equals(password)) {
    //  Intent i = new Intent(Home.this, Home.class);
    //i.putExtra("UserName", str);

    //} else {
    //  Toast temp = Toast.makeText(Home.this,
    //        "Username and Password do not matched", Toast.LENGTH_SHORT);
    //temp.show();
    //}

    // public void onSignUpClick(View v) {
    //  if (v.getId() == R.id.signup) {
    // EditText username = (EditText) findViewById(R.id.UserName);
    // EditText password = (EditText) findViewById(R.id.UserPass);
    // String UserName = username.getText().toString();
    //  String UserPass = password.getText().toString();

    // if (!UserPass.equals(password)) {
    //message
    //  Toast pass = Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT);
    //  } else {
    //insert the details in the databse
    //  Contact c = new Contact();
    //  c.setUserName(UserName);
    //  c.setUserPass(UserPass);
    //  helper.InsertContact(c);
    // }


