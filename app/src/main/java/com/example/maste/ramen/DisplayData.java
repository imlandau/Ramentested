package com.example.maste.ramen;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by fatimahal-zawwad on 12/3/17.
 */
//
public class DisplayData extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String username=getIntent().getStringExtra("UserName");
        String userpass=getIntent().getStringExtra("Password");
        TextView UserNameTV=(TextView)findViewById(R.id.userNameEditText);
        TextView PasswordTV=(TextView)findViewById(R.id.userPassEditText);
        UserNameTV.setText(username);
        PasswordTV.setText(userpass);
    }

}
